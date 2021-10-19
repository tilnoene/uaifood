package classes;

// subclasse da superclasse usuario.

import java.io.IOException;
import classes.ManipuladorArquivo;
import java.util.ArrayList;

// dados especificos: codigo do cliente e endereço.

public class Cliente extends Usuario {
    private int codCliente;
    private String endereco;

    public Cliente(int codCliente, String endereco, String cpf, String nome, String email, String senha, String dataDeNascimento, String telefone) {
        super(cpf, nome, email, senha, dataDeNascimento, telefone);
        this.codCliente = codCliente;
        this.endereco = endereco;
    }

    @Override
    public void init() throws IOException {
        // decidi o id (único) do cliente e o salva no banco de dados
        int curr_id = 0;
        
        try {
            ArrayList<Cliente> clientes = ManipuladorArquivo.carregarClientes();
            
            if (clientes.size() > 0)
                curr_id = clientes.get(clientes.size()-1).getCodCliente()+1;
        } catch(IOException ex) {
            curr_id = 0;
        }
        
        this.setCodCliente(curr_id);
        ManipuladorArquivo.armazenar(this);
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.codCliente) + ";"
                + this.endereco + ";"
                + this.cpf + ";"
                + this.nome + ";"
                + this.email + ";"
                + this.senha + ";"
                + this.dataDeNascimento + ";"
                + this.telefone;
    }
    
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

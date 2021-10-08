package classes;

// subclasse da superclasse usuario.

import java.io.IOException;
import classes.ManipuladorArquivo;
import java.util.ArrayList;

// dados especificos: codigo do cliente e endereço.

public class Cliente extends Usuario{
    private int codCliente;
    private String endereco;

    public Cliente(int codCliente, String endereco, String cpf, String nome, String email, String senha, String dataDeNascimento, String telefone) {
        super(cpf, nome, email, senha, dataDeNascimento, telefone);
        this.codCliente = codCliente;
        this.endereco = endereco;
    }

    public void init() throws IOException {
        int curr_id = 0;
        
        try {
            ArrayList<Cliente> clientes = ManipuladorArquivo.carregarClientes();
            
            if (clientes.size() > 0)
                curr_id = clientes.get(clientes.size()-1).getCodCliente()+1;
        } catch(IOException ex) {
            curr_id = 0;
        }
        
        this.setCodCliente(curr_id);
        ManipuladorArquivo.armazenarCliente(this);
    }
    
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

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    @Override
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

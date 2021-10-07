package classes;

// subclasse da superclasse usuario.

import java.io.IOException;
import classes.ManipuladorArquivo;

// dados especificos: codigo do cliente e endereço.

public class Cliente extends Usuario{
    private int codCliente;
    private String endereco;

    public Cliente(int codCliente, String endereco, String cpf, String nome, String email, String senha, String dataDeNascimento, String telefone) {
        super(cpf, nome, email, senha, dataDeNascimento, telefone);
        this.codCliente = codCliente;
        this.endereco = endereco;
    }

    public void armazenarCliente() throws IOException {
        ManipuladorArquivo.armazenarCliente(this);
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

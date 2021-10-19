package classes;

// Classe do usuario
// Superclasse das subclasses Cliente e Motoboy

import java.io.IOException;

public abstract class Usuario {
    protected String cpf;
    protected String nome;
    protected String email;
    protected String senha;
    protected String dataDeNascimento;
    protected String telefone;

    public Usuario(String cpf, String nome, String email, String senha, 
            String dataDeNascimento, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
    }
    
    // função responsável por salvar a classe no banco de dados e decidir seu id
    public abstract void init() throws IOException;
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
}

package classes;

import jdk.jfr.Timestamp;

/* subclasse da superclasse usuario.
// dados especificos: codigo do motoboy, inico e fim de expediente, 
comissao, disponibilidade;
*/

public class Motoboy extends Usuario{
    private int codMotoboy;
    private static Timestamp inicioExpediente; //timestamp sera usado para pegar
    private static Timestamp finalExpediente; // o horario de expediente, provavelmente sera mudado para uma string apenas
    private float comissao;
    private boolean disponibilidade;

    public Motoboy(int codMotoboy, float comissao, boolean disponibilidade, 
            String cpf, String nome, String email, String senha, 
            String dataDeNascimento, String telefone) {
        
        super(cpf, nome, email, senha, dataDeNascimento, telefone);
        this.codMotoboy = codMotoboy;
        this.comissao = comissao;
        this.disponibilidade = disponibilidade;
    }

    public int getCodMotoboy() {
        return codMotoboy;
    }

    public void setCodMotoboy(int codMotoboy) {
        this.codMotoboy = codMotoboy;
    }

    public static Timestamp getInicioExpediente() {
        return inicioExpediente;
    }

    public static void setInicioExpediente(Timestamp inicioExpediente) {
        Motoboy.inicioExpediente = inicioExpediente;
    }

    public static Timestamp getFinalExpediente() {
        return finalExpediente;
    }

    public static void setFinalExpediente(Timestamp finalExpediente) {
        Motoboy.finalExpediente = finalExpediente;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
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

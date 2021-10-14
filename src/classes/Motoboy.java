package classes;

import java.io.IOException;
import java.util.ArrayList;
import jdk.jfr.Timestamp;

/* subclasse da superclasse usuario.
// dados especificos: codigo do motoboy, inico e fim de expediente, 
comissao, disponibilidade;
*/

public class Motoboy extends Usuario{
    private int codMotoboy;
    private String inicioExpediente;
    private String finalExpediente;
    private float comissao;
    private boolean disponibilidade;

    public Motoboy(int codMotoboy, float comissao, boolean disponibilidade, 
            String cpf, String nome, String email, String senha, 
            String dataDeNascimento, String telefone, 
            String inicioExpediente, String finalExpediente) {
        
        super(cpf, nome, email, senha, dataDeNascimento, telefone);
        this.codMotoboy = codMotoboy;
        this.comissao = comissao;
        this.disponibilidade = disponibilidade;
        this.inicioExpediente = inicioExpediente;
        this.finalExpediente = finalExpediente;
    }

    public void init() throws IOException {
        int curr_id = 0;
        
        try {
            ArrayList<Motoboy> motoboys = ManipuladorArquivo.carregarMotoboys();
            
            if (motoboys.size() > 0)
                curr_id = motoboys.get(motoboys.size()-1).getCodMotoboy()+1;
        } catch(IOException ex) {
            curr_id = 0;
        }
        
        this.setCodMotoboy(curr_id);
        ManipuladorArquivo.armazenarMotoboy(this);
    }
    
    // converte uma string no formato HH:mm em um inteiro com os minutos
    private int converterHorarioEmMinutos(String horario) {
        String[] horarioTemporario = horario.split(":");
        
        return Integer.parseInt(horarioTemporario[0])*60 + Integer.parseInt(horarioTemporario[1]);
    }
    
    public boolean getDisponibilidade() {
        String horarioAtual = String.valueOf(java.time.LocalTime.now()); 
        
        // converte os horarios para minutos (facilitar comparação)
        int tempoAtual = converterHorarioEmMinutos(horarioAtual);
        int tempoInicial = converterHorarioEmMinutos(inicioExpediente);
        int tempoFinal = converterHorarioEmMinutos(finalExpediente);
        
        /*System.out.println(tempoInicial);
        System.out.println(tempoAtual);
        System.out.println(tempoFinal);*/
        
        return disponibilidade && tempoAtual >= tempoInicial && tempoAtual <= tempoFinal;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.codMotoboy) + ";"
                + String.valueOf(this.comissao) + ";"
                + String.valueOf(this.disponibilidade) + ";"
                + this.cpf + ";"
                + this.nome + ";"
                + this.email + ";"
                + this.senha + ";"
                + this.dataDeNascimento + ";"
                + this.telefone + ";"
                + this.inicioExpediente + ";"
                + this.finalExpediente;
    }
    
    public int getCodMotoboy() {
        return codMotoboy;
    }

    public void setCodMotoboy(int codMotoboy) {
        this.codMotoboy = codMotoboy;
    }

    public String getInicioExpediente() {
        return inicioExpediente;
    }

    public void setInicioExpediente(String inicioExpediente) {
        this.inicioExpediente = inicioExpediente;
    }

    public String getFinalExpediente() {
        return finalExpediente;
    }

    public void setFinalExpediente(String finalExpediente) {
        this.finalExpediente = finalExpediente;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
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

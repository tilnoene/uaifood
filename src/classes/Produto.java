package classes;

public class Produto {
    //private int codProduto // provavelmente nao precisa redeclarar;
    private String nome;
    private float valor;
    private boolean alcoolico;
    private String categoria;
    private String descricao;
    private int diaDaPromocao;

    public Produto(String nome, float valor, boolean alcoolico, String categoria, String descricao, int diaDaPromocao) {
        this.nome = nome;
        this.valor = valor;
        this.alcoolico = alcoolico;
        this.categoria = categoria;
        this.descricao = descricao;
        this.diaDaPromocao = diaDaPromocao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isAlcoolico() {
        return alcoolico;
    }

    public void setAlcoolico(boolean alcoolico) {
        this.alcoolico = alcoolico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDiaDaPromocao() {
        return diaDaPromocao;
    }

    public void setDiaDaPromocao(int diaDaPromocao) {
        this.diaDaPromocao = diaDaPromocao;
    }
    
}

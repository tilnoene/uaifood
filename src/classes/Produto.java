package classes;

import java.io.IOException;
import java.util.ArrayList;
import classes.ManipuladorArquivo;

public class Produto {
    private int codProduto;
    private String nome;
    private float valor;
    private boolean alcoolico;
    private String categoria;
    private String descricao;
    private int diaDaPromocao;

    public Produto(int codProduto, String nome, float valor, boolean alcoolico, String categoria, String descricao, int diaDaPromocao) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.valor = valor;
        this.alcoolico = alcoolico;
        this.categoria = categoria;
        this.descricao = descricao;
        this.diaDaPromocao = diaDaPromocao;
    }
    
    public void init() throws IOException {
        int last_id = 1;
        
        try {
            ArrayList<Produto> produtos = ManipuladorArquivo.carregarProdutos();
            
            if (produtos.size() > 0)
                last_id = produtos.get(produtos.size()-1).getCodProduto();
        } catch(IOException ex) {
            last_id = 0;
        }
        
        this.setCodProduto(last_id+1);
        ManipuladorArquivo.armazenarProduto(this);
    }

    public String toString() {
        return String.valueOf(this.codProduto) + ";"
                + this.nome + ";"
                + String.valueOf(this.valor) + ";"
                + String.valueOf(this.alcoolico) + ";"
                + this.categoria + ";"
                + this.descricao + ";"
                + String.valueOf(this.diaDaPromocao);
    }
    
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
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

    public boolean getAlcoolico() {
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

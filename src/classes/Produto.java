package classes;

import java.io.IOException;
import java.util.ArrayList;
import classes.ManipuladorArquivo;
import java.util.Date;

public class Produto {
    private int codProduto;
    private String nome;
    private float valor;
    private boolean alcoolico;
    private String categoria;
    private String descricao;
    private int diaDaPromocao;
    
    public static String[] categorias = { "Carnes", "Japonesa", "Lanches", "Marmita", "Padarias", "Pizza", "Salgados", "Saudável", "Sorvetes", "Bebidas" };

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
        int curr_id = 0;
        
        try {
            ArrayList<Produto> produtos = ManipuladorArquivo.carregarProdutos();
            
            if (produtos.size() > 0)
                curr_id = produtos.get(produtos.size()-1).getCodProduto()+1;
        } catch(IOException ex) {
            curr_id = 0;
        }
        
        this.setCodProduto(curr_id);
        ManipuladorArquivo.armazenar(this);
    }

    public float getValorAtual() {
        // retorna valor atual processado e com desconto
        int hoje = new Date().getDay();
        return hoje == this.diaDaPromocao ? this.valor * 0.95f : this.valor;
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

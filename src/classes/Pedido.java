package classes;

import java.util.ArrayList;

public class Pedido {
    
    private int codPedido;
    private String tipoDePagamento;
    private float frete;
    private float precoTotal;
    private String endereco;

    Cliente cliente;
    Motoboy motoboy;
    ArrayList<ItemPedido> itens;
    
    public Pedido(int codPedido, String tipoDePagamento, float frete, float precoTotal, String endereco, Cliente cliente, Motoboy motoboy, ArrayList<ItemPedido> itens) {
        this.codPedido = codPedido;
        this.tipoDePagamento = tipoDePagamento;
        this.frete = frete;
        this.precoTotal = precoTotal;
        this.endereco = endereco;
        this.cliente = cliente;
        this.motoboy = motoboy;
        this.itens = itens;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

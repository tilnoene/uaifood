package classes;

public class Pedido {
    
    private int codPedido;
    private String tipoDePagamento;
    private float frete;
    private float precoTotal;
    private String endereco;

    public Pedido(int codPedido, String tipoDePagamento, float frete, float precoTotal, String endereco) {
        this.codPedido = codPedido;
        this.tipoDePagamento = tipoDePagamento;
        this.frete = frete;
        this.precoTotal = precoTotal;
        this.endereco = endereco;
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

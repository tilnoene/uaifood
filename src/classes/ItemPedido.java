package classes;
import classes.Produto;

public class ItemPedido {
    private int quantidade;
    private float subTotal;
    private Produto produto; // instancia da classe produto
    
    public ItemPedido(int quantidade, float subTotal, Produto produto) {
        this.quantidade = quantidade;
        this.subTotal = subTotal;
        this.produto = produto;
    }
    
    public float getSubTotalSemDesconto() {
        return quantidade * produto.getValor();
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
}

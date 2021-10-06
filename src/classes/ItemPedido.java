package classes;
import classes.Produto;

public class ItemPedido {
    private int quantidade;
    private float subTotal;
    private int codProduto;
    private Produto produto; // instancia da classe produto
    
    /* Possivel implentação melhor: receber o codigo do produto e colcoar de acordo
    com o que fopi cadastrado nos produtos.
    */
    public ItemPedido(int quantidade, float subTotal, int codProduto) {
        this.quantidade = quantidade;
        this.subTotal = subTotal;
        this.codProduto = codProduto;
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

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
       
    
}

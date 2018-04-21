package DCC192.ufjf.br;

public class Produtos {
    private float preco;
    private int codigoDoProduto;
    private String descricaoDoProduto;

    public Produtos() {
    }

    public Produtos(int codigoDoProduto, String descricaoDoProduto, float preco) {
        this.codigoDoProduto = codigoDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
        this.preco = preco;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  codigoDoProduto + " - " + descricaoDoProduto + " - " + preco;
    }
    
    
}

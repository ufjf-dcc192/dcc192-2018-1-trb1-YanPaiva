package DCC192.ufjf.br.Dados;


public class MoviPedidos {
    private Pedido numPedido;
    private Produtos codProduto;
    private int quatidade;
    private float precoDoProduto;
    private float valorConta;

    public MoviPedidos() {
    }

    public MoviPedidos(Pedido numPedido, Produtos codProduto, int quatidade, float precoDoProduto, float valorConta) {
        this.numPedido = numPedido;
        this.codProduto = codProduto;
        this.quatidade = quatidade;
        this.precoDoProduto = precoDoProduto;
        this.valorConta = valorConta;
    }

    public Pedido getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Pedido numPedido) {
        this.numPedido = numPedido;
    }

    public Produtos getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Produtos codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public float getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(float precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public float getValorConta() {
        return valorConta;
    }

    public void setValorConta(float valorConta) {
        this.valorConta = valorConta;
    }    
    
    @Override
    public String toString() {
        return  numPedido.getNumero() + " - " + codProduto.getDescricaoDoProduto() + " | " + quatidade + " * " + precoDoProduto + " = " + valorConta;
    }
    
}

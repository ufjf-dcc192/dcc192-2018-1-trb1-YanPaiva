/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.Dados;

/**
 *
 * @author YanNotebook
 */
public class Itens {
    private float preco;
    private String descricaoDoProduto;
    private String nome;
    private int codigoDoProduto;

    public Itens() {
    }
    
    public Itens(float preco, String descricaoDoProduto, int codigoDoProduto, String nome) {
        this.preco = preco;
        this.descricaoDoProduto = descricaoDoProduto;
        this.codigoDoProduto = codigoDoProduto;
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
}

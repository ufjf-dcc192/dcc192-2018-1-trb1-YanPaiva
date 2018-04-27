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
    private double preco;
    private String descricaoDoProduto;
    private String nome;
    private Integer codigoDoProduto;
    private Integer quantidade;

    public Itens() {
    }
    
    public Itens(double preco, String nome, Integer codigoDoProduto, String descricaoDoProduto) {
        this.preco = preco;
        this.descricaoDoProduto = descricaoDoProduto;
        this.codigoDoProduto = codigoDoProduto;
        this.nome = nome;
        this.quantidade = 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public Integer getCodigoDoProduto() {
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
 
}

package br.cefetrj.vendas.dominio;

import java.math.BigDecimal;

public class ItemVenda {

    private Produto produto;
    private Integer quantidade;

    @Override
    public String toString() {
        return  "" + produto + '\'' +
                quantidade +
                "\n";
    }

    public ItemVenda(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void alteraQuantidade(Integer quantidade) {

        if (quantidade == Integer.MAX_VALUE) { throw new IllegalStateException(); }
        this.quantidade = quantidade;
    }

    //public void setQuantidade(Integer quantidade) {      this.quantidade = quantidade;   } ///Isso viola o encapsulamento pois se alguma regra mudar terei que alterar em vários lugares

}

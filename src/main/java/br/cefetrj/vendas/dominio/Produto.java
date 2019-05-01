package br.cefetrj.vendas.dominio;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Objects;

public class Produto {


    private String nome;
    private BigDecimal precoUnitario;

    public Produto(String nome, BigDecimal precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    ///public void setNome(String nome) {       this.nome = nome;   }

    public String getPrecoUnitario() {
        NumberFormat formato = NumberFormat.getCurrencyInstance();
        return formato.format(precoUnitario);
    }

    /*public void setPrecoUnitario(BigDecimal precoUnitario) {        this.precoUnitario = precoUnitario;    }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof ItemVenda){
            //(ItemVenda)o.getProduto();

           // (ItemVenda)((ItemVenda) o).getProduto();
            Produto produto =  ((ItemVenda) o).getProduto();
            return nome.equals(produto.nome);

        }
        if (!((o instanceof Produto))) return false;
        Produto produto = (Produto) o;
        return nome.equals(produto.nome);
    }

    @Override
    public String toString() {
        return
                " Produto      |  precoUnitario   | QTD\n " +
                nome + '\'' +
                "     " +
                this.getPrecoUnitario() +
                "            ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

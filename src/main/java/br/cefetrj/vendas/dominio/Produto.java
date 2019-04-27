package br.cefetrj.vendas.dominio;

import java.util.Currency;

public class Produto {

    private String nome;
    private Currency precoUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Currency getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Currency precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}

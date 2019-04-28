package br.cefetrj.vendas.dominio;

import java.math.BigDecimal;
import java.util.Date;

public class VendaClass implements Venda {

    private Date data;
    private Cliente cliente;
    private ItemVenda item;
    private  Produto produto;

    public VendaClass(Date data,Cliente cliente, ItemVenda item, Produto produto) {
        this.data = data;
        this.cliente = cliente;
        this.item = item;
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    @Override
    public BigDecimal getTotal() {
        return null;
    }

    @Override
    public boolean estaQuitada() {
        //Verifica se uma venda está quitada ou não


        return false;
    }

    @Override
    public void registrarPagamento(BigDecimal valorParcela) {

    }
}

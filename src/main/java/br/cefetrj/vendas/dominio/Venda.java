package br.cefetrj.vendas.dominio;

import java.math.BigDecimal;

public interface Venda {

    BigDecimal getTotal();

    boolean estaQuitada(); //Verifica se uma venda está quitada ou não

    void registrarPagamento(BigDecimal valorParcela);

}

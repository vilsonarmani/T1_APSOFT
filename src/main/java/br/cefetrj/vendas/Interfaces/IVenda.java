package br.cefetrj.vendas.Interfaces;

import java.math.BigDecimal;

public interface IVenda {

    BigDecimal getTotal();

    boolean estaQuitada(); //Verifica se uma venda está quitada ou não

    void registrarPagamento(BigDecimal valorParcela);

}

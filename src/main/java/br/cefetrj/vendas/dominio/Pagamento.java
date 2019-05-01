package br.cefetrj.vendas.dominio;

import java.math.BigDecimal;
import java.util.Date;

public class Pagamento {
    private Date dataPagamento;
    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
        dataPagamento = new Date;
        
    }
}

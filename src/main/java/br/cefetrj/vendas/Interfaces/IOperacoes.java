package br.cefetrj.vendas.Interfaces;

import br.cefetrj.vendas.dominio.Cliente;
import br.cefetrj.vendas.dominio.Produto;

import java.util.HashMap;

public interface IOperacoes {
    public HashMap<Cliente, Produto> produtosPreferidos();
}

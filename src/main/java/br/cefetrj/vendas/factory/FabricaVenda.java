package br.cefetrj.vendas.factory;

import br.cefetrj.vendas.dominio.Cliente;
import br.cefetrj.vendas.dominio.ItemVenda;
import br.cefetrj.vendas.dominio.Produto;
import br.cefetrj.vendas.dominio.Venda;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FabricaVenda {

    public Venda newVenda(Cliente c, Map<Produto,Integer> itens){
        return new Venda(c,itens);
    }
}

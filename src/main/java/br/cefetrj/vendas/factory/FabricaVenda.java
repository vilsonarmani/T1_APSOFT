package br.cefetrj.vendas.factory;

import br.cefetrj.vendas.dominio.Cliente;
import br.cefetrj.vendas.dominio.ItemVenda;
import br.cefetrj.vendas.dominio.Produto;
import br.cefetrj.vendas.dominio.VendaClass;

import java.util.Date;
import java.util.HashMap;

public class FabricaVenda {


    public VendaClass criaVenda(Cliente cliente, HashMap<Produto,Integer> carrinho){

        ItemVenda item = new ItemVenda();

        Produto produto = new Produto();

        VendaClass venda = new VendaClass(new Date(), cliente, item, produto);




        return  venda;


    }

}

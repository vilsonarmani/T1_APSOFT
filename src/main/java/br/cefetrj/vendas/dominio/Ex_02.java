
package br.cefetrj.vendas.dominio;

//import br.cefetrj.vendas.dominio.*;
import br.cefetrj.vendas.factory.FactoryVenda;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Ex_02 {

    public static void main(String[] args) {


        FactoryVenda fv = new FactoryVenda();

        Endereco endereco = new Endereco("Rua 1", "134-A", "Boa Vista", "Jaguará", "RJ");
        CPF cpf = new CPF("420.808.810-94");
        Telefone telefone = new Telefone("21", "3572-1177");
        Cliente c = new Cliente("Cliente", endereco, cpf,telefone  );
        Map<Produto,Integer> itens = new HashMap<>();
        
        for(int i=0;i<3;i++){             
            Produto p = new Produto("Produto"+i, BigDecimal.valueOf(i));
            ItemVenda item = new ItemVenda(p,i);
            itens.put(item.getProduto(),item.getQuantidade());
        }

        fv.newVenda(c, itens);
        
        Venda v = fv.newVenda(c, itens);

        //System.out.println("Vendas");
        System.out.println(v.toString());

        Produto p = new Produto("Produto10",  BigDecimal.valueOf(10));
        ItemVenda item = new ItemVenda(p,10);
        itens.put(item.getProduto(),item.getQuantidade());

        v.novoItem(p,350);

        System.out.println("\n===============NOVO ITEM============\n");
        System.out.println(v.toString());

        v.atualizaItem(p, 30);
        System.out.println("\n===============ATUALIZA============\n");
        System.out.println(v.toString());

        v.removeItem(p);
        System.out.println("\n===============REMOVE============\n");
        System.out.println(v.toString());


     //  System.out.println( fv.newVenda(c, itens).toString());
    }
    
}

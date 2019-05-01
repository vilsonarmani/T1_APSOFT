package br.cefetrj.vendas.dominio;

import br.cefetrj.vendas.Interfaces.IVenda;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.*;

public class Venda implements IVenda {

    private Date data;
    private Cliente cliente;
    private List<ItemVenda> listaItensVenda;
    private Produto produto;
    private List<Pagamento> listaPagamentos;

    public Date getData() {
        return data;
    }

    public Venda(Cliente cliente, Map<Produto, Integer> listaItensVenda) {

        data = new Date();

        this.cliente = cliente;
        /*this.listaItensVenda = new ArrayList<ItemVenda>();
        this.listaPagamentos = new ArrayList<Pagamento>();*/

        this.listaItensVenda = new ArrayList<>();
        this.listaPagamentos = new ArrayList<>();

        for (Produto p : listaItensVenda.keySet()) {
            this.listaItensVenda.add(new ItemVenda(p, listaItensVenda.get(p)));
        }
    }

    ///Questão 1.a -Implementação classes do domínio
    public void novoItem(Produto produto, Integer qtd) {

        if (listaItensVenda.indexOf(produto) == -1) {
            listaItensVenda.add(new ItemVenda(produto, qtd));
        }
    }

    ///Questão 1.a -Implementação classes do domínio
    public boolean removeItem(Produto produto) {
        if (listaItensVenda.indexOf(produto) != -1) {
            listaItensVenda.remove(produto);
            return true;
        } else
            return false;
    }

    ///Questão 1.a -Implementação classes do domínio
    public boolean atualizaItem(Produto produto, Integer qtd) {

        if (listaItensVenda.indexOf(produto) == -1)
            return false;

        listaItensVenda.get(listaItensVenda.indexOf(produto)).alteraQuantidade(qtd);
        return true;
    }




    @Override
    ///Questão 1.b -Implementação classes do domínio
    public BigDecimal getTotal() {

        BigDecimal somatorio = BigDecimal.ZERO;

        for (ItemVenda item : listaItensVenda) {
            if (item.getProduto() != null || (item.getProduto() instanceof Produto)) { ///programação defensiva
                somatorio.add(new BigDecimal(item.getProduto().getPrecoUnitario()));
            }
        }
        return somatorio;///retorna o somatório dos valores dos itens
    }

    @Override
    ///Questão 1.c -Implementação classes do domínio
    public boolean estaQuitada() {
        //Verifica se uma venda está quitada ou não
        BigDecimal totProdutos = getTotal();

        ///verifico se existe listaPagamentos pra não disperdiçar processamento
        if (totProdutos.compareTo(BigDecimal.ZERO) <= 0) return false;

        /// sumarizo os pagamentos
        BigDecimal totPago = BigDecimal.valueOf(0);

        for (Pagamento pgto : listaPagamentos) {
            if (pgto.getValor() != null || pgto.getValor().compareTo(BigDecimal.ZERO) <= 0) //defensiva
                totPago.add(pgto.getValor());
        }

        ///Faço uma comparação se o valor
        if (totPago.compareTo(totProdutos) >= 0)
            return true;
        else return false;
    }

    @Override
    ///Questão 1.c -Implementação classes do domínio
    public void registrarPagamento(BigDecimal valorParcela) {

        if (estaQuitada())     System.out.println("Essa venda já está quitada e não pode receber pagamentos");

        Pagamento parcela = new Pagamento();
        listaPagamentos.add(parcela);

        if(estaQuitada()) {
            System.out.println("Parabéns!\n Você não possui mais débitos.");
        }




    }

    @Override
    public String toString() {
        return "Venda{" +
                "\ndata=" + DateFormat.getDateInstance(DateFormat.MEDIUM).format(data) +
                ", \ncliente=" + cliente +
                ", \n" + listaItensVenda + "\n" +
                "\n----------------------------" +
                ", \nproduto=" + produto +
                "\n----------------------------" +
                ", \nlistaPagamentos=" + listaPagamentos +
                '}';
    }


}

package br.cefetrj.vendas.dominio;

public class Cliente {

    private String nome;

    private Endereco endereco;

    private CPF cpf;

    private Telefone telefone;

    public Cliente(String nome, Endereco endereco, CPF cpf, Telefone telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

//public Cliente(String nome) {
     //   this.nome = nome;
    //}


    @Override
    public String toString() {
        return "Cliente{" +
                "\nnome='" + nome + '\'' +
                ", \nendereco=" + endereco +
                ", \ncpf=" + cpf +
                ", \ntelefone=" + telefone +
                '}';
    }

    public String getNome() {
        return nome;
    }
}

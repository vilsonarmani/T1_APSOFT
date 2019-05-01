package br.cefetrj.vendas.dominio;

public class CPF {

    private String cpf;


    @Override
    public String toString() {
        return "CPF{" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    public CPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }


}

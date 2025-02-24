package br.com.alura.model;

import java.math.BigDecimal;

public class Terceirizado {

    private String nomeEmpresa;

    private final DadosPessoais dadosPessoais;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String nomeEmpresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNome(){
        return dadosPessoais.getNome();
    }

    public String getCpf(){
        return dadosPessoais.getCpf();
    }



}

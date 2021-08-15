package com.jcs.loteriascaixaapi.model;

public class Premiacao {

    private String nome;
    private int quantidadeGanhadores;
    private String premio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeGanhadores() {
        return quantidadeGanhadores;
    }

    public void setQuantidadeGanhadores(int quantidadeGanhadores) {
        this.quantidadeGanhadores = quantidadeGanhadores;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

}

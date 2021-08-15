package com.jcs.loteriascaixaapi.model;

import java.util.List;

public class MegaSena {

    private int concurso;
    private String dataDoConcurso;
    private String valorArrecadacaoTotal;
    private String localDoSorteio;
    private boolean acumulou;
    private List<Integer> dezenasSorteadas;
    private List<String> cidades;
    private List<Premiacao> premiacoes;
    private String valorEstimadoPremioProximoConcurso;
    private String valorAcumuladoEspecial;
    private String observacao;
    private int numeroDeGanhadoresSena;
    private int numeroDeGanhadoresQuina;
    private int numeroDeGanhadoresQuadra;
    private String premioSena;
    private String premioQuina;
    private String premioQuadra;

    public int getNumeroDeGanhadoresSena() {
        return numeroDeGanhadoresSena;
    }

    public void setNumeroDeGanhadoresSena(int numeroDeGanhadoresSena) {
        this.numeroDeGanhadoresSena = numeroDeGanhadoresSena;
    }

    public int getNumeroDeGanhadoresQuina() {
        return numeroDeGanhadoresQuina;
    }

    public void setNumeroDeGanhadoresQuina(int numeroDeGanhadoresQuina) {
        this.numeroDeGanhadoresQuina = numeroDeGanhadoresQuina;
    }

    public int getNumeroDeGanhadoresQuadra() {
        return numeroDeGanhadoresQuadra;
    }

    public void setNumeroDeGanhadoresQuadra(int numeroDeGanhadoresQuadra) {
        this.numeroDeGanhadoresQuadra = numeroDeGanhadoresQuadra;
    }

    public String getPremioSena() {
        return premioSena;
    }

    public void setPremioSena(String premioSena) {
        this.premioSena = premioSena;
    }

    public String getPremioQuina() {
        return premioQuina;
    }

    public void setPremioQuina(String premioQuina) {
        this.premioQuina = premioQuina;
    }

    public String getPremioQuadra() {
        return premioQuadra;
    }

    public void setPremioQuadra(String premioQuadra) {
        this.premioQuadra = premioQuadra;
    }

    public int getConcurso() {
        return concurso;
    }

    public void setConcurso(int concurso) {
        this.concurso = concurso;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDataDoConcurso() {
        return dataDoConcurso;
    }

    public void setDataDoConcurso(String dataDoConcurso) {
        this.dataDoConcurso = dataDoConcurso;
    }

    public String getValorArrecadacaoTotal() {
        return valorArrecadacaoTotal;
    }

    public void setValorArrecadacaoTotal(String valorArrecadacaoTotal) {
        this.valorArrecadacaoTotal = valorArrecadacaoTotal;
    }

    public String getLocalDoSorteio() {
        return localDoSorteio;
    }

    public void setLocalDoSorteio(String localDoSorteio) {
        this.localDoSorteio = localDoSorteio;
    }

    public boolean isAcumulou() {
        return acumulou;
    }

    public void setAcumulou(boolean acumulou) {
        this.acumulou = acumulou;
    }

    public List<Integer> getDezenasSorteadas() {
        return dezenasSorteadas;
    }

    public void setDezenasSorteadas(List<Integer> dezenasSorteadas) {
        this.dezenasSorteadas = dezenasSorteadas;
    }

    public List<String> getCidades() {
        return cidades;
    }

    public void setCidades(List<String> cidades) {
        this.cidades = cidades;
    }

    public List<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(List<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getValorEstimadoPremioProximoConcurso() {
        return valorEstimadoPremioProximoConcurso;
    }

    public void setValorEstimadoPremioProximoConcurso(String valorEstimadoPremioProximoConcurso) {
        this.valorEstimadoPremioProximoConcurso = valorEstimadoPremioProximoConcurso;
    }

    public String getValorAcumuladoEspecial() {
        return valorAcumuladoEspecial;
    }

    public void setValorAcumuladoEspecial(String valorAcumuladoEspecial) {
        this.valorAcumuladoEspecial = valorAcumuladoEspecial;
    }

}

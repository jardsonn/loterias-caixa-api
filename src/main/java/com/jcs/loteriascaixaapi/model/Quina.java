package com.jcs.loteriascaixaapi.model;

import java.util.List;

public class Quina {
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
    private String valorAcumulado;
    private int numeroDeGanhadoresQuina;
    private int numeroDeGanhadoresQuadra;
    private int numeroDeGanhadoresTerno;
    private int numeroDeGanhadoresDuque;
    private String premioQuina;
    private String premioQuadra;
    private String premioTerno;
    private String premioDuque;

    public int getConcurso() {
        return concurso;
    }

    public String getValorAcumulado() {
        return valorAcumulado;
    }

    public void setValorAcumulado(String valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }

    public void setConcurso(int concurso) {
        this.concurso = concurso;
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

    public void setValorEstimado(String valorEstimadoPremioProximoConcurso) {
        this.valorEstimadoPremioProximoConcurso = valorEstimadoPremioProximoConcurso;
    }

    public String getValorAcumuladoEspecial() {
        return valorAcumuladoEspecial;
    }

    public void setValorAcumuladoEspecial(String valorAcumuladoEspecial) {
        this.valorAcumuladoEspecial = valorAcumuladoEspecial;
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

    public int getNumeroDeGanhadoresTerno() {
        return numeroDeGanhadoresTerno;
    }

    public void setNumeroDeGanhadoresTerno(int numeroDeGanhadoresTerno) {
        this.numeroDeGanhadoresTerno = numeroDeGanhadoresTerno;
    }

    public int getNumeroDeGanhadoresDuque() {
        return numeroDeGanhadoresDuque;
    }

    public void setNumeroDeGanhadoresDuque(int numeroDeGanhadoresDuque) {
        this.numeroDeGanhadoresDuque = numeroDeGanhadoresDuque;
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

    public String getPremioTerno() {
        return premioTerno;
    }

    public void setPremioTerno(String premioTerno) {
        this.premioTerno = premioTerno;
    }

    public String getPremioDuque() {
        return premioDuque;
    }

    public void setPremioDuque(String premioDuque) {
        this.premioDuque = premioDuque;
    }
}

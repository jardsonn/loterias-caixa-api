package com.jcs.loteriascaixaapi.model;

import java.util.List;

public class Lotofacil {

    private int concurso;
    private String dataDoConcurso;
    private String valorArrecadacaoTotal;
    private String localDoSorteio;
    private int quantGanhadores15Dezenas;
    private int quantGanhadores14Dezenas;
    private int quantGanhadores13Dezenas;
    private int quantGanhadores12Dezenas;
    private int quantGanhadores11Dezenas;
    private String premio15Pontos;
    private String premio14Pontos;
    private String premio13Pontos;
    private String premio12Pontos;
    private String premio11Pontos;
    private String valorAcumulado15Numeros;
    private String valorEstimadoPremioProximoConcurso;
    private String valorAcumuladoEspecial;
    private boolean acumulou;
    private List<Integer> dezenasSorteadas;
    private List<String> cidades;
    private List<Premiacao> premiacoes;

    public int getConcurso() {
        return concurso;
    }

    public boolean isAcumulou() {
        return acumulou;
    }

    public void setAcumulou(boolean acumulou) {
        this.acumulou = acumulou;
    }

    public List<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(List<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
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

    public int getQuantGanhadores15Dezenas() {
        return quantGanhadores15Dezenas;
    }

    public void setQuantGanhadores15Dezenas(int quantGanhadores15Dezenas) {
        this.quantGanhadores15Dezenas = quantGanhadores15Dezenas;
    }

    public int getQuantGanhadores14Dezenas() {
        return quantGanhadores14Dezenas;
    }

    public void setQuantGanhadores14Dezenas(int quantGanhadores14Dezenas) {
        this.quantGanhadores14Dezenas = quantGanhadores14Dezenas;
    }

    public int getQuantGanhadores13Dezenas() {
        return quantGanhadores13Dezenas;
    }

    public void setQuantGanhadores13Dezenas(int quantGanhadores13Dezenas) {
        this.quantGanhadores13Dezenas = quantGanhadores13Dezenas;
    }

    public int getQuantGanhadores12Dezenas() {
        return quantGanhadores12Dezenas;
    }

    public void setQuantGanhadores12Dezenas(int quantGanhadores12Dezenas) {
        this.quantGanhadores12Dezenas = quantGanhadores12Dezenas;
    }

    public int getQuantGanhadores11Dezenas() {
        return quantGanhadores11Dezenas;
    }

    public void setQuantGanhadores11Dezenas(int quantGanhadores11Dezenas) {
        this.quantGanhadores11Dezenas = quantGanhadores11Dezenas;
    }

    public String getPremio15Pontos() {
        return premio15Pontos;
    }

    public void setPremio15Pontos(String premio15Pontos) {
        this.premio15Pontos = premio15Pontos;
    }

    public String getPremio14Pontos() {
        return premio14Pontos;
    }

    public void setPremio14Pontos(String premio14Pontos) {
        this.premio14Pontos = premio14Pontos;
    }

    public String getPremio13Pontos() {
        return premio13Pontos;
    }

    public void setPremio13Pontos(String premio13Pontos) {
        this.premio13Pontos = premio13Pontos;
    }

    public String getPremio12Pontos() {
        return premio12Pontos;
    }

    public void setPremio12Pontos(String premio12Pontos) {
        this.premio12Pontos = premio12Pontos;
    }

    public String getPremio11Pontos() {
        return premio11Pontos;
    }

    public void setPremio11Pontos(String premio11Pontos) {
        this.premio11Pontos = premio11Pontos;
    }

    public String getValorAcumulado15Numeros() {
        return valorAcumulado15Numeros;
    }

    public void setValorAcumulado15Numeros(String valorAcumulado15Numeros) {
        this.valorAcumulado15Numeros = valorAcumulado15Numeros;
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

    public boolean acumulou() {
        return acumulou;
    }

    public void hasAcumulou(boolean acumulou) {
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

    public String getLocalDoSorteio() {
        return localDoSorteio;
    }

    public void setLocalDoSorteio(String localDoSorteio) {
        this.localDoSorteio = localDoSorteio;
    }
}

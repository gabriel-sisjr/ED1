/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gabriel Santana
 */
public class Ordenacao {
    // Atributos
    private String nomeMetodo;
    private String tipoComparacao;
    private long comparacao;
    private long trocas;
    private double TempGasto;

    public Ordenacao(String nomeMetodo, String tipoComparacao, long comparacao, long trocas, double TempGasto) {
        this.nomeMetodo = nomeMetodo;
        this.tipoComparacao = tipoComparacao;
        this.comparacao = comparacao;
        this.trocas = trocas;
        this.TempGasto = TempGasto;
    }

    // Metodos Getters
    public String getNomeMetodo() {
        return nomeMetodo;
    }
    
    public String getTipoComparacao(){
        return tipoComparacao;
    }

    public long getComparacao() {
        return comparacao;
    }

    public long getTrocas() {
        return trocas;
    }

    public double getTempGasto() {
        return TempGasto;
    }

    // Metodos Setters
    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }
    
    public void setTipoComparacao(String tipoComparacao){
        this.tipoComparacao = tipoComparacao;
    }

    public void setComparacao(long comparacao) {
        this.comparacao = comparacao;
    }

    public void setTrocas(long trocas) {
        this.trocas = trocas;
    }

    public void setTempGasto(double TempGasto) {
        this.TempGasto = TempGasto;
    }
}

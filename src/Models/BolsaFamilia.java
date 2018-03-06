/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gabriel
 */
public class BolsaFamilia {
    // Atributos
    long id;
    String ufEstado;
    int codigoMunicipio;
    long nisFavorecido;
    String nomeMunicipio;
    String nomeFavorecido;
    float valorParcela;

    // Metodo Construtor
    public BolsaFamilia(long id, String ufEstado, int codigoMunicipio, String nomeMunicipio, long nisFavorecido, String nomeFavorecido, float valorParcela) {
        this.id = id;
        this.ufEstado = ufEstado;
        this.codigoMunicipio = codigoMunicipio;
        this.nomeMunicipio = nomeMunicipio;
        this.nisFavorecido = nisFavorecido;
        this.nomeFavorecido = nomeFavorecido;
        this.valorParcela = valorParcela;
    }

    public BolsaFamilia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Metodos Getters
    public long getId() {
        return id;
    }

    public String getUfEstado() {
        return ufEstado;
    }

    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public long getNisFavorecido() {
        return nisFavorecido;
    }

    public String getNomeFavorecido() {
        return nomeFavorecido;
    }

    public float getValorParcela() {
        return valorParcela;
    }
    
    // Metodos Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setUfEstado(String ufEstado) {
        this.ufEstado = ufEstado;
    }

    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public void setNisFavorecido(long nisFavorecido) {
        this.nisFavorecido = nisFavorecido;
    }

    public void setNomeFavorecido(String nomeFavorecido) {
        this.nomeFavorecido = nomeFavorecido;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }
}
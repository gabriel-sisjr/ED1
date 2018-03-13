/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Models.BolsaFamilia;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class InsertionSort {
    // Atributos
    public static long comparacao = 0;
    public static long troca = 0;
    public static long registro;

    public static long getComparacao(){
        return comparacao;
    }
    
    public static long getTroca(){
        return troca;
    }

    public static long resetaComparacao(){
        return InsertionSort.comparacao =0;
    }

    public static long resetaTroca(){
        return InsertionSort.troca=0;
    }
    
    // Ordenando por Id da linha
    public static ArrayList insertionSortId(ArrayList<BolsaFamilia> array) {
        int in, out;
        
        for(out=1; out<array.size(); out++){
            BolsaFamilia temp = array.get(out);
            in = out;
            comparacao++;
            while(in>0 && array.get(in-1).getId() >= temp.getId()){
                array.set(in, array.get(in-1));
                --in;
                troca++;
            }
            array.set(in, temp);
        }
        return array;
    }
    
    // Ordenando por UF
    public static ArrayList insertionSortUfEstado(ArrayList<BolsaFamilia> array) {
        int in, out;
        
        for(out=1; out<array.size(); out++){
            BolsaFamilia temp = array.get(out);
            in = out;
            
            comparacao++;
            while(in>0 && array.get(in-1).getUfEstado().compareTo(temp.getUfEstado())>= 0){
                array.set(in, array.get(in-1));
                --in;
                troca++;
            }
            array.set(in, temp);
        }
        return array;
    }
    
    // Ordenando por codigo municipio
    public static ArrayList insertionSortIdMunicipio(ArrayList<BolsaFamilia> array) {
        int in, out;
        
        for(out=1; out<array.size(); out++){
            BolsaFamilia temp = array.get(out);
            in = out;
            
            comparacao++;
            while(in>0 && array.get(in-1).getCodigoMunicipio()>= temp.getCodigoMunicipio()){
                array.set(in, array.get(in-1));
                --in;
                troca++;
            }
            array.set(in, temp);
        }
        return array;
    }
    
    // Ordenando por Nis favorecido
    public static ArrayList insertionSortNisFavorecido(ArrayList<BolsaFamilia> array) {
        int in, out;
        
        for(out=1; out<array.size(); out++){
            BolsaFamilia temp = array.get(out);
            in = out;
            
            comparacao++;
            while(in>0 && array.get(in-1).getNisFavorecido()>= temp.getNisFavorecido()){
                array.set(in, array.get(in-1));
                --in;
                troca++;
            }
            array.set(in, temp);
        }
        return array;
    }
    
    // Ordenando por nome cidade
    public static ArrayList insertionSortNomeMunicipio(ArrayList<BolsaFamilia> array) {
        int in, out;
        
        for(out=1; out<array.size(); out++){
            BolsaFamilia temp = array.get(out);
            in = out;
            
            comparacao++;
            while(in>0 && array.get(in-1).getNomeMunicipio().compareTo(temp.getNomeMunicipio())>= 0){
                array.set(in, array.get(in-1));
                --in;
                troca++;
            }
            array.set(in, temp);
        }
        return array;
    }
    
    // Ordenando por nome da pessoa
    public static ArrayList insertionSortNomeFavorecido(ArrayList<BolsaFamilia> array) {
        int in, out;
        
        for(out=1; out<array.size(); out++){
            BolsaFamilia temp = array.get(out);
            in = out;
            
            comparacao++;
            while(in>0 && array.get(in-1).getNomeFavorecido().compareTo(temp.getNomeFavorecido())>= 0){
                array.set(in, array.get(in-1));
                --in;
                troca++;
            }
            array.set(in, temp);
        }
        return array;
    }
    
    // Ordenando por valor da parcela
    public static ArrayList insertionSortValorParcela(ArrayList<BolsaFamilia> array) {
        int in, out;
        
        for(out=1; out<array.size(); out++){
            BolsaFamilia temp = array.get(out);
            in = out;
            
            comparacao++;
            while(in>0 && array.get(in-1).getValorParcela()>= temp.getValorParcela()){
                array.set(in, array.get(in-1));
                --in;
                troca++;
            }
            array.set(in, temp);
        }
        return array;
    }
}

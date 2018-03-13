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
public class SelectionSort {
    
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
        return SelectionSort.comparacao=0;
    }

    public static long resetaTroca(){
        return SelectionSort.troca=0;
    }
    
    public static ArrayList selectionSortId(ArrayList<BolsaFamilia> array){
        int i, j, min;
        BolsaFamilia temp;
        
        for(i=0; i<array.size()-1; i++){
            min = i;
            
            for(j= (i+1); j<array.size();  j++){
                comparacao++;
                if(array.get(j).getId()< array.get(min).getId()){
                    min = j;
                }
            } 
            temp = array.get(min);
            array.set(min, array.get(i));
            array.set(i, temp);
            troca++;
        }
        return array;
    }
    
    public static ArrayList selectionSortUfEstado(ArrayList<BolsaFamilia> array){
        int i, j, min;
        BolsaFamilia temp;
        
        for(i=0; i<array.size()-1; i++){
            min = i;
            
            for(j= (i+1); j<array.size();  j++){
                comparacao++;
                if(array.get(j).getUfEstado().compareTo(array.get(min).getUfEstado())< 0){
                    min = j;
                }
            }
            temp = array.get(min);
            array.set(min, array.get(i));
            array.set(i, temp);
            troca++;
        }
        return array;
    }
    
    public static ArrayList selectionSortCodigoMunicipio(ArrayList<BolsaFamilia> array){
        int i, j, min;
        BolsaFamilia temp;
        
        for(i=0; i<array.size()-1; i++){
            min = i;
            
            for(j= (i+1); j<array.size();  j++){
                comparacao++;
                if(array.get(j).getCodigoMunicipio()< array.get(min).getCodigoMunicipio())
                    min = j;
            } 
            temp = array.get(min);
            array.set(min, array.get(i));
            array.set(i, temp);
            troca++;
        }
        return array;
    }
    
    
    public static ArrayList selectionSortNomeMunicipio(ArrayList<BolsaFamilia> array){
        int i, j, min;
        BolsaFamilia temp;
        
        for(i=0; i<array.size()-1; i++){
            min = i;
            
            for(j= (i+1); j<array.size();  j++){
                comparacao++;
                if(array.get(j).getNomeMunicipio().compareTo(array.get(min).getNomeMunicipio())< 0)
                    min = j;
            }
            temp = array.get(min);
            array.set(min, array.get(i));
            array.set(i, temp);
            troca++;
        }
        return array;
    }
    
    public static ArrayList selectionSortNisFavorecido(ArrayList<BolsaFamilia> array){
        int i, j, min;
        BolsaFamilia temp;
        
        for(i=0; i<array.size()-1; i++){
            min = i;
            
            for(j= (i+1); j<array.size();  j++){
                comparacao++;
                if(array.get(j).getNisFavorecido()< array.get(min).getNisFavorecido())
                    min = j;
            }
            temp = array.get(min);
            array.set(min, array.get(i));
            array.set(i, temp);
            troca++;
        }
        return array;
    }
    
    public static ArrayList selectionSortNomeFavorecido(ArrayList<BolsaFamilia> array){
        int i, j, min;
        BolsaFamilia temp;
        
        for(i=0; i<array.size()-1; i++){
            min = i;
            
            for(j= (i+1); j<array.size();  j++){
                comparacao++;
                if(array.get(j).getNomeFavorecido().compareTo(array.get(min).getNomeFavorecido())< 0)
                    min = j;
            }
            temp = array.get(min);
            array.set(min, array.get(i));
            array.set(i, temp);
            troca++;
        }
        return array;
    }
    
    public static ArrayList selectionSortValorBeneficio(ArrayList<BolsaFamilia> array){
        int i, j, min;
        BolsaFamilia temp;
        
        for(i=0; i<array.size()-1; i++){
            min = i;
            
            for(j= (i+1); j<array.size();  j++){
                comparacao++;
                if(array.get(j).getValorParcela() < array.get(min).getValorParcela())
                    min = j;
            }
            temp = array.get(min);
            array.set(min, array.get(i));
            array.set(i, temp);
            troca++;
        }
        return array;
    }
}
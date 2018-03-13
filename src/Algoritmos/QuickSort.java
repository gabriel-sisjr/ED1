/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Models.BolsaFamilia;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author janth
 */
public class QuickSort {
    // Atributos
    public static long comparacao = 0;
    public static long trocas = 0;
    public static long registro;

    public static long getComparacao(){
        return comparacao;
    }
    
    public static long getTroca(){
        return trocas;
    }

    public static long resetaComparacao(){
        return QuickSort.comparacao =0;
    }

    public static long resetaTroca(){
        return QuickSort.trocas=0;
    }
    
    // Ordenando por ID.
     public static void QuickSortOrdenadoPorID(ArrayList<BolsaFamilia> array, int inicio, int fim){
         comparacao++;
         if( inicio < fim)
         {
             int posicaoPivo = separarId(array,inicio,fim);
             QuickSortOrdenadoPorID(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorID(array, posicaoPivo+1, fim);
         } 
     }

    private static int separarId(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            comparacao++;
            if(array.get(i).getId()<= pivo.getId())
                 i++;
            else{
                comparacao++;
                if(pivo.getId() < array.get(f).getId())
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                       trocas++;
                   }
            }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    }
    
    // Ordenando por ID.
     public static void QuickSortOrdenadoPorUF(ArrayList<BolsaFamilia> array, int inicio, int fim){
         comparacao++;
         if( inicio < fim)
         {
             int posicaoPivo = separarUF(array,inicio,fim);
             QuickSortOrdenadoPorUF(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorUF(array, posicaoPivo+1, fim);
         } 
     }

    private static int separarUF(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            comparacao++;
            if(array.get(i).getUfEstado().compareTo(pivo.getUfEstado())<= 0)
                 i++;
            else{
                comparacao++;
                if(pivo.getUfEstado().compareTo(array.get(f).getUfEstado())< 0)
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                       trocas++;
                   }
            }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    }
    
    // Ordenando por ID.
     public static void QuickSortOrdenadoPorNIS(ArrayList<BolsaFamilia> array, int inicio, int fim){
         comparacao++;
         if( inicio < fim)
         {
             int posicaoPivo = separarNIS(array,inicio,fim);
             QuickSortOrdenadoPorNIS(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorNIS(array, posicaoPivo+1, fim);
         } 
     }

    private static int separarNIS(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            comparacao++;
            if(array.get(i).getNisFavorecido()<= pivo.getNisFavorecido())
                 i++;
            else{
                comparacao++;
                if(pivo.getNisFavorecido()< array.get(f).getNisFavorecido())
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                       trocas++;
                   }
            }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    }
    
    // Ordenando por ID Municipio.
     public static void QuickSortOrdenadoPorIDMunicipio(ArrayList<BolsaFamilia> array, int inicio, int fim){
         comparacao++;
         if( inicio < fim)
         {
             int posicaoPivo = separarIdMunicipio(array,inicio,fim);
             QuickSortOrdenadoPorIDMunicipio(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorIDMunicipio(array, posicaoPivo+1, fim);
         } 
     }

    private static int separarIdMunicipio(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            comparacao++;
            if(array.get(i).getCodigoMunicipio()<= pivo.getCodigoMunicipio())
                 i++;
            else{
                comparacao++;
                if(pivo.getCodigoMunicipio()< array.get(f).getCodigoMunicipio())
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                       trocas++;
                   }
            }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    }
    
    // Ordenando por ID.
     public static void QuickSortOrdenadoPorNomeMunicipio(ArrayList<BolsaFamilia> array, int inicio, int fim){
         comparacao++;
         if( inicio < fim)
         {
             int posicaoPivo = separarNomeMunicipio(array,inicio,fim);
             QuickSortOrdenadoPorNomeMunicipio(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorNomeMunicipio(array, posicaoPivo+1, fim);
         } 
     }

    private static int separarNomeMunicipio(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            comparacao++;
            if(array.get(i).getNomeMunicipio().compareTo(pivo.getNomeMunicipio())<= 0)
                 i++;
            else{
                comparacao++;
                if(pivo.getNomeMunicipio().compareTo(array.get(f).getNomeMunicipio())< 0)
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                       trocas++;
                   }
            }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    }
    
    // Ordenando por ID.
     public static void QuickSortOrdenadoPorNomePessoa(ArrayList<BolsaFamilia> array, int inicio, int fim){
         comparacao++;
         if( inicio < fim)
         {
             int posicaoPivo = separarNomePessoa(array,inicio,fim);
             QuickSortOrdenadoPorNomePessoa(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorNomePessoa(array, posicaoPivo+1, fim);
         } 
     }

    private static int separarNomePessoa(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            comparacao++;
            if(array.get(i).getNomeFavorecido().compareTo(pivo.getNomeFavorecido())<= 0)
                 i++;
            else{
                comparacao++;
                if(pivo.getNomeFavorecido().compareTo(array.get(f).getNomeFavorecido())< 0)
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                       trocas++;
                   }
            }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    }
    
    // Ordenando por ID.
     public static void QuickSortOrdenadoPorValor(ArrayList<BolsaFamilia> array, int inicio, int fim){
         comparacao++;
         if( inicio < fim)
         {
             int posicaoPivo = separarValor(array,inicio,fim);
             QuickSortOrdenadoPorValor(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorValor(array, posicaoPivo+1, fim);
         } 
     }

    private static int separarValor(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            comparacao++;
            if(array.get(i).getValorParcela()<= pivo.getValorParcela())
                 i++;
            else{
                comparacao++;
                if(pivo.getValorParcela()< array.get(f).getValorParcela())
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                       trocas++;
                   }
            }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    }
}

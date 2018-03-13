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
 * @author janth
 */
public class HeapSort {
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
        return HeapSort.comparacao =0;
    }

    public static long resetaTroca(){
        return HeapSort.troca=0;
    }
    
    // Ordenando por Codigo Municipio.
    public static void HeapSortOrdenadoPorId(ArrayList<BolsaFamilia> array){
        BuildHeapId(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            HeapifyId(array, i, 0);
	}
    }
    static void HeapifyId(ArrayList<BolsaFamilia> array, int n, int i){
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        comparacao++;
        if(child < n)
            if(array.get(child).getId()> array.get(max).getId())
                max = child;
        comparacao++;
        if(child + 1 < n)
            if(array.get(child + 1).getId()> array.get(max).getId())
                max = child + 1;
        comparacao++;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            HeapifyId(array, n, max);
            troca++;
        }         
    } 
    static void BuildHeapId(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			HeapifyId(array, array.size(), i);
    }
    
    // Ordenando por Uf Estado.
    public static void HeapSortOrdenadoPorUfEstado(ArrayList<BolsaFamilia> array){
        BuildHeapUfEstado(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            HeapifyUfEstado(array, i, 0);
	}
    }
    static void HeapifyUfEstado(ArrayList<BolsaFamilia> array, int n, int i){
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        comparacao++;
        if(child < n)
            if(array.get(child).getUfEstado().compareTo(array.get(max).getUfEstado())> 0)
                max = child;
        comparacao++;
        if(child + 1 < n)
            if(array.get(child + 1).getUfEstado().compareTo(array.get(max).getUfEstado())> 0)
                max = child + 1;
        comparacao++;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            HeapifyUfEstado(array, n, max);
            troca++;
        }         
    } 
    static void BuildHeapUfEstado(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			HeapifyUfEstado(array, array.size(), i);
    }
    
    // Ordenando por Codigo Municipio.
    public static void HeapSortOrdenadoPorCodigoMunicipio(ArrayList<BolsaFamilia> array){
        BuildHeapCodigoMunicipio(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            HeapifyCodigoMunicipio(array, i, 0);
	}
    }
    static void HeapifyCodigoMunicipio(ArrayList<BolsaFamilia> array, int n, int i){
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        comparacao++;
        if(child < n)
            if(array.get(child).getCodigoMunicipio()> array.get(max).getCodigoMunicipio())
                max = child;
        comparacao++;
        if(child + 1 < n)
            if(array.get(child + 1).getCodigoMunicipio()> array.get(max).getCodigoMunicipio())
                max = child + 1;
        comparacao++;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            HeapifyCodigoMunicipio(array, n, max);
            troca++;
        }         
    } 
    static void BuildHeapCodigoMunicipio(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			HeapifyCodigoMunicipio(array, array.size(), i);
	}
    
    // Ordenando por Nis favorecido.
    public static void HeapSortOrdenadoPorNisFavorecido(ArrayList<BolsaFamilia> array){
        BuildHeapNisFavorecido(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            HeapifyNisFavorecido(array, i, 0);
	}
    }
    static void HeapifyNisFavorecido(ArrayList<BolsaFamilia> array, int n, int i){
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        comparacao++;
        if(child < n)
            if(array.get(child).getNisFavorecido()> array.get(max).getNisFavorecido())
                max = child;
        comparacao++;
        if(child + 1 < n)
            if(array.get(child + 1).getNisFavorecido()> array.get(max).getNisFavorecido())
                max = child + 1;
        comparacao++;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            HeapifyNisFavorecido(array, n, max);
            troca++;
        }         
    } 
    static void BuildHeapNisFavorecido(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			HeapifyNisFavorecido(array, array.size(), i);
    }
    
    // Ordenando por nome do municipio.
    public static void HeapSortOrdenadoPorNomeMunicipio(ArrayList<BolsaFamilia> array){
        BuildHeapNomeMunicipio(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            HeapifyNomeMunicipio(array, i, 0);
	}
    }
    static void HeapifyNomeMunicipio(ArrayList<BolsaFamilia> array, int n, int i){
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        comparacao++;
        if(child < n)
            if(array.get(child).getNomeMunicipio().compareTo(array.get(max).getNomeMunicipio())> 0)
                max = child;
        comparacao++;
        if(child + 1 < n)
            if(array.get(child + 1).getNomeMunicipio().compareTo(array.get(max).getNomeMunicipio())> 0)
                max = child + 1;
        comparacao++;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            HeapifyNomeMunicipio(array, n, max);
            troca++;
        }         
    } 
    static void BuildHeapNomeMunicipio(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			HeapifyNomeMunicipio(array, array.size(), i);
    }
    
    // Ordenando por nome do favorecido.
    public static void HeapSortOrdenadoPorNomeFavorecido(ArrayList<BolsaFamilia> array){
        BuildHeapNomeFavorecido(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            HeapifyNomeFavorecido(array, i, 0);
	}
    }
    static void HeapifyNomeFavorecido(ArrayList<BolsaFamilia> array, int n, int i){
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        comparacao++;
        if(child < n)
            if(array.get(child).getNomeFavorecido().compareTo(array.get(max).getNomeFavorecido())> 0)
                max = child;
        comparacao++;
        if(child + 1 < n)
            if(array.get(child + 1).getNomeFavorecido().compareTo(array.get(max).getNomeFavorecido())> 0)
                max = child + 1;
        comparacao++;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            HeapifyNomeFavorecido(array, n, max);
            troca++;
        }         
    } 
    static void BuildHeapNomeFavorecido(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			HeapifyNomeFavorecido(array, array.size(), i);
    }

    // Ordenando por valor parcela.
    public static void HeapSortOrdenadoPorValorParcela(ArrayList<BolsaFamilia> array){
        BuildHeapValorParcela(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            HeapifyValorParcela(array, i, 0);
	}
    }
    static void HeapifyValorParcela(ArrayList<BolsaFamilia> array, int n, int i){
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        comparacao++;
        if(child < n)
            if(array.get(child).getValorParcela()> array.get(max).getValorParcela())
                max = child;
        comparacao++;
        if(child + 1 < n)
            if(array.get(child + 1).getValorParcela()> array.get(max).getValorParcela())
                max = child + 1;
        comparacao++;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            HeapifyValorParcela(array, n, max);
            troca++;
        }         
    } 
    static void BuildHeapValorParcela(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			HeapifyValorParcela(array, array.size(), i);
	}
}
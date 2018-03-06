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
    
    public static int tamanho;
       
    
    public static void HeapSortOrdenadoPorCodigoMunicipio(ArrayList<BolsaFamilia> array){
        BuildHeap(array);
		
        for (int i = array.size() - 1; i >= 1; i--) {
            
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);
            Heapify(array, i, 0);
	}
    }
    
    static void Heapify(ArrayList<BolsaFamilia> array, int n, int i)
    {
        int max;
        int child;
        
        child = 2 * i + 1;
        max = i;
        
        if(child < n)
            if(array.get(child).getCodigoMunicipio()> array.get(max).getCodigoMunicipio())
                max = child;
        if(child + 1 < n)
            if(array.get(child + 1).getCodigoMunicipio()> array.get(max).getCodigoMunicipio())
                max = child + 1;
        if(max != i)
        {
            BolsaFamilia temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
            Heapify(array, n, max);
        }         
    } 
    static void BuildHeap(ArrayList<BolsaFamilia> array) {
		for (int i = array.size() / 2 - 1; i >= 0; i--)
			Heapify(array, array.size(), i);
	}
}



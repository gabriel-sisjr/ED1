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
public class MergeSort {
    
    public static void MergeSortOrdenadoPorID(ArrayList<BolsaFamilia> array, ArrayList<BolsaFamilia> temp, int inicio, int fim){
        
        if(inicio < fim)
        {
            int meio = (inicio + fim / 2);
            MergeSortOrdenadoPorID(array,temp,inicio,meio);
            MergeSortOrdenadoPorID(array,temp,meio + 1, fim);
            intercalar(array, temp, inicio, meio, fim);
        }
        
    }

    private static void intercalar(ArrayList<BolsaFamilia> array, ArrayList<BolsaFamilia> temp, int inicio, int meio, int fim){
        
        for(int i = inicio; i<=fim; i++){
           temp.add(array.get(i)); 
        }
        int j = inicio;
        int k = meio = 1;
        
        for(int i = inicio; i <= fim; i++)
        {
            if(i > meio)
                array.set(k,temp.get(j++));
            else
                if(j > fim)
                    array.set(k,temp.get(i++));
                else 
                    if(temp.get(i).getId() < temp.get(j).getId())
                        array.set(i,temp.get(i++));
                    else
                        array.set(i,temp.get(j++));
        }
    }
    
}

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
    
    public static void MergeSortOrdenadoPorCodigoMunicipio(ArrayList<BolsaFamilia> array, int inicio, int fim){
        
        if(inicio < fim)
        {
            int meio = (inicio + fim / 2);
            MergeSortOrdenadoPorCodigoMunicipio(array,inicio,meio);
            MergeSortOrdenadoPorCodigoMunicipio(array, meio + 1, fim);
            intercalar(array, inicio, meio, fim);
        }
        
    }

    private static void intercalar(ArrayList<BolsaFamilia> array, int inicio, int meio, int fim){
        //p inicio
        //r final
        ArrayList<BolsaFamilia> temp = new ArrayList();
        int a = inicio;
        int b = meio+1;
        int h = 0;
        
        while(a <= meio &&  b <= fim)
        {
            if(array.get(a).getCodigoMunicipio() < array.get(b).getCodigoMunicipio())
            {
                temp.set(h++, array.get(a++));
            }else{
                temp.set(h++, array.get(b++));
            }
        }
        while(a <= meio)
        { 
            temp.set(h++,array.get(a++));
        }
        while(b <= fim)
        {
            temp.set(h++,array.get(b++));
        }
        for(h = 0; h < temp.size(); h++)
        {
            array.set(inicio++, temp.get(h));
        }
    }
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import GerenciadorArquivos.Arquivo;
import Models.BolsaFamilia;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author janth
 */
public class QuickSort {
    
     public static void QuickSortOrdenadoPorID(ArrayList<BolsaFamilia> array, int inicio, int fim) throws IOException{
        
         if( inicio < fim)
         {
             int posicaoPivo = separar(array,inicio,fim);
             QuickSortOrdenadoPorID(array, inicio, posicaoPivo-1);
             QuickSortOrdenadoPorID(array, posicaoPivo+1, fim);
         } 
     }

    private static int separar(ArrayList<BolsaFamilia> array, int inicio, int fim) {
        
       
        BolsaFamilia pivo = array.get(inicio);
        int i = inicio+1;
        int f = fim;
         
        while(i <= f)
        {
            if(array.get(i).getCodigoMunicipio()<= pivo.getCodigoMunicipio())
                 i++;
            else
                if(pivo.getCodigoMunicipio()< array.get(f).getCodigoMunicipio())
                     f--;
                else{
                       BolsaFamilia troca = array.get(i);
                       array.set(i, array.get(f));
                       array.set(f,troca); 
                       i++;
                       f--;
                   }
        }
        array.set(inicio,array.get(f));
        array.set(f,pivo);
        return f;
    
    }
    
}

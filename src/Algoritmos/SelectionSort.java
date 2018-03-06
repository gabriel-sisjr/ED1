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
    
    public static ArrayList selectionSortId(ArrayList<BolsaFamilia> array){
        int out, in, min;
        
        for(out=0; out<array.size()-1; out++){
            min = out;
            
            for(in= out+1; in<array.size(); in++){
                if(array.get(in).getId() < array.get(min).getId())
                    min = in;
                array.set(out, array.get(min));
                array.set(min, array.get(out));
            }
        }
        return array;
    }
    
    
    
    
}

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
public class ShellSort {
    // Ordenando por Id da linha
    public static ArrayList shellsortId(ArrayList<BolsaFamilia> array){
        int in, out;
        BolsaFamilia temp;
        
        int h=1;
        while(h<=array.size()/3)
            h = h*3+1;
        
        while(h>0){
            for(out = h; out<array.size(); out++){
                temp = array.get(out);
                in = out;
                
                while(in > h-1 && array.get(in-h).getId() >= temp.getId()){
                    array.set(in, array.get(in-h));
                    in -= h;
                }
                array.set(in, temp);
            }
            h = (h-1)/3;
        }
        return array;
    }
    
    // Ordenando por UF
    public static ArrayList shellsortUfEstado(ArrayList<BolsaFamilia> array){
        int in, out;
        BolsaFamilia temp;
        
        int h=1;
        while(h<=array.size()/3)
            h = h*3+1;
        
        while(h>0){
            for(out = h; out<array.size(); out++){
                temp = array.get(out);
                in = out;
                
                while(in > h-1 && array.get(in-h).getUfEstado().compareTo(temp.getUfEstado()) >= 0){
                    array.set(in, array.get(in-h));
                    in -= h;
                }
                array.set(in, temp);
            }
            h = (h-1)/3;
        }
        return array;
    }
    
    // Ordenando por codigo municipio
    public static ArrayList shellsortIdMunicipio(ArrayList<BolsaFamilia> array){
        int in, out;
        BolsaFamilia temp;
        
        int h=1;
        while(h<=array.size()/3)
            h = h*3+1;
        
        while(h>0){
            for(out = h; out<array.size(); out++){
                temp = array.get(out);
                in = out;
                
                while(in > h-1 && array.get(in-h).getCodigoMunicipio()>= temp.getCodigoMunicipio()){
                    array.set(in, array.get(in-h));
                    in -= h;
                }
                array.set(in, temp);
            }
            h = (h-1)/3;
        }
        return array;
    }
    
    // Ordenando por Nis favorecido
    public static ArrayList shellsortNisFavorecido(ArrayList<BolsaFamilia> array){
        int in, out;
        BolsaFamilia temp;
        
        int h=1;
        while(h<=array.size()/3)
            h = h*3+1;
        
        while(h>0){
            for(out = h; out<array.size(); out++){
                temp = array.get(out);
                in = out;
                
                while(in > h-1 && array.get(in-h).getNisFavorecido()>= temp.getNisFavorecido()){
                    array.set(in, array.get(in-h));
                    in -= h;
                }
                array.set(in, temp);
            }
            h = (h-1)/3;
        }
        return array;
    }
    
    // Ordenando por nome cidade
    public static ArrayList shellsortNomeMunicipio(ArrayList<BolsaFamilia> array){
        int in, out;
        BolsaFamilia temp;
        
        int h=1;
        while(h<=array.size()/3)
            h = h*3+1;
        
        while(h>0){
            for(out = h; out<array.size(); out++){
                temp = array.get(out);
                in = out;
                
                while(in > h-1 && array.get(in-h).getNomeMunicipio().compareTo(temp.getNomeMunicipio()) >= 0){
                    array.set(in, array.get(in-h));
                    in -= h;
                }
                array.set(in, temp);
            }
            h = (h-1)/3;
        }
        return array;
    }
    
    // Ordenando por nome da pessoa
    public static ArrayList shellsortNomeFavorecido(ArrayList<BolsaFamilia> array){
        int in, out;
        BolsaFamilia temp;
        
        int h=1;
        while(h<=array.size()/3)
            h = h*3+1;
        
        while(h>0){
            for(out = h; out<array.size(); out++){
                temp = array.get(out);
                in = out;
                
                while(in > h-1 && array.get(in-h).getNomeFavorecido().compareTo(temp.getNomeFavorecido()) >= 0){
                    array.set(in, array.get(in-h));
                    in -= h;
                }
                array.set(in, temp);
            }
            h = (h-1)/3;
        }
        return array;
    }
    
    // Ordenando por valor da parcela
    public static ArrayList shellsortValorParcela(ArrayList<BolsaFamilia> array){
        int in, out;
        BolsaFamilia temp;
        
        int h=1;
        while(h<=array.size()/3)
            h = h*3+1;
        
        while(h>0){
            for(out = h; out<array.size(); out++){
                temp = array.get(out);
                in = out;
                
                while(in > h-1 && array.get(in-h).getValorParcela()>= temp.getValorParcela()){
                    array.set(in, array.get(in-h));
                    in -= h;
                }
                array.set(in, temp);
            }
            h = (h-1)/3;
        }
        return array;
    }
}

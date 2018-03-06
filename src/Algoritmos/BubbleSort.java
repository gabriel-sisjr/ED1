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
public class BubbleSort {
    // Ordenando por Id da linha
    public static ArrayList bubbleSortId(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getId() > objetoIndiceMais1.getId()){
                    arrayBolsaFamilia.set(i, objetoIndiceMais1);
                    arrayBolsaFamilia.set(i+1, objetoIndice);
                }
            }
        }
        return arrayBolsaFamilia;
    }

    // Ordenando por UF
    public static ArrayList bubbleSortUfEstado(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getUfEstado().compareTo(objetoIndiceMais1.getUfEstado()) > 0) {
                    arrayBolsaFamilia.set(i, objetoIndiceMais1);
                    arrayBolsaFamilia.set(i+1, objetoIndice);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    // Ordenando por codigo municipio
    public static ArrayList bubbleSortIdMunicipio(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getCodigoMunicipio() > objetoIndiceMais1.getCodigoMunicipio()){
                    arrayBolsaFamilia.set(i, objetoIndiceMais1);
                    arrayBolsaFamilia.set(i+1, objetoIndice);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    // Ordenando por Nis favorecido
    public static ArrayList bubbleSortNisFavorecido(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getNisFavorecido() > objetoIndiceMais1.getNisFavorecido()){
                    arrayBolsaFamilia.set(i, objetoIndiceMais1);
                    arrayBolsaFamilia.set(i+1, objetoIndice);
                }
            }
        }
        return arrayBolsaFamilia;
    }

    // Ordenando por nome cidade
    public static ArrayList bubbleSortNomeMunicipio(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getNomeMunicipio().compareTo(objetoIndiceMais1.getNomeMunicipio()) > 0){
                    arrayBolsaFamilia.set(i, objetoIndiceMais1);
                    arrayBolsaFamilia.set(i+1, objetoIndice);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    // Ordenando por nome da pessoa
    public static ArrayList bubbleSortNomeFavorecido(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getNomeFavorecido().compareTo(objetoIndiceMais1.getNomeFavorecido()) > 0){
                    arrayBolsaFamilia.set(i, objetoIndiceMais1);
                    arrayBolsaFamilia.set(i+1, objetoIndice);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    // Ordenando por valor da parcela
    public static ArrayList bubbleSortValorParcela(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getValorParcela() > objetoIndiceMais1.getValorParcela()){
                    arrayBolsaFamilia.set(i, objetoIndiceMais1);
                    arrayBolsaFamilia.set(i+1, objetoIndice);
                }
            }
        }
        return arrayBolsaFamilia;
    }   
}
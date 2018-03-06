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

    // Ordenando por Id da linha.
    public static ArrayList bubbleSortId(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getId() > objetoIndiceMais1.getId())
                    Troca.troca(arrayBolsaFamilia, objetoIndice, objetoIndiceMais1, i);
            }
        }
        return arrayBolsaFamilia;
    }

    // Ordena, porem necessita revisao.
    public static ArrayList bubbleSortUfEstado(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getUfEstado().compareTo(objetoIndiceMais1.getUfEstado()) > 0 || objetoIndice.getUfEstado().compareTo(objetoIndiceMais1.getUfEstado()) == 0) {
                    Troca.troca(arrayBolsaFamilia, objetoIndice, objetoIndiceMais1, i);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    // Ordenando por Codigo do Municipio.
    public static ArrayList bubbleSortIdMunicipio(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getCodigoMunicipio() > objetoIndiceMais1.getCodigoMunicipio())
                    Troca.troca(arrayBolsaFamilia, objetoIndice, objetoIndiceMais1, i);
            }
        }
        return arrayBolsaFamilia;
    }
    
    public static ArrayList bubbleSortNisFavorecido(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getNisFavorecido() > objetoIndiceMais1.getNisFavorecido())
                    Troca.troca(arrayBolsaFamilia, objetoIndice, objetoIndiceMais1, i);
            }
        }
        return arrayBolsaFamilia;
    }

    // Ordendando por Nome do municipio, necessita revisar.
    public static ArrayList bubbleSortNomeMunicipio(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getNomeMunicipio().compareTo(objetoIndiceMais1.getNomeMunicipio()) > 0)
                    Troca.troca(arrayBolsaFamilia, objetoIndice, objetoIndiceMais1, i);
            }
        }
        return arrayBolsaFamilia;
    }
    
    public static ArrayList bubbleSortValorParcela(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (objetoIndice.getValorParcela() > objetoIndiceMais1.getValorParcela())
                    Troca.troca(arrayBolsaFamilia, objetoIndice, objetoIndiceMais1, i);
            }
        }
        return arrayBolsaFamilia;
    }   
}
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
                BolsaFamilia obj1 = arrayBolsaFamilia.get(i);
                BolsaFamilia obj2 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (obj1.getId() > obj2.getId()) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                    // Testando a gambiarra
                    arrayBolsaFamilia.remove(objetoIndiceMais1);
                    arrayBolsaFamilia.remove(objetoIndice);
                    arrayBolsaFamilia.add((i + 1), objetoIndice);
                    arrayBolsaFamilia.add(i, objetoIndiceMais1);
                }
            }
        }
        return arrayBolsaFamilia;
    }

    // Ordena, porem necessita revisao.
    public static ArrayList bubbleSortUfEstado(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia obj1 = arrayBolsaFamilia.get(i);
                BolsaFamilia obj2 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (obj1.getUfEstado().compareTo(obj2.getUfEstado()) > 0 || obj1.getUfEstado().compareTo(obj2.getUfEstado()) == 0) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                    // Testando a gambiarra
                    arrayBolsaFamilia.remove(objetoIndiceMais1);
                    arrayBolsaFamilia.remove(objetoIndice);
                    arrayBolsaFamilia.add((i + 1), objetoIndice);
                    arrayBolsaFamilia.add(i, objetoIndiceMais1);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    // Ordenando por Codigo do Municipio.
    public static ArrayList bubbleSortIdMunicipio(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia obj1 = arrayBolsaFamilia.get(i);
                BolsaFamilia obj2 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (obj1.getCodigoMunicipio() > obj2.getCodigoMunicipio()) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                    // Testando a gambiarra
                    arrayBolsaFamilia.remove(objetoIndiceMais1);
                    arrayBolsaFamilia.remove(objetoIndice);
                    arrayBolsaFamilia.add((i + 1), objetoIndice);
                    arrayBolsaFamilia.add(i, objetoIndiceMais1);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    public static ArrayList bubbleSortNisFavorecido(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia obj1 = arrayBolsaFamilia.get(i);
                BolsaFamilia obj2 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (obj1.getNisFavorecido() > obj2.getNisFavorecido()) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                    // Testando a gambiarra
                    arrayBolsaFamilia.remove(objetoIndiceMais1);
                    arrayBolsaFamilia.remove(objetoIndice);
                    arrayBolsaFamilia.add((i + 1), objetoIndice);
                    arrayBolsaFamilia.add(i, objetoIndiceMais1);
                }
            }
        }
        return arrayBolsaFamilia;
    }

    // Ordendando por Nome do municipio, necessita revisar.
    public static ArrayList bubbleSortNomeMunicipio(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia obj1 = arrayBolsaFamilia.get(i);
                BolsaFamilia obj2 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (obj1.getNomeMunicipio().compareTo(obj2.getNomeMunicipio()) > 0) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                    // Testando a gambiarra
                    arrayBolsaFamilia.remove(objetoIndiceMais1);
                    arrayBolsaFamilia.remove(objetoIndice);
                    arrayBolsaFamilia.add((i + 1), objetoIndice);
                    arrayBolsaFamilia.add(i, objetoIndiceMais1);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
    public static ArrayList bubbleSortValorParcela(ArrayList<BolsaFamilia> arrayBolsaFamilia) {
        for (int j = arrayBolsaFamilia.size() - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                BolsaFamilia obj1 = arrayBolsaFamilia.get(i);
                BolsaFamilia obj2 = arrayBolsaFamilia.get((i + 1));
                // Testando os itens
                if (obj1.getValorParcela()> obj2.getValorParcela()) {
                    BolsaFamilia objetoIndice = arrayBolsaFamilia.get(i);
                    BolsaFamilia objetoIndiceMais1 = arrayBolsaFamilia.get((i + 1));
                    // Testando a gambiarra
                    arrayBolsaFamilia.remove(objetoIndiceMais1);
                    arrayBolsaFamilia.remove(objetoIndice);
                    arrayBolsaFamilia.add((i + 1), objetoIndice);
                    arrayBolsaFamilia.add(i, objetoIndiceMais1);
                }
            }
        }
        return arrayBolsaFamilia;
    }
    
}

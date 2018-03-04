/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Models.BolsaFamilia;

/**
 *
 * @author Gabriel
 */
public class BubbleSort {

    public static void bubbleSortId(BolsaFamilia objeto1, BolsaFamilia objeto2) {
        int aux;
        int n1 = (int) objeto1.getCodigoMunicipio();
        int n2 = (int) objeto2.getCodigoMunicipio();
        
        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
    }

    public static void bubbleSortNomeMunicipio(BolsaFamilia objeto1, BolsaFamilia objeto2) {
    }
}

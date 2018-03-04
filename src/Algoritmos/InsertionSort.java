/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author Gabriel
 */
public class InsertionSort {

    public static void insertionSort(int[] vetorInteiro) {
        int j, key, i;

        for (j=1; j<vetorInteiro.length; j++) {
            key = vetorInteiro[j];
            for (i=j-1; (i>=0) && (vetorInteiro[i]>key); i--) {
                vetorInteiro[i+1] = vetorInteiro[i];
            }
            vetorInteiro[i+1] = key;
        }
    }
}

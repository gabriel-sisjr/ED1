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
public class Troca {
    public static void troca(ArrayList<BolsaFamilia> arrayBolsa, BolsaFamilia objetoI, BolsaFamilia objetoII, int i){
        arrayBolsa.remove(objetoII);
        arrayBolsa.remove(objetoI);
        arrayBolsa.add(i, objetoII);
        arrayBolsa.add((i+1), objetoI);
    }
}

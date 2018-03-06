/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Algoritmos.BubbleSort;
import Algoritmos.InsertionSort;
import Algoritmos.MergeSort;
import Algoritmos.QuickSort;
import Algoritmos.SelectionSort;
import Algoritmos.ShellSort;
import GerenciadorArquivos.Arquivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Run {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Lendo o arquivo
        File arquivo = new File("dados.txt");
        Arquivo classeLer = new Arquivo();

        // Itens bolsa familia
        ArrayList<BolsaFamilia> infoBolsa = new ArrayList<>();
        // Lendo o arquivo
        ArrayList leitura = classeLer.lerArquivo(arquivo);

        // ArrayList que será preenchido e organizado.
        for (int i = 0; i < leitura.size(); i++) {
            String linha = leitura.get(i).toString();
            String[] campoConvertido = linha.split(",");

            // Criando o objeto e adicionando ao arrayList do tipo BolsaFamilia
            BolsaFamilia info = new BolsaFamilia(i, campoConvertido[1], Integer.parseInt(campoConvertido[2]), campoConvertido[3],
                    Long.parseLong(campoConvertido[4]), campoConvertido[5], Float.parseFloat(campoConvertido[6]));

            infoBolsa.add(info);
        }

// ==================================================================================================
        // BUBBLESORT ========== PRONTO
       // ArrayList<BolsaFamilia> arrayOrdenado = new ArrayList<>();
       // arrayOrdenado = BubbleSort.bubbleSortUfEstado(infoBolsa);
        // Gravando o arrayOrdenado
        //classeLer.escreverArquivoOrganizado("bubbleSort/ordenadoPorUfEstado", arrayOrdenado);
        

// ==================================================================================================
        // INSERTION =========== PRONTO
//        ArrayList<BolsaFamilia> arrayInsertion = new ArrayList<>();
//        arrayInsertion = InsertionSort.insertionSortValorParcela(infoBolsa);
        // Gravando o arrayOrdenado
//        classeLer.escreverArquivoOrganizado("insertionSort/ordenadoPorValorParcela", arrayInsertion);


// ==================================================================================================
//        ArrayList<BolsaFamilia> arraySelection = new ArrayList<>();
//        arraySelection = SelectionSort.selectionSortId(infoBolsa);
//        // Gravando o arrayOrdenado
//        classeLer.escreverArquivoOrganizado("selectionSort/ordenadoPorID", arraySelection);


// ==================================================================================================
        // SHELLSORT =========== PRONTO
//        ArrayList<BolsaFamilia> arrayShell = new ArrayList<>();
//        arrayShell = ShellSort.shellsortValorParcela(infoBolsa);
        // Gravando o arrayOrdenado
//        classeLer.escreverArquivoOrganizado("shellSort/ordenadoPorValorParcela", arrayShell);


// ==================================================================================================
        // SHELLSORT =========== PRONTO
//        ArrayList<BolsaFamilia> arrayShell = new ArrayList<>();
//        arrayShell = ShellSort.shellsortValorParcela(infoBolsa);
        // Gravando o arrayOrdenado
//        classeLer.escreverArquivoOrganizado("shellSort/ordenadoPorValorParcela", arrayShell);

//=====================================================================================================
        //SelectionShort=============PRONTO
         // ArrayList<BolsaFamilia> arrayShell = new ArrayList<>();
        //  arrayShell = SelectionSort.selectionSortId(infoBolsa);
        // Gravando o arrayOrdenado
         //  classeLer.escreverArquivoOrganizado("SelectionSort/ordenadoPorValorParcela", arrayShell);
         
//======================================================================================================
  //      QuickSort.QuickSortOrdenadoPorID(infoBolsa, 0, infoBolsa.size()-1);
//        classeLer.escreverArquivoOrganizado("QuickSort/ordenadoPorIDM", infoBolsa);
        
//======================================================================================================
    
        ArrayList<BolsaFamilia> Temp = new ArrayList<>();
       MergeSort.MergeSortOrdenadoPorID(infoBolsa, Temp, 0, infoBolsa.size()-1);
       classeLer.escreverArquivoOrganizado("MergeSort/ordenadoPorID", infoBolsa);
        
    }
}

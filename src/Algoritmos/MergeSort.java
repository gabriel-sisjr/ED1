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
 * @author janth
 */
public class MergeSort {
    // Atributos
    public static long comparacao = 0;
    public static long troca = 0;
    public static long registro;

    public static long getComparacao(){
        return comparacao;
    }
    
    public static long getTroca(){
        return troca;
    }

    public static long resetaComparacao(){
        return MergeSort.comparacao =0;
    }

    public static long resetaTroca(){
        return MergeSort.troca=0;
    }
    
    //Ordenar por ID 
    public static ArrayList MergeSortID(ArrayList<BolsaFamilia> array){
        
        ArrayList<BolsaFamilia> esquerda = new ArrayList<BolsaFamilia>();
        ArrayList<BolsaFamilia> direita = new ArrayList<BolsaFamilia>();
        int centro;
        
        comparacao++;
        if(array.size()==1)
        {
            return array;
        }else{
            centro = array.size()/2;
//            copie a metade esquerda inteira para a esquerda.

            for(int i = 0; i < centro; i++)
                esquerda.add(array.get(i));
            
//           copie a metade direita inteira no novo arraylista
            for(int i = centro; i < array.size(); i++)
                direita.add(array.get(i));
            
//            Classifique as metades esquerda e direita do arraylista.
            esquerda = MergeSortID(esquerda);
            direita = MergeSortID(direita);
            
//            Junte os resultados novamente.
            MergeId(esquerda, direita, array);
        }
            
        return array;
    }

    private static void MergeId(ArrayList<BolsaFamilia> esquerda, ArrayList<BolsaFamilia> direita, ArrayList<BolsaFamilia> array) {
        
        int IndEsq = 0;
        int IndDir = 0;
        int IndArr = 0;
        
        while(IndEsq < esquerda.size() && IndDir < direita.size()){
            comparacao++;
            if(esquerda.get(IndEsq).getId()< direita.get(IndDir).getId()){
                array.set(IndArr,esquerda.get(IndEsq));
                IndEsq++;
                troca++;
            }else{
                array.set(IndArr,direita.get(IndDir));
                IndDir++;
                troca++;
            }
            IndArr++;
        }
        
        ArrayList<BolsaFamilia> aux;
        int IndAux;
        comparacao++;
        if(IndEsq >= esquerda.size()){
            aux = direita;
            IndAux = IndDir;
        }else{
            aux = esquerda;
            IndAux = IndEsq;
        }
        for(int i = IndAux; i < aux.size(); i++){
            array.set(IndArr, aux.get(i));
            IndArr++;
        }
    }
    
    
    //Ordenar por ID Municipio
    public static ArrayList MergeSortIDMunicipio(ArrayList<BolsaFamilia> array){
        
        ArrayList<BolsaFamilia> esquerda = new ArrayList<BolsaFamilia>();
        ArrayList<BolsaFamilia> direita = new ArrayList<BolsaFamilia>();
        int centro;
        
        comparacao++;
        if(array.size()==1)
        {
            return array;
        }else{
            centro = array.size()/2;
//            copie a metade esquerda inteira para a esquerda.

            for(int i = 0; i < centro; i++)
                esquerda.add(array.get(i));
            
//           copie a metade direita inteira no novo arraylista
            for(int i = centro; i < array.size(); i++)
                direita.add(array.get(i));
            
//            Classifique as metades esquerda e direita do arraylista.
            esquerda = MergeSortIDMunicipio(esquerda);
            direita = MergeSortIDMunicipio(direita);
            
//            Junte os resultados novamente.
            MergeIdMunicipio(esquerda, direita, array);
        }
            
        return array;
    }

    private static void MergeIdMunicipio(ArrayList<BolsaFamilia> esquerda, ArrayList<BolsaFamilia> direita, ArrayList<BolsaFamilia> array) {
        
        int IndEsq = 0;
        int IndDir = 0;
        int IndArr = 0;
        
        while(IndEsq < esquerda.size() && IndDir < direita.size()){
            comparacao++;
            if(esquerda.get(IndEsq).getCodigoMunicipio() < direita.get(IndDir).getCodigoMunicipio()){
                array.set(IndArr,esquerda.get(IndEsq));
                IndEsq++;
                troca++;
            }else{
                array.set(IndArr,direita.get(IndDir));
                IndDir++;
                troca++;
            }
            IndArr++;
        }
        
        ArrayList<BolsaFamilia> aux;
        int IndAux;
        comparacao++;
        if(IndEsq >= esquerda.size()){
            aux = direita;
            IndAux = IndDir;
        }else{
            aux = esquerda;
            IndAux = IndEsq;
        }
        for(int i = IndAux; i < aux.size(); i++){
            array.set(IndArr, aux.get(i));
            IndArr++;
        }
    }
    
    //Ordenar por UF do Estado
    
    public static ArrayList MergeSortUfEstado(ArrayList<BolsaFamilia> array){
        
        ArrayList<BolsaFamilia> esquerda = new ArrayList<BolsaFamilia>();
        ArrayList<BolsaFamilia> direita = new ArrayList<BolsaFamilia>();
        int centro;
        
        comparacao++;
        if(array.size()==1)
        {
            return array;
        }else{
            centro = array.size()/2;
//            copie a metade esquerda inteira para a esquerda.

            for(int i = 0; i < centro; i++)
                esquerda.add(array.get(i));
            
//           copie a metade direita inteira no novo arraylista
            for(int i = centro; i < array.size(); i++)
                direita.add(array.get(i));
            
//            Classifique as metades esquerda e direita do arraylista.
            esquerda = MergeSortUfEstado(esquerda);
            direita = MergeSortUfEstado(direita);
            
//            Junte os resultados novamente.
            MergeUfEstado(esquerda, direita, array);
        }
            
        return array;
    }

    private static void MergeUfEstado(ArrayList<BolsaFamilia> esquerda, ArrayList<BolsaFamilia> direita, ArrayList<BolsaFamilia> array) {
        
        int IndEsq = 0;
        int IndDir = 0;
        int IndArr = 0;
        
        while(IndEsq < esquerda.size() && IndDir < direita.size()){
            comparacao++;
            if(esquerda.get(IndEsq).getUfEstado().compareTo(direita.get(IndDir).getUfEstado()) < 0){
                array.set(IndArr,esquerda.get(IndEsq));
                IndEsq++;
                troca++;
            }else{
                array.set(IndArr,direita.get(IndDir));
                IndDir++;
                troca++;
            }
            IndArr++;
        }
        
        ArrayList<BolsaFamilia> aux;
        int IndAux;
        comparacao++;
        if(IndEsq >= esquerda.size()){
            aux = direita;
            IndAux = IndDir;
        }else{
            aux = esquerda;
            IndAux = IndEsq;
        }
        for(int i = IndAux; i < aux.size(); i++){
            array.set(IndArr, aux.get(i));
            IndArr++;
        }
    }
    
//      Ordena Por Nome Municipio
    
    public static ArrayList MergeSortNomeMunicipio(ArrayList<BolsaFamilia> array){
        
        ArrayList<BolsaFamilia> esquerda = new ArrayList<BolsaFamilia>();
        ArrayList<BolsaFamilia> direita = new ArrayList<BolsaFamilia>();
        int centro;
        
        comparacao++;
        if(array.size()==1)
        {
            return array;
        }else{
            centro = array.size()/2;
//            copie a metade esquerda inteira para a esquerda.

            for(int i = 0; i < centro; i++)
                esquerda.add(array.get(i));
            
//           copie a metade direita inteira no novo arraylista
            for(int i = centro; i < array.size(); i++)
                direita.add(array.get(i));
            
//            Classifique as metades esquerda e direita do arraylista.
            esquerda = MergeSortNomeMunicipio(esquerda);
            direita = MergeSortNomeMunicipio(direita);
            
//            Junte os resultados novamente.
            MergeNomeMunicipio(esquerda, direita, array);
        }
            
        return array;
    }

    private static void MergeNomeMunicipio(ArrayList<BolsaFamilia> esquerda, ArrayList<BolsaFamilia> direita, ArrayList<BolsaFamilia> array) {
        
        int IndEsq = 0;
        int IndDir = 0;
        int IndArr = 0;
        
        while(IndEsq < esquerda.size() && IndDir < direita.size()){
            comparacao++;
            if(esquerda.get(IndEsq).getNomeMunicipio().compareTo(direita.get(IndDir).getNomeMunicipio()) < 0){
                array.set(IndArr,esquerda.get(IndEsq));
                IndEsq++;
                troca++;
            }else{
                array.set(IndArr,direita.get(IndDir));
                IndDir++;
                troca++;
            }
            IndArr++;
        }
        
        ArrayList<BolsaFamilia> aux;
        int IndAux;
        comparacao++;
        if(IndEsq >= esquerda.size()){
            aux = direita;
            IndAux = IndDir;
        }else{
            aux = esquerda;
            IndAux = IndEsq;
        }
        for(int i = IndAux; i < aux.size(); i++){
            array.set(IndArr, aux.get(i));
            IndArr++;
        }
    }

// Ordena por numero do NIS
    
    public static ArrayList MergeSortNisFavorecido(ArrayList<BolsaFamilia> array){
        
        ArrayList<BolsaFamilia> esquerda = new ArrayList<BolsaFamilia>();
        ArrayList<BolsaFamilia> direita = new ArrayList<BolsaFamilia>();
        int centro;
        
        comparacao++;
        if(array.size()==1)
        {
            return array;
        }else{
            centro = array.size()/2;
//            copie a metade esquerda inteira para a esquerda.

            for(int i = 0; i < centro; i++)
                esquerda.add(array.get(i));
            
//           copie a metade direita inteira no novo arraylista
            for(int i = centro; i < array.size(); i++)
                direita.add(array.get(i));
            
//            Classifique as metades esquerda e direita do arraylista.
            esquerda = MergeSortNisFavorecido(esquerda);
            direita = MergeSortNisFavorecido(direita);
            
//            Junte os resultados novamente.
            MergeNisFavorecido(esquerda, direita, array);
        }
            
        return array;
    }

    private static void MergeNisFavorecido(ArrayList<BolsaFamilia> esquerda, ArrayList<BolsaFamilia> direita, ArrayList<BolsaFamilia> array) {
        
        int IndEsq = 0;
        int IndDir = 0;
        int IndArr = 0;
        
        while(IndEsq < esquerda.size() && IndDir < direita.size()){
            comparacao++;
            if(esquerda.get(IndEsq).getNisFavorecido()< direita.get(IndDir).getNisFavorecido()){
                array.set(IndArr,esquerda.get(IndEsq));
                IndEsq++;
                troca++;
            }else{
                array.set(IndArr,direita.get(IndDir));
                IndDir++;
                troca++;
            }
            IndArr++;
        }
        
        ArrayList<BolsaFamilia> aux;
        int IndAux;
        comparacao++;
        if(IndEsq >= esquerda.size()){
            aux = direita;
            IndAux = IndDir;
        }else{
            aux = esquerda;
            IndAux = IndEsq;
        }
        for(int i = IndAux; i < aux.size(); i++){
            array.set(IndArr, aux.get(i));
            IndArr++;
        }
    }
    
   // Ordena por Nome do favorecido
    public static ArrayList MergeSortNomeFavorecido(ArrayList<BolsaFamilia> array){
        
        ArrayList<BolsaFamilia> esquerda = new ArrayList<BolsaFamilia>();
        ArrayList<BolsaFamilia> direita = new ArrayList<BolsaFamilia>();
        int centro;
        
        comparacao++;
        if(array.size()==1)
        {
            return array;
        }else{
            centro = array.size()/2;
//            copie a metade esquerda inteira para a esquerda.

            for(int i = 0; i < centro; i++)
                esquerda.add(array.get(i));
            
//           copie a metade direita inteira no novo arraylista
            for(int i = centro; i < array.size(); i++)
                direita.add(array.get(i));
            
//            Classifique as metades esquerda e direita do arraylista.
            esquerda = MergeSortNomeFavorecido(esquerda);
            direita = MergeSortNomeFavorecido(direita);
            
//            Junte os resultados novamente.
            MergeNomeFavorecido(esquerda, direita, array);
        }
            
        return array;
    }

    private static void MergeNomeFavorecido(ArrayList<BolsaFamilia> esquerda, ArrayList<BolsaFamilia> direita, ArrayList<BolsaFamilia> array) {
        
        int IndEsq = 0;
        int IndDir = 0;
        int IndArr = 0;
        
        while(IndEsq < esquerda.size() && IndDir < direita.size()){
            comparacao++;
            if(esquerda.get(IndEsq).getNomeFavorecido().compareTo(direita.get(IndDir).getNomeFavorecido()) < 0){
                array.set(IndArr,esquerda.get(IndEsq));
                IndEsq++;
                troca++;
            }else{
                array.set(IndArr,direita.get(IndDir));
                IndDir++;
                troca++;
            }
            IndArr++;
        }
        
        ArrayList<BolsaFamilia> aux;
        int IndAux;
        comparacao++;
        if(IndEsq >= esquerda.size()){
            aux = direita;
            IndAux = IndDir;
        }else{
            aux = esquerda;
            IndAux = IndEsq;
        }
        for(int i = IndAux; i < aux.size(); i++){
            array.set(IndArr, aux.get(i));
            IndArr++;
        }
    }
    
    //Ordena Por Valor do Beneficio
    
    public static ArrayList MergeSortValorBeneficio(ArrayList<BolsaFamilia> array){
        
        ArrayList<BolsaFamilia> esquerda = new ArrayList<BolsaFamilia>();
        ArrayList<BolsaFamilia> direita = new ArrayList<BolsaFamilia>();
        int centro;
        
        comparacao++;
        if(array.size()==1)
        {
            return array;
        }else{
            centro = array.size()/2;
//            copie a metade esquerda inteira para a esquerda.

            for(int i = 0; i < centro; i++)
                esquerda.add(array.get(i));
            
//           copie a metade direita inteira no novo arraylista
            for(int i = centro; i < array.size(); i++)
                direita.add(array.get(i));
            
//            Classifique as metades esquerda e direita do arraylista.
            esquerda = MergeSortValorBeneficio(esquerda);
            direita = MergeSortValorBeneficio(direita);
            
//            Junte os resultados novamente.
            MergeValorBeneficio(esquerda, direita, array);
        }
            
        return array;
    }

    private static void MergeValorBeneficio(ArrayList<BolsaFamilia> esquerda, ArrayList<BolsaFamilia> direita, ArrayList<BolsaFamilia> array) {
        
        int IndEsq = 0;
        int IndDir = 0;
        int IndArr = 0;
        
        while(IndEsq < esquerda.size() && IndDir < direita.size()){
            comparacao++;
            if(esquerda.get(IndEsq).getValorParcela()< direita.get(IndDir).getValorParcela()){
                array.set(IndArr,esquerda.get(IndEsq));
                IndEsq++;
                troca++;
            }else{
                array.set(IndArr,direita.get(IndDir));
                IndDir++;
                troca++;
            }
            IndArr++;
        }
        
        ArrayList<BolsaFamilia> aux;
        int IndAux;
        comparacao++;
        if(IndEsq >= esquerda.size()){
            aux = direita;
            IndAux = IndDir;
        }else{
            aux = esquerda;
            IndAux = IndEsq;
        }
        for(int i = IndAux; i < aux.size(); i++){
            array.set(IndArr, aux.get(i));
            IndArr++;
        }
    }
}  
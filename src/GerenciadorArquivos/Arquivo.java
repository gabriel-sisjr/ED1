/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciadorArquivos;

import Models.BolsaFamilia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Arquivo {
    
    public ArrayList lerArquivo(File arquivo) throws FileNotFoundException{
        File file = arquivo;
        ArrayList<String> arrayString = new ArrayList<>();
        
        try{
            FileReader leitor = new FileReader(file);
            BufferedReader entrada = new BufferedReader(leitor);
            
            int registro=0;
            
            String linhaLida;
            // Laço para retirar os caracteres
            while(entrada.ready()){
                    arrayString.add(entrada.readLine());
                    registro++;
            }
            
            System.out.println("O arquivo contem "+ registro + " registros.");
            leitor.close();
            entrada.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
        return arrayString;
    }
    
    public void escreverArquivoOrganizado(String nomeParaArquivo, ArrayList<BolsaFamilia> arrayInfoBolsa) throws IOException{
        File arquivo = new File("arquivosExportados/"+nomeParaArquivo + ".txt");
        
        try{
            FileWriter gravador = new FileWriter(arquivo);
            PrintWriter escritor = new PrintWriter(gravador);
            
            int registro=0;
            for(int i=0; i<arrayInfoBolsa.size(); i++){
                escritor.print(arrayInfoBolsa.get(i).getId()+",");
                escritor.print(arrayInfoBolsa.get(i).getUfEstado()+",");
                escritor.print(arrayInfoBolsa.get(i).getCodigoMunicipio()+",");
                escritor.print(arrayInfoBolsa.get(i).getNomeMunicipio()+",");
                escritor.print(arrayInfoBolsa.get(i).getNisFavorecido()+",");
                escritor.print(arrayInfoBolsa.get(i).getNomeFavorecido()+",");
                escritor.println(arrayInfoBolsa.get(i).getValorParcela()+"\n");
                registro++;
            }
            
            System.out.println("Inseriu no arquivo "+ registro + " registros. -> Metodo inserir organizado");
            // Fechando os streams
            escritor.close();
            gravador.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
        public ArrayList retirarTabulacao(File arquivo) throws FileNotFoundException{
        File file = arquivo;
        ArrayList<String> arrayString = new ArrayList<>();
        
        try{
            FileReader leitor = new FileReader(file);
            BufferedReader entrada = new BufferedReader(leitor);
            
            int registro=0;
            
            String linha;
            String linhaConvertida;
//            // Laço para retirar os caracteres
            while((linha = entrada.readLine()) != null){
                linhaConvertida = linha.replaceAll(";", "");
                if(arrayString.add(linhaConvertida))
                    registro++;
            }
            
            System.out.println("Retirando as tabulações de "+ registro + " registros.");
            leitor.close();
            entrada.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
        return arrayString;
    }
}
//    
//    public void escreverArquivo(String nomeParaArquivo, ArrayList<String> arrayStrings) throws IOException{
//        File arquivo = new File("arquivosExportados/"+nomeParaArquivo + ".txt");
//        
//        try{
//            FileWriter gravador = new FileWriter(arquivo);
//            PrintWriter escritor = new PrintWriter(gravador);
//            
//            int registro=0;
//            for (String frase : arrayStrings) {
//                escritor.println(frase);
//                registro++;
//            }
//            
//            System.out.println("Inseriu no arquivo "+ registro + " registros.");
//            // Fechando os streams
//            escritor.close();
//            gravador.close();
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
//    }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivosteste;

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
    public ArrayList retirarTabulacao(File arquivo) throws FileNotFoundException{
        File file = arquivo;
        ArrayList<String> arrayString = new ArrayList<>();
        
        try{
            FileReader leitor = new FileReader(file);
            BufferedReader entrada = new BufferedReader(leitor);
            
            int registro=0;
            
            String linha;
            String linhaConvertida;
//            String linhaConvertidaF;
            // Laço para retirar os caracteres
            while((linha = entrada.readLine()) != null){
                linhaConvertida = linha.replaceAll("\t", ",");
                if(arrayString.add(linhaConvertida))
                    registro++;
            }
            
            System.out.println("Retirando as tabulações de "+ registro + " registros.");
            entrada.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
        return arrayString;
    }
    
    public void escreverArquivo(String nomeParaArquivo, ArrayList<String> arrayStrings) throws IOException{
        File arquivo = new File(nomeParaArquivo + ".txt");
        
        try{
            FileWriter gravador = new FileWriter(arquivo);
            PrintWriter escritor = new PrintWriter(gravador);
            
            int registro=0;
            for (String frase : arrayStrings) {
                escritor.println(frase);
                registro++;
            }
            
            System.out.println("Inseriu no arquivo "+ registro + " registros.");
            // Fechando os streams
            escritor.close();
            gravador.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}

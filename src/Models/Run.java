/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

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
        File arquivo = new File("dados.txt");
        Arquivo classeLer = new Arquivo();
        
        // Itens bolsa familia
        ArrayList<BolsaFamilia> infoBolsa = new ArrayList<>();
        ArrayList leitura = classeLer.lerArquivo(arquivo);
        
        for(int i=0; i<leitura.size(); i++){
            String linha = leitura.get(i).toString();
            String[] campoConvertido = linha.split(",");
            
            // Criando o objeto e adicionando ao arrayList do tipo BolsaFamilia
            BolsaFamilia info = new BolsaFamilia(i, campoConvertido[1], Integer.parseInt(campoConvertido[2]),
                    campoConvertido[3], campoConvertido[4], campoConvertido[5], Float.parseFloat(campoConvertido[6]));
            
            infoBolsa.add(info);
        }
        
        classeLer.escreverArquivoOrganizado("2", infoBolsa);
    }
}

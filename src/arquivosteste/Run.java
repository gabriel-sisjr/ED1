/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivosteste;

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
        File arquivo = new File("Arquivo.txt");
        Arquivo classeLer = new Arquivo();
        ArrayList leitura = classeLer.retirarTabulacao(arquivo);
        classeLer.escreverArquivo("novoArquivo",leitura);
    }
}

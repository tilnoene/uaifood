/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxi;

/**
 *
 * @author Victor
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {

	public static String leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
                String ans = "";
		while (true) {
			if (linha != null) {
				ans += linha + "\n";

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
                
                return ans;
	}

	public static void escritor(String path, String linha) throws IOException {
            try {
                String texto = leitor(path) + linha;
            
                BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		
		buffWrite.append(texto + "\n");
		buffWrite.close();
            } catch (IOException ex) {
                BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		
		buffWrite.append(linha + "\n");
		buffWrite.close();
            }
	}

}

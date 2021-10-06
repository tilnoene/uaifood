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
import classes.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    public static ArrayList<Cliente> carregarClientes() throws IOException {
        // carrega os clientes do banco de dados
        String texto = ManipuladorArquivo.leitor("database/clientes.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Cliente> clientes = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            String[] linha = linhas[i].split(";");

            String cpf = linha[0];
            String nome = linha[1];
            String email = linha[2];
            String senha = linha[3];
            String dataDeNascimento = linha[4];
            String telefone = linha[5];
            int codCliente = Integer.parseInt(linha[6]);
            String endereco = linha[7];
            
            clientes.add(new Cliente(codCliente, endereco, cpf, nome, email, senha, dataDeNascimento, telefone));
        }

        return clientes;
    }
}

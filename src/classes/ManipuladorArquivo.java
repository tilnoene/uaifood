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
import classes.Motoboy;
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
            String texto = leitor(path) + linha; // permanece com o que já havia

            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

            buffWrite.append(texto + "\n");
            buffWrite.close();
        } catch (IOException ex) {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

            buffWrite.append(linha + "\n");
            buffWrite.close();
        }
    }
    
    // CRUD Cliente
    public static void armazenarCliente(Cliente cliente) throws IOException {
        String texto = 
                String.valueOf(cliente.getCodCliente()) + ";"
                + cliente.getEndereco() + ";"
                + cliente.getCpf() + ";"
                + cliente.getNome() + ";"
                + cliente.getEmail() + ";"
                + cliente.getSenha() + ";"
                + cliente.getDataDeNascimento() + ";"
                + cliente.getTelefone() +
                "\n";
        
        escritor("database/clientes.txt", texto);
    }
    
    public static ArrayList<Cliente> carregarClientes() throws IOException {
        // carrega os clientes do banco de dados
        String texto = leitor("database/clientes.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Cliente> clientes = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            String[] linha = linhas[i].split(";");

            int codCliente = Integer.parseInt(linha[0]);
            String endereco = linha[1];
            String cpf = linha[2];
            String nome = linha[3];
            String email = linha[4];
            String senha = linha[5];
            String dataDeNascimento = linha[6];
            String telefone = linha[7];

            clientes.add(new Cliente(codCliente, endereco, cpf, nome, email, senha, dataDeNascimento, telefone));
        }

        return clientes;
    }
    
    // CRUD Motoboy
    public static void armazenarMotoboy(Motoboy motoboy) throws IOException {
        String texto = 
                String.valueOf(motoboy.getCodMotoboy()) + ";"
                + String.valueOf(motoboy.getComissao()) + ";"
                + String.valueOf(motoboy.getDisponibilidade()) + ";"
                + motoboy.getCpf() + ";"
                + motoboy.getNome() + ";"
                + motoboy.getEmail() + ";"
                + motoboy.getSenha() + ";"
                + motoboy.getDataDeNascimento() + ";"
                + motoboy.getTelefone() +
                "\n";

        escritor("database/motoboys.txt", texto);
    }

    public static ArrayList<Motoboy> carregarMotoboys() throws IOException {
        // carrega os motoboys do banco de dados
        String texto = leitor("database/motoboys.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Motoboy> motoboys = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            String[] linha = linhas[i].split(";");

            int codMotoboy = Integer.parseInt(linha[0]);
            float comissao = Float.parseFloat(linha[1]);
            boolean disponibilidade = Boolean.valueOf(linha[2]);
            String cpf = linha[3];
            String nome = linha[4];
            String email = linha[5];
            String senha = linha[6];
            String dataDeNascimento = linha[7];
            String telefone = linha[8];

            motoboys.add(new Motoboy(codMotoboy, comissao, disponibilidade, cpf, nome, email, senha, dataDeNascimento, telefone));
        }

        return motoboys;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Victor
 */
import classes.Cliente;
import classes.Motoboy;
import classes.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipuladorArquivo {
    
    private static void limparArquivo(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.write("");
        buffWrite.close();
    }
            
    private static String leitor(String path) throws IOException {
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

    private static void escritor(String path, String linha) throws IOException {
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
    public static Cliente stringToCliente(String linha) {
        String valores[] = linha.split(";");

        int codCliente = Integer.parseInt(valores[0]);
        String endereco = valores[1];
        String cpf = valores[2];
        String nome = valores[3];
        String email = valores[4];
        String senha = valores[5];
        String dataDeNascimento = valores[6];
        String telefone = valores[7];

        return new Cliente(codCliente, endereco, cpf, nome, email, senha, dataDeNascimento, telefone);
    }

    public static void armazenarCliente(Cliente cliente) throws IOException {
        escritor("database/clientes.txt", cliente.toString());
    }
    
    public static ArrayList<Cliente> carregarClientes() throws IOException {
        // carrega os clientes do banco de dados
        String texto = leitor("database/clientes.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Cliente> clientes = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            clientes.add(stringToCliente(linhas[i]));
        }

        return clientes;
    }

    public static void editarCliente(Cliente cliente) throws IOException {
        // carrega os clientes do banco de dados
        String texto = leitor("database/clientes.txt");
        limparArquivo("database/clientes.txt");
        
        String[] linhas = texto.split("\n");

        // percorre por todos os clientes e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Cliente currCliente = stringToCliente(linhas[i]);

            if (cliente.getCodCliente() == currCliente.getCodCliente())
                armazenarCliente(cliente); // o código é imutável, então sobscreve
            else
                armazenarCliente(currCliente);
        }
    }

    public static void excluirCliente(Cliente cliente) throws IOException {
        // carrega os clientes do banco de dados
        String texto = leitor("database/clientes.txt");
        limparArquivo("database/clientes.txt");

        String[] linhas = texto.split("\n");

        // percorre por todos os clientes e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Cliente currCliente = stringToCliente(linhas[i]);

            if (cliente.getCodCliente() != currCliente.getCodCliente()) // se for igual, ignora
                armazenarCliente(currCliente);
        }
    }
    
    // CRUD Motoboy
    public static Motoboy stringToMotoboy(String linha) {
        String valores[] = linha.split(";");

        int codMotoboy = Integer.parseInt(valores[0]);
        float comissao = Float.parseFloat(valores[1]);
        boolean disponibilidade = Boolean.valueOf(valores[2]);
        String cpf = valores[3];
        String nome = valores[4];
        String email = valores[5];
        String senha = valores[6];
        String dataDeNascimento = valores[7];
        String telefone = valores[8];

        return new Motoboy(codMotoboy, comissao, disponibilidade, cpf, nome, email, senha, dataDeNascimento, telefone);
    }

    public static void armazenarMotoboy(Motoboy motoboy) throws IOException {
        escritor("database/motoboys.txt", motoboy.toString());
    }

    public static ArrayList<Motoboy> carregarMotoboys() throws IOException {
        // carrega os motoboys do banco de dados
        String texto = leitor("database/motoboys.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Motoboy> motoboys = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            motoboys.add(stringToMotoboy(linhas[i]));
        }

        return motoboys;
    }
    
    public static void editarMotoboy(Motoboy motoboy) throws IOException {
        // carrega os motoboys do banco de dados
        String texto = leitor("database/motoboys.txt");
        limparArquivo("database/motoboys.txt");
        
        String[] linhas = texto.split("\n");

        // percorre por todos os motoboys e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Motoboy currMotoboy = stringToMotoboy(linhas[i]);

            if (motoboy.getCodMotoboy() == currMotoboy.getCodMotoboy())
                armazenarMotoboy(motoboy); // o código é imutável, então sobscreve
            else
                armazenarMotoboy(currMotoboy);
        }
    }

    public static void excluirMotoboy(Motoboy motoboy) throws IOException {
        // carrega os motoboys do banco de dados
        String texto = leitor("database/motoboys.txt");
        limparArquivo("database/motoboys.txt");

        String[] linhas = texto.split("\n");

        // percorre por todos os motoboys e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Motoboy currMotoboy = stringToMotoboy(linhas[i]);

            if (motoboy.getCodMotoboy() != currMotoboy.getCodMotoboy()) // se for igual, ignora
                armazenarMotoboy(currMotoboy);
        }
    }

    // CRUD Produto
    public static Produto stringToProduto(String linha) {
        String valores[] = linha.split(";");

        int codProduto = Integer.parseInt(valores[0]);
        String nome = valores[1];
        float valor = Float.parseFloat(valores[2]);
        boolean alcoolico = Boolean.valueOf(valores[3]);
        String categoria = valores[4];
        String descricao = valores[5];
        int diaDaPromocao = Integer.parseInt(valores[6]);

        return new Produto(codProduto, nome, valor, alcoolico, categoria, descricao, diaDaPromocao);
    }

    public static void armazenarProduto(Produto produto) throws IOException {
        escritor("database/produtos.txt", produto.toString());
    }

    public static ArrayList<Produto> carregarProdutos() throws IOException {
        // carrega os produtos do banco de dados
        String texto = leitor("database/produtos.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Produto> produtos = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            produtos.add(stringToProduto(linhas[i]));
        }

        return produtos;
    }

    public static void editarProduto(Produto produto) throws IOException {
        // carrega os produtos do banco de dados
        String texto = leitor("database/produtos.txt");
        limparArquivo("database/produtos.txt");
        
        String[] linhas = texto.split("\n");

        // percorre por todos os produtos e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Produto currProduto = stringToProduto(linhas[i]);

            if (produto.getCodProduto() == currProduto.getCodProduto())
                armazenarProduto(produto); // o código é imutável, então sobscreve
            else
                armazenarProduto(currProduto);
        }
    }

    public static void excluirProduto(Produto produto) throws IOException {
        // carrega os produtos do banco de dados
        String texto = leitor("database/produtos.txt");
        limparArquivo("database/produtos.txt");

        String[] linhas = texto.split("\n");

        // percorre por todos os produtos e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Produto currProduto = stringToProduto(linhas[i]);

            if (produto.getCodProduto() != currProduto.getCodProduto()) // se for igual, ignora
                armazenarProduto(currProduto);
        }
    }
}

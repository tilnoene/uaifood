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
    
    // limpa um arquivo de texto
    private static void limparArquivo(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.write("");
        buffWrite.close();
    }
    
    // lê o conteúdo de um arquivo
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
    
    // escreve em algum arquivo
    private static void escritor(String path, String linha) throws IOException {
        try {
            String texto = leitor(path) + linha; // permanece com o que já havia no arquivo

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
    // converte uma linha do banco de dados para um objeto do tipo Cliente
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
    
    // armazena um cliente no banco de dados
    public static void armazenar(Cliente cliente) throws IOException {
        escritor("clientes.txt", cliente.toString());
    }
    
    // carrega os clientes do banco de dados
    public static ArrayList<Cliente> carregarClientes() throws IOException {
        String texto = leitor("clientes.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Cliente> clientes = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            clientes.add(stringToCliente(linhas[i]));
        }

        return clientes;
    }
    
    // edita um cliente no banco de dados
    public static void editar(Cliente cliente) throws IOException {
        // carrega os clientes do banco de dados
        String texto = leitor("clientes.txt");
        limparArquivo("clientes.txt");
        
        String[] linhas = texto.split("\n");

        // percorre por todos os clientes e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Cliente currCliente = stringToCliente(linhas[i]);

            if (cliente.getCodCliente() == currCliente.getCodCliente())
                ManipuladorArquivo.armazenar(cliente); // o código é imutável, então sobscreve
            else
                ManipuladorArquivo.armazenar(currCliente);
        }
    }
    
    // exclui um cliente do banco de dados
    public static void excluir(Cliente cliente) throws IOException {
        // carrega os clientes do banco de dados
        String texto = leitor("clientes.txt");
        limparArquivo("clientes.txt");

        String[] linhas = texto.split("\n");

        // percorre por todos os clientes e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Cliente currCliente = stringToCliente(linhas[i]);

            if (cliente.getCodCliente() != currCliente.getCodCliente()) // se for igual, ignora
                ManipuladorArquivo.armazenar(currCliente);
        }
    }
    
    // CRUD Motoboy
    // converte uma linha do banco de dados para um objeto do tipo Motoboy
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
        String inicioExpediente = valores[9];
        String finalExpediente = valores[10];

        return new Motoboy(codMotoboy, comissao, disponibilidade, cpf, nome, email, senha, dataDeNascimento, telefone, inicioExpediente, finalExpediente);
    }
    
    // armazena um motoboy no banco de dados
    public static void armazenar(Motoboy motoboy) throws IOException {
        escritor("motoboys.txt", motoboy.toString());
    }
    
    // carrega os motoboys do banco de dados
    public static ArrayList<Motoboy> carregarMotoboys() throws IOException {
        // carrega os motoboys do banco de dados
        String texto = leitor("motoboys.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Motoboy> motoboys = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            motoboys.add(stringToMotoboy(linhas[i]));
        }

        return motoboys;
    }
    
    // edita um motoboy no banco de dados
    public static void editar(Motoboy motoboy) throws IOException {
        // carrega os motoboys do banco de dados
        String texto = leitor("motoboys.txt");
        limparArquivo("motoboys.txt");
        
        String[] linhas = texto.split("\n");

        // percorre por todos os motoboys e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Motoboy currMotoboy = stringToMotoboy(linhas[i]);

            if (motoboy.getCodMotoboy() == currMotoboy.getCodMotoboy())
                ManipuladorArquivo.armazenar(motoboy); // o código é imutável, então sobscreve
            else
                ManipuladorArquivo.armazenar(currMotoboy);
        }
    }
    
    // exclui um motoboy do banco de dados
    public static void excluir(Motoboy motoboy) throws IOException {
        // carrega os motoboys do banco de dados
        String texto = leitor("motoboys.txt");
        limparArquivo("motoboys.txt");

        String[] linhas = texto.split("\n");

        // percorre por todos os motoboys e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Motoboy currMotoboy = stringToMotoboy(linhas[i]);

            if (motoboy.getCodMotoboy() != currMotoboy.getCodMotoboy()) // se for igual, ignora
                ManipuladorArquivo.armazenar(currMotoboy);
        }
    }

    // CRUD Produto
    // converte uma linha do banco de dados para um objeto do tipo Produto
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
    
    // armazena um produto no banco de dados
    public static void armazenar(Produto produto) throws IOException {
        escritor("produtos.txt", produto.toString());
    }
    
    // carrega os produtos do banco de dados
    public static ArrayList<Produto> carregarProdutos() throws IOException {
        String texto = leitor("produtos.txt");

        String[] linhas = texto.split("\n");
        ArrayList<Produto> produtos = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            produtos.add(stringToProduto(linhas[i]));
        }

        return produtos;
    }
    
    // edita um produto no banco de dados
    public static void editar(Produto produto) throws IOException {
        // carrega os produtos do banco de dados
        String texto = leitor("produtos.txt");
        limparArquivo("produtos.txt");
        
        String[] linhas = texto.split("\n");

        // percorre por todos os produtos e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Produto currProduto = stringToProduto(linhas[i]);

            if (produto.getCodProduto() == currProduto.getCodProduto())
                armazenar(produto); // o código é imutável, então sobscreve
            else
                armazenar(currProduto);
        }
    }
    
    // exclui um produto do banco de dados
    public static void excluir(Produto produto) throws IOException {
        // carrega os produtos do banco de dados
        String texto = leitor("produtos.txt");
        limparArquivo("produtos.txt");

        String[] linhas = texto.split("\n");

        // percorre por todos os produtos e verifica o código
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i].length() == 0) continue;

            Produto currProduto = stringToProduto(linhas[i]);

            if (produto.getCodProduto() != currProduto.getCodProduto()) // se for igual, ignora
                armazenar(currProduto);
        }
    }
}

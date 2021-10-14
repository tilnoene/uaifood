/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import javax.swing.JOptionPane;
import classes.Motoboy;
import classes.ManipuladorArquivo;
import static classes.ManipuladorArquivo.stringToMotoboy;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */

/*
Boa parte dessas funções precisa desse código auxiliar para que o erro nunca ocorra
, o qual deve ficar na parte de salvar os dados, como no botao salvar do CLiente.
    if ("função retorna true") {
        JOptionPane.showMessageDialog(null, "Por favor, preencha xxx certo.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

*/
public class CheckDados {
    // função dinâmica e geral que checa se cada campo é vazio ou não
    public static boolean ehVazio(String... vars){
        for(String s: vars){
            if (s.equals("")){
                return true;
            }
        }
        
        return false;
    }
    /////////////////////////////////////////
    // Função para checar as datas de nascimentos
    public static boolean checaData(String data){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        int year = Year.now().getValue(); // receber o ano atual da máquina
        boolean valid = false;
        try {
            df.parse(data);
            valid = true;
        }
        catch (ParseException e) { } // valid ainda será falso
        if ((!valid) || (Integer.parseInt(data.substring(6,10)) > year)){  
            return true;
        }
        
        return false;
    }
    /////////////////////////////////
    // função para checar os horario de expediente
    public static boolean checaExpediente(String comeco, String fim) {
        String[] comecoArray = new String[2];
        String[] fimArray = new String[2];
        comecoArray = comeco.split(":");
        fimArray = fim.split(":");
        
        // tranformando todos os num para int e as horas para minutos
        int hora1 = Integer.parseInt(comecoArray[0]) * 60; 
        int minuto1 = Integer.parseInt(comecoArray[1]);
        int hora2 = Integer.parseInt(fimArray[0]) * 60;
        int minuto2 = Integer.parseInt(fimArray[1]);
        System.out.println(hora1);
        System.out.println(minuto1);
        System.out.println(hora2);
        System.out.println(minuto2);
        
        if((hora1+minuto1 >= hora2+minuto2) || (hora1 > 24*60) || (hora2 > 24*60) 
                || (minuto1 > 60) || (minuto2 > 60)){
   
            return true;
        }
        
        return false;
    }
    
    ///////////////////////////////////////////
    // Função apra cehcar se já há algum dado no banco de dados
    // por enquanto so testa o cpf:
    public static boolean checaCpf(String cpfs, String pessoa)throws IOException {
        ArrayList<Motoboy> motoboys = ManipuladorArquivo.carregarMotoboys();
        ArrayList<Cliente> clientes = ManipuladorArquivo.carregarClientes();
        
        if (pessoa.equals("motoboy")){
            // percorre por todos os motoboys e verifica o Cpf
            for (Motoboy moboy: motoboys) {

                if (moboy.getCpf().equals(cpfs)){
                    return true;
                }
            }
        
        } else {
            // percorre por todos os cliente e verifica o Cpf
            for (Cliente clie: clientes) {
           
                if (clie.getCpf().equals(cpfs)){
                    return true;
                }
            }
        }

        return false;
    }
}

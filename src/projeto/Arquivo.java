package projeto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe para fazer a manipulação com os arquivos TXT gerados para armazenar os
 * dados digitados
 *
 * @author Simon
 */
public class Arquivo {

// Chave para criptografar a gravação dos dados    
    static int chave = 6;
        
// Grava um Hacker no arquivo de Hackers    
    public static void escritor(Hacker h1) throws IOException {
        String dir = "C:\\Users\\Usuario\\Desktop\\hackers.txt";
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(dir, true));
        String nome = "";
        String nivel = "";
        String email = "";
        nome = criptografar(h1.getNome());
        nivel = criptografar(h1.getNivel());
        email = criptografar(h1.getEmail());
        buffWrite.append(nome + ";" + nivel + ";" + email + "\n");
        buffWrite.close();
    }
    
// Grava um podcast no arquivo de podcasts    
    public static void escritor(Podcast p1) throws IOException {
        String dir = "C:\\Users\\Usuario\\Desktop\\podcasts.txt";
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(dir, true));
        String titulo = "";
        String responsavel = "";
        String link = "";
        titulo = criptografar(p1.getTitulo());
        responsavel = criptografar(p1.getResponsavel().getNome());
        link = p1.getLink();
        buffWrite.append(titulo + ";" + responsavel + ";" + link + "\n");
        buffWrite.close();
    }
    
// Realiza a leitura dos Hackers cadastrados    
    public ArrayList leitorHacker() throws IOException {
// Arraylist com o conteúdo do arquivo de Hackers    
        ArrayList<String> listaHackers = new ArrayList();
        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\hackers.txt"));
        String linha = "";
        while (true) {
            linha = buffRead.readLine();
            if (linha != null) {
               listaHackers.add(linha);
            } else {
                break;
            }
        }
        buffRead.close();    
        return listaHackers;
    }
    
// Realiza a leitura dos Podcasts cadastrados    
    public ArrayList leitorPodcast() throws IOException {
// Arraylist com o conteúdo do arquivo de Hackers    
        ArrayList<String> listaPodcast = new ArrayList();
        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\podcasts.txt"));
        String linha = "";
        while (true) {
            linha = buffRead.readLine();
            if (linha != null) {
               listaPodcast.add(linha);
            } else {
                break;
            }
        }
        buffRead.close();    
        return listaPodcast;
    }
    
    public static String criptografar(String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        int tamanhoTexto = texto.length();
        for (int c = 0; c < tamanhoTexto; c++) {
            int letra = ((int) texto.charAt(c)) + chave;
            while (letra > 126) {
                letra -= 94;
            }
            textoCifrado.append((char) letra);
        }
        return textoCifrado.toString();
    }

    public static String descriptografar(String textoCifrado) {
        StringBuilder texto = new StringBuilder();
        int tamanhoTexto = textoCifrado.length();
        for (int c = 0; c < tamanhoTexto; c++) {
            int letra = ((int) textoCifrado.charAt(c)) - chave;
            while (letra < 32) {
                letra += 94;
            }
            texto.append((char) letra);
        }
        return texto.toString();
    }
}

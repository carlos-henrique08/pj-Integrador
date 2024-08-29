/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Senac
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class org {

 public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, especifique o diretório a ser organizado.");
            return;
        }

        String diretorio = args[0];
        organizarArquivos(diretorio);
    }

    public static void organizarArquivos(String diretorio) {
        File pasta = new File(diretorio);

        if (!pasta.isDirectory()) {
            System.out.println("O caminho especificado não é um diretório.");
            return;
        }

        File[] arquivos = pasta.listFiles();

        if (arquivos == null || arquivos.length == 0) {
            System.out.println("O diretório está vazio.");
            return;
        }

        Map<String, String> extensoes = mapearExtensoes(arquivos);

        criarPastas(extensoes, diretorio);

        moverArquivos(arquivos, extensoes);
    }

    private static Map<String, String> mapearExtensoes(File[] arquivos) {
        Map<String, String> extensoes = new HashMap<>();

        for (File arquivo : arquivos) {
            if (arquivo.isFile()) {
                String nomeArquivo = arquivo.getName();
                String extensao = nomeArquivo.substring(nomeArquivo.lastIndexOf(".") + 1);
                String diretorio = null;
                extensoes.put(extensao, diretorio + "/" + extensao);
            }
        }

        return extensoes;
    }

    private static void criarPastas(Map<String, String> extensoes, String diretorio) {
        for (String extensao : extensoes.keySet()) {
            File novaPasta = new File(diretorio + "/" + extensao);
            novaPasta.mkdirs();
        }
    }

    private static void moverArquivos(File[] arquivos, Map<String, String> extensoes) {
        for (File arquivo : arquivos) {
            if (arquivo.isFile()) {
                String nomeArquivo = arquivo.getName();
                String extensao = nomeArquivo.substring(nomeArquivo.lastIndexOf(".") + 1);

                try {
                    Path origem = arquivo.toPath();
                    Path destino = new File(extensoes.get(extensao) + "/" + nomeArquivo).toPath();
                    Files.move(origem, destino);
                    System.out.println("Movido " + nomeArquivo + " para a pasta " + extensao + ".");
                } catch (IOException e) {
                    System.out.println("Erro ao mover o arquivo " + nomeArquivo);
                    e.printStackTrace();
                }
            }
        }
    }
}

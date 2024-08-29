/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Idade_pessoas {
       public static void main(String[] args) {
        String idadeString = JOptionPane.showInputDialog("Digite sua idade: ");

        int Idade = 0;
        
        
        while (!idadeString.matches("\\d+")) {
            idadeString = JOptionPane.showInputDialog("Idade inválida. Digite um número inteiro: ");
        }

       Idade = Integer.parseInt(idadeString);

        String faixaEtaria;
        if (Idade <= 12) {
            faixaEtaria = "criança";
        } else if (Idade <= 17) {
            faixaEtaria = "adolescente";
        } else if (Idade <= 59) {
            faixaEtaria = "adulto";
        } else {
            faixaEtaria = "idoso";
        }

        JOptionPane.showMessageDialog(null, "Você é " +faixaEtaria+ ".");
    }
 
}

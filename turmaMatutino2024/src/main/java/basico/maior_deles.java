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

public class maior_deles{

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int Maior = Math.max(num1, Math.max(num2, num3));

        JOptionPane.showMessageDialog(null, "O maior número é: " + Maior);
    }
}

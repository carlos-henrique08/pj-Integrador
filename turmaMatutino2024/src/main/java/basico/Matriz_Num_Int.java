/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Senac
 */

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Matriz_Num_Int {
    public static void main(String args[]) {

        final int LINHAS = 5;
        final int COLUNAS = 7;
        int[][] MatInt = new int[LINHAS][COLUNAS];

        for (int lin = 0; lin < MatInt.length; lin++) {
            for (int col = 0; col < MatInt[lin].length; col++) {
                MatInt[lin][col] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] linha : MatInt) {
            for (int elemento : linha) {
                sb.append(elemento).append(' ');
            }
            sb.append('\n');
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
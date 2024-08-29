package basico;

/**
 *  Faça um algoritmo com uma matriz 3X3 de tipo Lógico
     Respondendo VERDADEIRO OU FALSO para a seguinte pergunta
     Gostaram de Lógica de programação?

 * @author Senac
 */

import javax.swing.JOptionPane;

public class Matriz_verda_falso {
  public static void main(String args[]){
      
     boolean[][] MatRes = new boolean[3][3];
 
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String input = JOptionPane.showInputDialog(null,
                        String.format(" - Gostaram de Lógica de Programação? (Digite 1 para VERDADEIRO ou 0 para FALSO):", i, j));
                int resposta = Integer.parseInt(input);
                MatRes[i][j] = (resposta == 1);
            }
        }

        StringBuilder resultado = new StringBuilder("Respostas para a pergunta 'Gostaram de Lógica de Programação?':\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado.append(MatRes[i][j] ? "VERDADEIRO" : "FALSO").append(" ");
            }
            resultado.append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
      
  }   
}

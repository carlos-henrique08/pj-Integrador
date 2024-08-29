package basico;

/**
 *Faça uma algoritmo com uma matriz 4X4 de números reais.
     Mostrar os números no final.

 * @author Senac
 */

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Matriz_NumReais{
  public static void main(String args []){

    final int TAM = 4;
      double [][] MatReal = new double[TAM][TAM];
      double Num = 0;
      
      for(int lin =0;lin<MatReal.length;lin++){
      
          for(int col = 0;col<MatReal[0].length;col++){
              
          
 Num = Double.parseDouble(JOptionPane.showInputDialog("Informe numeros reais: "));
          MatReal[lin][col]= Num;
          
          }
      }    
      
      JOptionPane.showMessageDialog(null,Arrays.deepToString(MatReal));
        
        StringBuilder sb = new StringBuilder();
        for (double[] linha : MatReal) {
            for (double elemento : linha) {
                 sb.append(elemento).append(' ');
            }
        sb.append('\n');
        }
        JOptionPane.showMessageDialog(null,
        sb.toString());  
        
    }
    
}
  

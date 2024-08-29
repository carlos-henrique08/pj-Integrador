package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Formar_triangulo {
    public static void main(String args[]){
     float LadoA = 0f ,LadoB = 0f ,LadoC = 0f;
     
     
     
    LadoA = Float.parseFloat(JOptionPane.showInputDialog("Informe um Número"));
    LadoB = Float.parseFloat(JOptionPane.showInputDialog("Informe um Número"));
    LadoC = Float.parseFloat(JOptionPane.showInputDialog("Informe um Número"));
    
    
      if(LadoA + LadoB > LadoC && LadoA + LadoC > LadoB && LadoB + LadoC > LadoA){
    
        JOptionPane.showMessageDialog(null,"Os valores podem formar um triângulo");
      
      }else{
        JOptionPane.showMessageDialog(null,"Os valores não podem forma um triângulo");
       }
          
    }
}

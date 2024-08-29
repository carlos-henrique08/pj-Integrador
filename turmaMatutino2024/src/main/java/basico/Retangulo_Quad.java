package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Retangulo_Quad {
   public static void main(String args[]){
     
    float Base = 0f;
    float Altura = 0f;

    Base = Float.parseFloat(JOptionPane.showInputDialog("Informe a Base do Retângulo:"));
    
    Altura = Float.parseFloat(JOptionPane.showInputDialog("Imforme a altura do Retângulo:"));
         
 if(Base == Altura){
     JOptionPane.showMessageDialog(null,"Retângulo é Quadrado");
 }else{
          JOptionPane.showMessageDialog(null,"Retângulo");
          
      }                         
   }
}

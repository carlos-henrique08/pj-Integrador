package Basico;

/**
 * -Faça um programa que leia um número e mostre a terça parte do mesmo.
 * Mostrando no final qual o número e sua terça parte.
 *
 */

import javax.swing.JOptionPane;


public class TercaParte {
    
    
    public static void main(String args[]){
        
      float Num = 0.0f;
      float TP = 0.0f;
      
      
      Num = Float.parseFloat(JOptionPane.showInputDialog("Informe o número: "));
      
      TP = Num /3;
      
      
      JOptionPane.showMessageDialog(null,"A terça parte do número é: "+TP);
        
        
        
        
        
    }
    
}

package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Par_impar {
  public static void main(String args[]){
      
  float Num = 0f; 
  
  Num = Float.parseFloat(JOptionPane.showInputDialog("Informe um numero"));
  
    if( Num == 0 ){   
       JOptionPane.showMessageDialog(null, "O numero e nulo");
    }else if(Num % 2 ==0 ){
       JOptionPane.showMessageDialog(null, "O numero é par"); 
    }else{
       JOptionPane.showMessageDialog(null, "O numero é impar"); 
    }
  
  
  
  
  
  
  
  
  } 
    
}

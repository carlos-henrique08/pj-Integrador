package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Palidromos {
    public static void main(String args[]){
    
    
   int Num = 0 ,D1 = 0 ,D2 = 0 ,D4 = 0 ,D5 = 0;     
        
    String input = JOptionPane.showInputDialog("Informe um número com 5 digitos");
    Num = Integer.parseInt(input);
    
    D1 = Num / 10000; 
    D2 =(Num % 10000) / 1000; 
    D4 =(Num % 100) / 10; 
    D5 = Num % 10;    
        
 if (D1 == D5 && D2 == D4){
      JOptionPane.showMessageDialog(null,"O número e palidromo");
        
    }else{JOptionPane.showMessageDialog(null,"O número não e palidromo");
      
     }      
        
        
            
    }
}

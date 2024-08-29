package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Positivo_Negativo {
    
    public static void main(String args[]){
        
   float Num = 0f;
   String Status = "";
   
   Num = Float.parseFloat(JOptionPane.showInputDialog("Informe um numero: "));
   
   
   if(Num > 0 ){
       Status = "Positivo";
   }else{
       Status = "Negativo";
   }
       
   JOptionPane.showMessageDialog(null,"Número: "+Num+"\nStatus: "+Status);    
       
       
   
      
        
        
        
        
        
        
    }
   
}

package basico;

/**
 *
 * @author Senac
 */


import javax.swing.JOptionPane;

public class Divisivel3_5 {
    public static void main(String args[]){
        
    float Num = 0f;

   Num = Float.parseFloat(JOptionPane.showInputDialog("Informe um número"));
        
      if (Num % 3==0 | 5==0){
        JOptionPane.showMessageDialog(null,"O número e divisive por 3 e 5 ao mesmo tempo!");
    }else{
         JOptionPane.showMessageDialog(null,"O número não e divisivel por 3 e 5 ao mesmo tempo!");
        }     
        
        
        
    }
}

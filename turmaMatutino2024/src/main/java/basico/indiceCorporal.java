package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class indiceCorporal {
    
    public static void main(String args[]){
        
    float M = 0f;
    float H = 0f;
    float  IMC = 0.0f;
        
        
     M = Float.parseFloat(JOptionPane.showInputDialog("Informe o quilograma: "));
     
     H = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
     
     
     IMC = (float) Math.sqrt(Math.pow(H, 2))/ M;
     
     
     JOptionPane.showMessageDialog(null,"O quilo: "+M+"\nA altura: "+H+
             "\nA massa corporal é: "+IMC);
        
        
        
        
        
        
    }
    
}

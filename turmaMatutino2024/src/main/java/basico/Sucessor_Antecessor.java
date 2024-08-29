package Basico;

import javax.swing.JOptionPane;

public class Sucessor_Antecessor {
    
    public static void main(String args[]){
        int Num =0,Sucessor = 0,Antecessor = 0;
        
        Num = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
        
        Sucessor = Num + 1;
        Antecessor = Num -1;
        
        
        JOptionPane.showMessageDialog(null," O Sucessor do número é: "+Sucessor);
        JOptionPane.showMessageDialog(null,"O Antecessor do número é: "+Antecessor);
    
    
    
    
    } 
    
}

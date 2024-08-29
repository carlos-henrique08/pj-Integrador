package Basico;

import javax.swing.JOptionPane;

public class PrimeiraClasse {
    public static void main(String args[]) {
       int Soma=0,Num=0,Num2=0;
       
       Num = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
       Num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
       
       
       Soma = Num + Num2;
       
       
       JOptionPane.showMessageDialog(null, "O resultado da soma: "+Soma);
        
        
        
    }
        
    
}

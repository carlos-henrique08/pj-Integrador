package Basico;

/**
 *Faça um programa que possa entrar com o saldo de uma aplicação e mostre
 * o novo saldo, mostrando o saldo anterior e o atualizado. 
 * Sendo o Saldo anterior ter sido informado e 
 * inclusive informar também o reajuste.
 * 
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class Novo_Saldo {
    
    public static void main(String args[]){
     
      Float SaldoAnt = 0.0f;    
      Float Reajuste = 0.0f;  
      Float NovoSaldo = 0.0f;
      
      
      SaldoAnt = Float.parseFloat(JOptionPane.showInputDialog("Informe o Saldo: "));
      
      Reajuste = Float.parseFloat(JOptionPane.showInputDialog("Informe o Reajuste: "));
      
      
      NovoSaldo = SaldoAnt + SaldoAnt * (Reajuste / 100);
      
      JOptionPane.showMessageDialog(null,"Saldo Anterior: "+SaldoAnt+
              "\nO Reajuste: "+Reajuste+"\nSaldo Atualizado: "+NovoSaldo);
        
    }
    
    
    
    
    
}

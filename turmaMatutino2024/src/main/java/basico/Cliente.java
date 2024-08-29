package Basico;

import javax.swing.JOptionPane;

public class Cliente {
    
   public static void main(String args[]){
       
       String Nome="";
       String Endereco="";
       String Telefone="";
       
       
       Nome = JOptionPane.showInputDialog("Informe o nome: ");
       Endereco = JOptionPane.showInputDialog("Informe o endereço: ");
       Telefone = JOptionPane.showInputDialog("Informe o Telefone: ");
       
       JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nEndereço: "+Endereco+
               "\nTelefone:"+Telefone);
       
   
       
       
       
       
  }   
    
}

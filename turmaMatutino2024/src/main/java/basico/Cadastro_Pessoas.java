package Basico;

/**
 *Faça um programa que leia e mostre nome, idade, sexo.
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class Cadastro_Pessoas {
    
    public static void main(String args[]){
        
      String Nome = "";
      String Genero = "";
      String Idade = "";
      
      
      Nome = JOptionPane.showInputDialog("Informe o Nome: ");
      Genero = JOptionPane.showInputDialog("Informe o Gênero: ");
      Idade = JOptionPane.showInputDialog("Informe a Idade: ");
      
      
      JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nGênero: "+Genero+
              "\nIdade: "+Idade);
        
        
        
        
    }
    
    
}

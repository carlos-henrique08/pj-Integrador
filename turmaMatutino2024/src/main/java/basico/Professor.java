
package basico;

/**
 * *
 *Faça um programa para cadastrar um professor com os seguintes dados, 
 * Nome, endereço, cidade, UF, CEP, telefone, CPF, carteira de identidade, 
 * data de nascimento, grau de escolaridade e curso que leciona. No final 
 * mostrar todos os dados de uma forma organizada.

 * @author Senac
 */

import javax.swing.JOptionPane;

public class Professor {
    
    public static void main(String args[]){
        
      String Nome="" ,Endereco="" ,Cidade="" ,UF=""; 
      String Telefone="" ,CPF="" ,Identidade="" ,DataNasc="" ,GrauEscolar="";
      String Curso="";
      
      
      Nome = JOptionPane.showInputDialog("Informe o Nome: ");
      CPF = JOptionPane.showInputDialog("Informe o CPF: ");
      Identidade = JOptionPane.showInputDialog("Informe a Identidade: ");
      DataNasc = JOptionPane.showInputDialog("Informe a data de nascimento: ");       
      Telefone = JOptionPane.showInputDialog("Informe o Telefone: ");        
      Endereco = JOptionPane.showInputDialog("Informe o Endereço: ");
      Cidade = JOptionPane.showInputDialog("Informe a cidade: ");
      UF = JOptionPane.showInputDialog("Informe a UF : ");
      GrauEscolar = JOptionPane.showInputDialog("Informe o Grau de escolaridade: ");
      Curso = JOptionPane.showInputDialog("Informe o Curso: ");
      
      
      
    JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nCPF: "+CPF+"\nIdentidade: "+Identidade+
            "\nDataNasc: "+DataNasc+"\nTelefone: "+Telefone+"\nEndereço: "+Endereco+
            "\nCidade: "+Cidade+"\nUF: "+UF+"\nGrau de Escolaridade: "+GrauEscolar+
            "\nCurso: "+Curso);
              
        
        
        
        
        
        
    }
           
}

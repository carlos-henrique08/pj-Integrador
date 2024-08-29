package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Reajuste_salario {
 public static void main(String args[]){
     
   String Nome = "";
   float Matricula = 0f ,Salario = 0f ,SalAjus = 0f;
   
   
   Nome = JOptionPane.showInputDialog("Infrome o nome do funcionario");
   
   Matricula = Float.parseFloat(JOptionPane.showInputDialog("Informe a "
           + "Matricula do funcionario"));
  
   Salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário do "
          + "funcionario")); 
  
    
 if(Salario <= 950.00){
     SalAjus = (float) (Salario + (Salario * 0.25));
   
 }else if(Salario >= 950.00){
     SalAjus =  (float) (Salario + (Salario * 0.10));
     
 }else{
     
 }
  JOptionPane.showMessageDialog(null, "Nome: "+Nome+"\nMatricula: "+Matricula+
          "\nSalario: "+Salario+"\nSalario Ajustado: "+SalAjus);   
     
 }
}

package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Media_3Notas {
 public static void main(String args[]){
     
    float NT1 = 0f ,NT2 = 0f  ,NT3 = 0f ,Media = 0.0f;
    String Nome = "";
    
     Nome = JOptionPane.showInputDialog("Informe o nome do Aluno");
     NT1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota"));
     NT2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota"));
     NT3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota"));
     
   Media = (NT1 + NT2 + NT3)/3;
   
   if(Media >= 7){
     JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nMedia: "+Media+
               "\nAprovado");
   
   }else if(Media < 6 ){
      JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nMedia: "+Media+
               "\nReprovado"); 
   
   }else if(Media > 6 ){
     JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nMedia: "+Media+
               "\nRecuperação");
 }else{
       
   }
   
     
    
 }
}

package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Cor_fruta {

    public static void main(String args[]){
      
     String Cor = "" ,Fruta = ""; 
      
    
     Fruta = JOptionPane.showInputDialog("Informe a fruta");
     Cor = JOptionPane.showInputDialog("Informe a cor da fruta");
     
         if(Cor.equals("Vermelha") && Fruta.equals("Maçã")){ 
           JOptionPane.showMessageDialog(null,"É maçã mesmo!");
   
         }else if(Cor.equals("Verde") && Fruta.equals("Abacate")){
           JOptionPane.showMessageDialog(null,"É abacate!");
           
          }else{
            JOptionPane.showMessageDialog(null,"É outra fruta *-* ");
           
           }
          
    }
}
 

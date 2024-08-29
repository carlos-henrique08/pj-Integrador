package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;


public class Maior_menor_idade {
    public static void main(String args[]){
    
        
    String Nome = "";
    int Idade = 0;
    
    
    Nome =JOptionPane.showInputDialog("Informe o Nome: ");
    
    Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
    
    
    
    if(Idade >= 18 ){
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nIdade: "+Idade+
                "\nMaior de idade! ");
    }else{
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nIdade: "+Idade+
                "\nMenor de idade! ");
    }
        
        
        
        
        
        
        
        
        
        
        
        
    }
 
}

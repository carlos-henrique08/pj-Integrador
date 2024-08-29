package Basico;

/**
 *Faça um programa para calcular o valor do volume de uma lata de óleo, utilizando a fórmula: 
volume = 3.14159 * R^2 * altura
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class Volume_Lata_Oleo {
    
    
    public static void main(String args[]){
        
        double Raio = 0;
        double Volume = 0;
        double Altura = 0;
        
    Raio =Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da lata de óleo: "));
        
    Altura =Double.parseDouble(JOptionPane.showInputDialog("infrome a altura da lata de óleo: "));
        
    
    Volume = 3.14 * (Raio * Raio) * Altura;
    
    JOptionPane.showMessageDialog(null,"O volume é: "+Volume);
        
        
        
        
        
        
    }
    
}

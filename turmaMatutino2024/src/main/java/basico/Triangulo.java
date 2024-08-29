package basico;

/**
 * Faça um algoritmo para ler a base e a altura de um triângulo.
 * Em seguida, escreva a área do mesmo.


 * @author Senac
 */

import javax.swing.JOptionPane;

public class Triangulo {
    
    public static void main(String args[]){
        
    float Base = 0f;
    float Altura = 0f;
    float Area = 0.0f;
    
    Base = Float.parseFloat(JOptionPane.showInputDialog("Informe a Base do triângulo: "));
    
    Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do triângulo"));
        
    
    Area = (Base * Altura) / 2;
        
        
    JOptionPane.showMessageDialog(null, "A area do triângulo é: "+Area);
        
    }
    
    
    
    
}

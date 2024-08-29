package Basico;

/**
 *Faça um programa com a base e a altura de um retângulo e mostre a seguinte saída:
a - Perimetro
b - Area
c - Diagonal
 * @author Aluno
 */

import javax.swing.JOptionPane;
        
public class Retangulo {
    
    public static void main(String args[]){
        
   String inputBase = JOptionPane.showInputDialog("Digite a base do retângulo:");
        double base = Double.parseDouble(inputBase);

        String inputAltura = JOptionPane.showInputDialog("Digite a altura do retângulo:");
        double altura = Double.parseDouble(inputAltura);

  
        double perimetro = 2 * (base + altura);

        double area = base * altura;

        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        String mensagem = """
                          Propriedades do ret\u00e2ngulo:
                          a - Per\u00edmetro: """ + perimetro + "\n" +
                           "b - Área: " + area + "\n" +
                           "c - Diagonal: " + diagonal;
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
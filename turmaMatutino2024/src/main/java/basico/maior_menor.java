package Basico;
/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class maior_menor {
    public static void main(String[] args) {
        // Entrada dos valores
        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        // Determinação do maior valor
        float maior;
        if (valor1 > valor2) {
            maior = valor1;
        } else {
            maior = valor2;
        }
        
        // Exibição do maior valor
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
    }
}

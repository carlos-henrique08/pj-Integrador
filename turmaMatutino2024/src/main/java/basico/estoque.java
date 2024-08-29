package basico;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class estoque {
     public static void main(String[] args) {
        
        int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        int quantidadeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque:"));

        // Verifica o nível de estoque
        if (quantidadeEstoque < 10) {
            JOptionPane.showMessageDialog(null, "Estoque baixo");
        } else if (quantidadeEstoque >= 10 && quantidadeEstoque <= 20) {
            JOptionPane.showMessageDialog(null, "Estoque médio");
        } else {
            JOptionPane.showMessageDialog(null, "Estoque alto");
        }
    }
}


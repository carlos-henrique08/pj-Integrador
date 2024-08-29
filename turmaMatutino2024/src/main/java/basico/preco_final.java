/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Senac
 */

 import javax.swing.JOptionPane;
public class preco_final {
 public static void main(String[] args) {
     
     
     String valorString = "";
     double valorProduto = 0;
     double desconto = 0;
     double precoFinal = 0;
     String mDesconto = "";
     
     
     

   valorString = JOptionPane.showInputDialog("Digite o valor do produto (em reais): ");

        while (!valorString.matches("^[0-9.]+$")) {
            valorString = JOptionPane.showInputDialog("Valor inválido. Digite um número real: ");
        }

       valorProduto = Double.parseDouble(valorString);
       desconto = (valorProduto > 100) ? valorProduto * 0.1 : 0;
       precoFinal = valorProduto - desconto;

        mDesconto = (desconto > 0) ? " (com 10% de desconto)" : "";

        JOptionPane.showMessageDialog(null, String.format("Preço final: R$ %.2f%s", precoFinal, mDesconto));
    }
} 


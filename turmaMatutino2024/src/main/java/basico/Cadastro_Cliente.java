package Basico;

/**
 *Faça um programa que irá cadastrar clientes e produtos 
 * para uma determinada empresa, onde a 
 * empresa precisa os dados:
   Cliente
   Produto
 * @author Aluno
 */

import javax.swing.JOptionPane;


public class Cadastro_Cliente {
    
    public static void main(String args[]){
        
        String Cliente = "";
        String Produto = "";
        
        
        Cliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        Produto = JOptionPane.showInputDialog("Informe o nome do Produto: ");
        
        
        JOptionPane.showMessageDialog(null,"Nome: "+Cliente+"\nProduto: "+Produto);
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;

/**
 *
 * @author Senac
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CadastroFornecedor {
 public static void main (String args[]){
  
   ArrayList<Fornecedor> Listap = new ArrayList<>(0); 
           
     for(int i=0;i<2;i++){
      
      Fornecedor F = new Fornecedor();
      
      F.setNome(JOptionPane.showInputDialog("informe o Nome: "));
      F.setUF(JOptionPane.showInputDialog("Informe a cidade: "));
      F.setCnpj(Float.parseFloat(JOptionPane.showInputDialog("informe o cnpj")));
      Listap.add(F);
         
     }
      for(int i=0;i<2;i++){
     
     JOptionPane.showMessageDialog(null,"Nome: 1 "+Listap.get(i).getNome()+"\nCNPJ: "+
               Listap.get(i).getCnpj()+"\nCidade: "+Listap.get(i).getUF());
     
 }    
}
}
package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Ano_Bi {
  public static void main(String args[]){
  
   String Ano1 = "";
     int ano = 0;  
      
      
        Ano1 = JOptionPane.showInputDialog("Digite o ano: ");

        while (!Ano1.matches("\\d+")) {
            Ano1 = JOptionPane.showInputDialog("Ano inválido. Digite um número inteiro: ");
        }

        ano = Integer.parseInt(Ano1);

        boolean bissexto;
        if (ano % 4 == 0) {
            if (ano % 100 == 0 && ano % 400 != 0) {
                bissexto = false;
            } else {
                bissexto = true;
            }
        } else {
            bissexto = false;
        }

        String mensagem = bissexto ? "Bissexto" : "Não bissexto";
        JOptionPane.showMessageDialog(null, ano + " é um ano " + mensagem + ".");
    }
}    
      
      
      
      
   


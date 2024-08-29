package basico;

/**
 *
 * @author Senac
 */


import javax.swing.JOptionPane;

public class Matriz_Nomes {
    public static void main(String args[]){
        
     String [][] MatNome = new String[8][3];
     
     
     for(int Lin = 0;Lin < MatNome.length;Lin++){
        for(int Col =0;Col < MatNome[Lin].length;Col++){
              
            MatNome[Lin][Col] = JOptionPane.showInputDialog("informe o nome: ");
            
        }
      }        

      StringBuilder sb = new StringBuilder();
        for (String[] linha : MatNome) {
            for (String elemento : linha) {
                sb.append(elemento).append(' ');
            }
            sb.append('\n');
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    
    
    
    
    
    }
}
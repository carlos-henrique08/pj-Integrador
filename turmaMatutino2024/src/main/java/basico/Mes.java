package basico;
//verificação do mês por número e será mostrado o mês escrito

import javax.swing.JOptionPane;


public class Mes {
    public static void main(String[] args) {
        int Opcao = 0;
        String mes = "";
        
        Opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês por números de 1 até 12: "));
        
        switch(Opcao){
            
            case 1:
                JOptionPane.showMessageDialog(null,"Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Março");
                break;
             case 4:
                JOptionPane.showMessageDialog(null,"Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Junho");
                break;   
            case 7:
                JOptionPane.showMessageDialog(null,"Julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Setembro");
                break;
             case 10:
                JOptionPane.showMessageDialog(null,"Outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"Novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"Dezembro");
                break; 
            default:
                JOptionPane.showMessageDialog(null,"Mês inexistente");
                break;
            
        }
                
                        
                        
            
        
        
        
    }
    
}
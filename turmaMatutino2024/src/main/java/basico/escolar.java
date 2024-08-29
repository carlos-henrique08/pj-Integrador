package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class escolar {
    public static void main(String args[]){
        
        
         String nota1 = JOptionPane.showInputDialog("Digite a  primeira nota: ");
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");

        while (!nota1.matches("[0-9.]+") || !nota2.matches("[0-9.]+") || !nota3.matches("[0-9.]+")) {
            JOptionPane.showMessageDialog(null, "Notas inválidas. Digite apenas números válidos.");
            nota1 = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
            nota2 = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
            nota3 = JOptionPane.showInputDialog("Digite a nota da terceira prova: ");
        }

        double nota01 = Double.parseDouble(nota1);
        double nota02  = Double.parseDouble(nota2);
        double nota03 = Double.parseDouble(nota3);

        double media = (nota01 + nota02 + nota03) / 3;

        String situacao;
        if (media >= 7.0) {
            situacao = "aprovado";
        } else if (media >= 5.0) {
            situacao = "em recuperação";
        } else {
            situacao = "reprovado";
        }

        JOptionPane.showMessageDialog(null, "Situação: " + situacao + ". Média: " + media);
    }
}       


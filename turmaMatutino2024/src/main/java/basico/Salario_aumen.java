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

public class Salario_aumen {
    public static void main(String[] args) {
        
        String salarioString = "";
        double salario = 0;
        double NovoSalario = 0;
                
        salarioString = JOptionPane.showInputDialog("Digite o salário: ");

        while (!salarioString.matches("[0-9.]+")) {
            salarioString = JOptionPane.showInputDialog("Salário inválido. Digite um número real: ");
        }

        salario = Double.parseDouble(salarioString);

        double aumento;
        if (salario <= 1500) {
            aumento = salario * 0.10;
        }else{
            aumento = salario * 0.05;
        }    
        
        
        NovoSalario = salario + aumento;
        
    JOptionPane.showMessageDialog(null,"Valor do aumento: R$ "+aumento+"\nNovo Salario: R$ "
    +NovoSalario);
 }
}

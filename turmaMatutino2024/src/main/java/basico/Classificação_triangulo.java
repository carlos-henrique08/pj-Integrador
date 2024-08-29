package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Classificação_triangulo{
  public static void main(String args[]){
      
   double LadoA = 0;
   double LadoB = 0;
   double LadoC = 0;   
   String Tipo_triangulo = "";
           
    LadoA = Double.parseDouble(JOptionPane.showInputDialog("digite o lado A: "));
    LadoB = Double.parseDouble(JOptionPane.showInputDialog("digite o lado B: "));
    LadoC = Double.parseDouble(JOptionPane.showInputDialog("digite o lado C: "));
    
    
    
    if (LadoA == LadoB && LadoB == LadoC){
             Tipo_triangulo ="Equilátero";
    }else if(LadoA == LadoB || LadoB == LadoC || LadoA == LadoC){
         Tipo_triangulo = "Isósceles";
    }else{
        Tipo_triangulo = "Escaleno";
    }
    
    //JOptionPane.showMessageDialog(null,"Lado A: " + String.valueOf(LadoA) + "\nLado B: " + String.valueOf(LadoB) +
      //  "\nLado C: " + String.valueOf(LadoC) + "\nTipo de Triângulo: " + Tipo_triangulo);
    
    
    JOptionPane.showMessageDialog(null,"Lado A: "+LadoA+"\nLado B: " +LadoB+
      "\nLado C: "+LadoC+"\nTipo de Triângulo: "+Tipo_triangulo);
      
  }  
}

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

public class ES {
    
public static void main(String args[]){
    
       int NumPessoas = 1;   
        String Nome = "";
        double Peso = 0;
        double Altura = 0 ,IMC = 0;
        String Status ="";
        
        int quantAbaixoPeso = 0 ,quantPesoIdeal = 0 ,quantLevAcimaPeso = 0;
        int quantObs1 = 0 ,quantObs2 = 0 ,quantObs3 = 0;
        double somaP = 0;
        double maiorPesoAba = -1 ,maiorPesoIdeal = -1 ,maiorPesoLevAcima = -1;
        double maiorPesoObs1 = -1 ,maiorPesoObs2 = -1 ,maiorPesoObs3 = -1;
        double menorPesoAba = 1000 ,menorPesoIdeal = 1000 ,menorPesoLevAcima = 1000;
        double menorPesoObs1 = 1000 ,menorPesoObs2 = 1000 ,menorPesoObs3 = 1000;


        for (int i = 0; i < NumPessoas; i++) {
            Nome = JOptionPane.showInputDialog("informe o Nome: ");
            Peso = Double.parseDouble(JOptionPane.showInputDialog("Infome o peso de " + Nome + ":"));
            Altura = Double.parseDouble(JOptionPane.showInputDialog("Infome a Altura de " + Nome + ":"));

        
       IMC = Peso /(Altura * Altura);
       
      if(IMC < 18.6){
         quantAbaixoPeso++;
          if (Peso > maiorPesoAba) {
             maiorPesoAba = Peso;  
          }
          if (Peso < menorPesoAba){
              menorPesoAba = Peso;
          } 
      }else if(IMC < 24.9){
          quantPesoIdeal++;
          if(Peso > maiorPesoIdeal){
              maiorPesoIdeal = Peso;
          }
      } else if (IMC < 29.9) {
         quantLevAcimaPeso++;
         if (Peso > maiorPesoLevAcima) {
             maiorPesoLevAcima = Peso;
          }
           if (Peso < menorPesoLevAcima) {
               menorPesoLevAcima = Peso;
         }
      } else if (IMC < 34.9) {
         quantObs1++;
         if (Peso > maiorPesoObs1) {
           maiorPesoObs1 = Peso;
             }
            if (Peso < menorPesoObs1) {
                menorPesoObs1 = Peso;
             }
     } else if (IMC < 39.9) {
        quantObs2++;
        if (Peso > maiorPesoObs2) {
          maiorPesoObs2 = Peso;
             }
          if (Peso < menorPesoObs2) {
             menorPesoObs2 = Peso;
             }
     } else {
      quantObs3++;
      if (Peso > maiorPesoObs3) {
          maiorPesoObs3 = Peso;
             }
         if (Peso < menorPesoObs3) {
             menorPesoObs3 = Peso;
             }
            
     
       }
  }
        

  JOptionPane.showMessageDialog(null, "Nome da pessoas abaixo do peso :"+Nome+
          "\nO maior Peso abaixo do peso: " +maiorPesoAba+ 
          "\nO menor Peso abaixo do peso: " +menorPesoAba);
 
        
        
        
   }

} 
        
        
        
        
        
        
        





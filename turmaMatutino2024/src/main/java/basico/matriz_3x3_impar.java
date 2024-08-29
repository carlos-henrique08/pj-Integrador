/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author Senac
 */

import java.util.Arrays;
import javax.swing.JOptionPane;


public class matriz_3x3_impar {
 public static void main(String[] args) {
        final int TAM=3;
        int [][] MatImpar = new int[TAM][TAM]; 
        
        for(int Lin=0;Lin<MatImpar.length;Lin++){
           
            for(int Col=0;Col<MatImpar[0].length;Col++){
               int Num=0;
               while( Num % 2 == 0){ 
                 Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um núemro Impar:"));
                 if(Num % 2 == 0){
                     // JOptionPane.showMessageDialog(null,"Fiiii, digita um número impar....");
                 }
               } 
                MatImpar[Lin][Col]= Num;
           } 
        }
       JOptionPane.showMessageDialog(null,Arrays.deepToString(MatImpar));
        
        StringBuilder sb = new StringBuilder();
        for (int[] linha : MatImpar) {
            for (int elemento : linha) {
                 sb.append(elemento).append(' ');
            }
        sb.append('\n');
        }
        JOptionPane.showMessageDialog(null,
        sb.toString());  
        
    }
    
} 


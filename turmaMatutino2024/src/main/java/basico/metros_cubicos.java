package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class metros_cubicos {
  public static void main(String args []){
   
   String Nome = "";
   final float TXCOM = 2.84f;
   final float TXRES = 2.68f;
    float Gasto = 0f, TotalPagar = 0f;
    int  TipoUsuario = 0;
    String TipoUs = "";
        
        
    Nome = JOptionPane.showInputDialog("Informe o nome");
    Gasto = Float.parseFloat(JOptionPane.showInputDialog("Informe o gasto"));
    TipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 para Residencial "+
                    "e 2 para Comercial:"));
    
    if(TipoUsuario == 1){
      TipoUs = "Residencial";
      TotalPagar = Gasto * TXRES;
    }else if(TipoUsuario == 2){
      TipoUs = "Comercial";
      TotalPagar = Gasto * TXCOM;
    }else{ 
        JOptionPane.showInputDialog("Informe se é 1 para Residencial ou  "+
            "2 para Comercial.");
  
       //if(TipoUsuario == 1 || TipoUsuario == 2){
        //}else{
       
             JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nTipo de Usuario: "+TipoUs+
                "Gasto: "+Gasto+"\nTotal a pagar: "+TotalPagar);
       
    }
    
  }
}

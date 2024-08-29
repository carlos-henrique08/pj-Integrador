package basico;

/**
 *
 * @author Senac
 */

import javax.swing.JOptionPane;

public class Conta_luz {
   public static void main(String args[]){
    
             String Usuario="";
        final float TXRESID = 0.871F;
        final float TXCOM = 0.999F;
        int NumUsuario = 0;
        float GastoKw = 0f,TotalPagar = 0f;
        int  TipoUsuario = 0;
        String TipoUs = "";
        
        Usuario = JOptionPane.showInputDialog("Nome do usuário: ");
        NumUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº do usuário: "));
        GastoKw = Float.parseFloat(JOptionPane.showInputDialog("Informe o gasto em Kw"));
        TipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 para Residencial "+
                    "e 2 para Comercial:"));
        if(TipoUsuario == 1){
            TipoUs = "Residencial";
            TotalPagar = GastoKw * TXRESID;
        }else if(TipoUsuario == 2){
            TipoUs = "Comercial";
            TotalPagar = GastoKw * TXCOM;
        }else{
            JOptionPane.showMessageDialog(null,"Informe se é 1 para Residencial ou  "+
                    "2 para Comercial.");
        }
        
        if (TipoUsuario ==1 || TipoUsuario == 2){
            
            JOptionPane.showMessageDialog(null,"Nome do usuário: "+Usuario+
                    "\nNúmero do usuário: "+NumUsuario+"\nTipo de Usuario: "+TipoUs+
                    "\nGasto do Kw/h:"+GastoKw+"\nTotal a Pagar: "+TotalPagar);
       }
        
    }
            
}

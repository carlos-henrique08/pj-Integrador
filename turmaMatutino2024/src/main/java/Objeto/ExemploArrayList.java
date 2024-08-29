package Objeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ExemploArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Pessoa> Listap = new ArrayList<>();
        
        for(int i=0;i<2;i++){
            
            Pessoa pp = new Pessoa();
            
            pp.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
            pp.setCelular(JOptionPane.showInputDialog("Informe o celular: "));
            pp.setCidade(JOptionPane.showInputDialog("Informe a Cidade: "));
            Listap.add(pp);
         
        }
        Pessoa pp = new Pessoa();
        
        pp.setNome("enildo");  
        pp.setCelular("05803485");
        pp.setCidade("Goiânia");
        Listap.set(0, pp);
        
       JOptionPane.showMessageDialog(null,"Nome: 1 "+Listap.get(0).getNome()+"\ncelular: "+
               Listap.get(0).getCelular()+"\nCidade: "+Listap.get(0).getCidade());
    }
    
}
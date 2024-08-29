package CONTAS_A_PAGAR;

import ClasseEspeciais.Dao;
import java.util.ArrayList;


public class ContasAPagar_Controle implements Dao {

    @Override
    public void insert(Object o) {
     ContasAPagarDao CAD = new ContasAPagarDao();
     CAD.insert(o);
    }

    @Override
    public void update(Object o) {
     ContasAPagarDao CAD = new ContasAPagarDao();
     CAD.update(o);   
    }

    @Override
    public void delete(int cod) {
    ContasAPagarDao CAD = new ContasAPagarDao();
     CAD.delete(cod);    
    }

   
    public void selectAll() {
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaContasAPagar().ExibirTabela();
            } 
     });
    }
    
}

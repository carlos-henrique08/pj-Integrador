package CLIENTE;

import ClasseEspeciais.Dao;
import java.util.ArrayList;


public class ClienteControle implements Dao{



    @Override
    public void insert(Object o) {
       ClienteDao CD = new ClienteDao();
       CD.insert(o);
    }

    @Override
    public void update(Object o) {
        ClienteDao CD = new ClienteDao();
       CD.update(o);
    }

    @Override
    public void delete(int cod) {
      ClienteDao CD = new ClienteDao();  
       CD.delete(cod);
    }

   
   
    public void selectAll() {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new TabelaCliente().ExibirTabela();
         } 
    }); 
  
   }
    
}
package FUNCIONARIOS;

import ClasseEspeciais.Dao;
import java.util.ArrayList;


public class FuncionarioControle implements Dao {

    @Override
    public void insert(Object o) {
     FuncionariosDao FD = new FuncionariosDao();
     FD.insert(o);
    }

    @Override
    public void update(Object o) {
      FuncionariosDao FD = new FuncionariosDao();
      FD.update(o);
    }

    @Override
    public void delete(int cod) {
     FuncionariosDao FD = new FuncionariosDao();
     FD.delete(cod);
    }

   
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

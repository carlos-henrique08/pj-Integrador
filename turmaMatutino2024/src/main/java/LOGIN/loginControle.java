
package LOGIN;

import ClasseEspeciais.Dao;


public class loginControle implements Dao {

    @Override
    public void insert(Object o) {
     LoginDao LD = new LoginDao();
     LD.insert(o);
    }

    @Override
    public void update(Object o) {
     LoginDao LD = new LoginDao();
     LD.update(o);
    }

    @Override
    public void delete(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
  public void Logar(login user) {
    LoginDao LD = new LoginDao ();
    LD.logar(user);
  
  }  
}

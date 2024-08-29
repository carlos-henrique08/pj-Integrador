
package LOGIN;

import ClasseEspeciais.Dao;
import ClasseEspeciais.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginDao implements Dao {

    @Override
    public void insert(Object o) {
        login lg = (login) o;
        
        String sql = "insert into login(Usuario,Senha,Status)"
                + "values (?,?,?)";
        
        try{
            PreparedStatement ps = conexao.getConexao().prepareCall(sql);
            ps.setString(1, lg.getUsuario());
            ps.setString(2, lg.getSenha());
            ps.setString(3, lg.getStatus());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 450");
        }

    }

    @Override
    public void update(Object o) {
         login lg = (login) o;
        
        String sql = "update login set Usuario=?, Senha=?, Status=? where Codlogin=?";  
               
        try{
            PreparedStatement ps = conexao.getConexao().prepareCall(sql);
            ps.setString(1, lg.getUsuario());
            ps.setString(2, lg.getSenha());
            ps.setString(3, lg.getStatus());
            ps.setInt(4, lg.getCodlogin());
            int atual =ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
               JOptionPane.showMessageDialog(null,"Não foi Gravado com sucesso!!");
            }
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,"error: 451");
        }

    }

    @Override
    public void delete(int cod) {
      
    }
     public void logar(login user) {
        login lg = (login) user;
        
        String sql = "select Usuario,Senha from login where Usuario=? and Senha=? ";
        
         try{
            PreparedStatement ps = conexao.getConexao().prepareCall(sql);
            ps.setString(1, lg.getUsuario());
            ps.setString(2, lg.getSenha());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
             // PrincipalPrincipal p = new PrincipalPrincipal ();
              //p.MenuPrincipal();
            }else{JOptionPane.showMessageDialog(null,"Dados invalidos!");
    } 
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);    
        }          
  }

 

   
    }
    


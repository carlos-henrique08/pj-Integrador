
package CLIENTE;

import ClasseEspeciais.Dao;
import ClasseEspeciais.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDao implements Dao {

    @Override
    public void insert(Object o) {
        
    Cliente C = (Cliente) o;
       String sql = "insert into Cliente(Nome,CPF,Endereco,Telefone,Email,DataNasci,Sexo,EstadoCivil,Profissao)"
               +"values(?,?,?,?,?,?,?,?,?)";
     try{
       PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
       ps.setString(1,C.getNome());
       ps.setString(2, C.getCPF());
       ps.setString(3, C.getEndereco());
       ps.setString(4, C.getTelefone());
       ps.setString(5, C.getEmail());
       ps.setString(6, C.getDataNasci());
       ps.setString(7, C.getSexo());
       ps.setString(8, C.getEstadoCivil());
       ps.setString(9, C.getProfissao());
       int atual = ps.executeUpdate();
         if(atual>0){
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!! ");
         }else{
             JOptionPane.showMessageDialog(null, "Não foi gravado!! ");
         }
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "erro: 448");
      
       }
   }
    

    @Override
    public void update(Object o) {
      Cliente C = (Cliente) o;
       String sql = "update Cliente set Nome=? ,CPF=? ,Endereco=? ,Telefone=? ,Email=? ,DataNasci=? ,Sexo=? ,EstadoCivil=? ,Profissao=? where CodCliente_=?";
        try{
       PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
       ps.setString(1,C.getNome());
       ps.setString(2, C.getCPF());
       ps.setString(3, C.getEndereco());
       ps.setString(4, C.getTelefone());
       ps.setString(5, C.getEmail());
       ps.setString(6, C.getDataNasci());
       ps.setString(7, C.getSexo());
       ps.setString(8, C.getEstadoCivil());
       ps.setString(9, C.getProfissao());
       ps.setInt(10,C.getCodCliente() );
       int atual = ps.executeUpdate();
    if(atual>0){
     JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");
        }else{
           JOptionPane.showMessageDialog(null, "Não houve Atualização!!");
         }
         ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: 449");
    }
        
  }

    @Override
    public void delete(int cod) {
     String sql = "delete from Cliente where CodCliente_=?";
     try{
       PreparedStatement  ps = conexao.getConexao().prepareStatement(sql);
       ps.setInt(1, cod);
       int atual = ps.executeUpdate();
       if(atual>0){
         JOptionPane.showMessageDialog(null,"Exlusão com sucesso!");  
       }else{
         JOptionPane.showMessageDialog(null,"Não houve a Exlusão");  
       }
     }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"error: 450");
 
      } 
    }       

   
    public ArrayList<Cliente> selectAll() {
     ArrayList<Cliente> ArrayC = new ArrayList<>();
     String sql = "select * from Cliente";
     try{
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
       
        while(rs.next()){
            
        Cliente C = new Cliente();
        C.setCodCliente(rs.getInt("CodCliente_"));
        C.setNome(rs.getString("Nome"));
        C.setCPF(rs.getString("CPF"));
        C.setTelefone(rs.getString("Telefone"));
        C.setEndereco(rs.getString("Endereco"));
        C.setEmail(rs.getString("Email"));
        C.setDataNasci(rs.getString("DataNasci"));
        C.setSexo(rs.getString("Sexo"));
        C.setEstadoCivil(rs.getString("EstadoCivil"));
        C.setProfissao(rs.getString("Profissao"));
        
        ArrayC.add(C);
        }
        
     }catch(SQLException e){
      JOptionPane.showMessageDialog(null,"error: 452");   
     }
     return ArrayC;
    }
    
}

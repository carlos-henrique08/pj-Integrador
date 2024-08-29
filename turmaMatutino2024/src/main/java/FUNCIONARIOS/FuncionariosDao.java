package FUNCIONARIOS;

import ClasseEspeciais.Dao;
import ClasseEspeciais.conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionariosDao implements Dao {

    @Override
    public void insert(Object o) {
      Funcionarios F = (Funcionarios) o;
      String sql = "insert into Funcionario(Nome,CPF,Endereco,Telefone,Email,DataAdmissao,Cargo,Salario,Departamento)"
        + " values(?,?,?,?,?,?,?,?,?)";
      try{
       PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
       ps.setString(1, F.getNome());
       ps.setString(2, F.getCPF());
       ps.setString(3, F.getEndereco());
       ps.setString(4, F.getTelefone());
       ps.setString(5, F.getEmail());
       ps.setString(6, F.getDataAdmissao());
       ps.setString(7, F.getCargo());
       ps.setString(8, F.getSalario());
       ps.setString(9, F.getDepartamento());
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
       Funcionarios F = (Funcionarios) o;
      String sql = "update Funcionario set Nome=?, CPF=?, Endereco=?, Telefone=?, Email=?, DataAdmissao=? ,Cargo=?, Salario=?, Departamento=? where CodFuncionario_=?";
      try{
       PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
       ps.setString(1, F.getNome());
       ps.setString(2, F.getCPF());
       ps.setString(3, F.getEndereco());
       ps.setString(4, F.getTelefone());
       ps.setString(5, F.getEmail());
       ps.setString(6, F.getDataAdmissao());
       ps.setString(7, F.getCargo());
       ps.setString(8, F.getSalario());
       ps.setString(9, F.getDepartamento());
       ps.setInt(10, F.getCodFuncionarios());
       int atual = ps.executeUpdate();
         if(atual>0){
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");
         }else{
             JOptionPane.showMessageDialog(null, "Não houve Atualização!!");
         }
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Error: 449");  
    }
    }

    @Override
    public void delete(int cod) {
     String sql = "delete from Funcionario where CodFuncionario_= ?";
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
     
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}

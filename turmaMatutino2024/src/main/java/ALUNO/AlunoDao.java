
package ALUNO;

import ClasseEspeciais.Dao;
import ClasseEspeciais.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class AlunoDao implements Dao {

    @Override
    public void insert(Object o) {
     
    Alunos A = (Alunos) o;
      String sql = "insert into Aluno(Nome,CPF,Endereco,Telefone,Email,DataNasci,SerieAno,NomeRespo,EscolaOrigem)"
        + " values(?,?,?,?,?,?,?,?,?)";
      try{
       PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
       ps.setString(1, A.getNome());
       ps.setString(2, A.getCPF());
       ps.setString(3, A.getEndereco());
       ps.setString(4, A.getTelefone());
       ps.setString(5, A.getEmail());
       ps.setString(6, A.getDataNasci());
       ps.setString(7, A.getSerieAno());
       ps.setString(8, A.getNomeRespo());
       ps.setString(9, A.getEscolaOrigem());
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
      Alunos A =(Alunos) o;
       String sgl = "update Aluno set Nome=?, CPF=?, Endereco=?, Telefone=?, Email=?, DataNasci=?, SerieAno=?, NomeRespo=?, EscolaOrigem=? where CodAlunos_=?";
        try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sgl);
           ps.setString(1,A.getNome());
           ps.setString(2,A.getCPF());
           ps.setString(3,A.getEndereco());
           ps.setString(4,A.getTelefone());
           ps.setString(5,A.getEmail());
           ps.setString(6,A.getDataNasci());
           ps.setString(7,A.getSerieAno());
           ps.setString(8,A.getNomeRespo());
           ps.setString(9,A.getEscolaOrigem());
           ps.setInt(10,A.getCodAlunos());
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
    String sql = "delete from Aluno where CodAlunos_= ?";
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
    

    public ArrayList<Alunos> selectAll() {
     ArrayList<Alunos> ArrayA = new ArrayList<>();
     String sql = "select * from Aluno";
     try{
         PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         
         while(rs.next()){
            
          Alunos A = new Alunos();
          A.setCodAlunos(rs.getInt("CodAlunos_"));
          A.setNome(rs.getString("Nome"));
          A.setCPF(rs.getString("CPF"));
          A.setEndereco(rs.getString("Endereco"));
          A.setTelefone(rs.getString("Telefone"));
          A.setEmail(rs.getString("Email"));
          A.setDataNasci(rs.getString("DataNasci"));
          A.setSerieAno(rs.getString("SerieAno"));
          A.setNomeRespo(rs.getString("NomeRespo"));
          A.setEscolaOrigem(rs.getString("EscolaOrigem"));
          
          ArrayA.add(A);
          
          }
         
       }catch(SQLException e){
         JOptionPane.showMessageDialog(null,"error: 452");
       }
     
       return ArrayA;
 
    }
    
}
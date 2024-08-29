package CONTAS_A_PAGAR;

import ClasseEspeciais.Dao;
import ClasseEspeciais.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ContasAPagarDao implements Dao{

    @Override
    public void insert(Object o) {
        
      ContasAPagar CAP = (ContasAPagar) o;
      String sql = "insert into ContasAPagar(Descricao,Valor,DataVencimento,DataPagamento,Fornecedor,Categoria,StatusPagamento,Metodopagamento,Observacoes)"
        + " values(?,?,?,?,?,?,?,?,?)";
      try{
       PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
       ps.setString(1, CAP.getDescricao());
       ps.setString(2, CAP.getValor());
       ps.setString(3, CAP.getDataVencimento());
       ps.setString(4, CAP.getDataPagamento());
       ps.setString(5, CAP.getFornecedor());
       ps.setString(6, CAP.getCategoria());
       ps.setString(7, CAP.getStatusPagamento());
       ps.setString(8, CAP.getMetodoPagamento());
       ps.setString(9, CAP.getObservacoes());
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
     ContasAPagar CAP = (ContasAPagar) o;
      String sql = "update ContasAPagar set Descricao=?, Valor=?, DataVencimento=?, "
          + "DataPagamento=?, Fornecedor=?, Categoria=?, StatusPagamento=?, "
          + "MetodoPagamento=?, Observacoes =? where CodcontasAPagar_ =?";
  
      try{
       PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
       ps.setString(1, CAP.getDescricao());
       ps.setString(2, CAP.getValor());
       ps.setString(3, CAP.getDataVencimento());
       ps.setString(4, CAP.getDataPagamento());
       ps.setString(5, CAP.getFornecedor());
       ps.setString(6, CAP.getCategoria());
       ps.setString(7, CAP.getStatusPagamento());
       ps.setString(8, CAP.getMetodoPagamento());
       ps.setString(9, CAP.getObservacoes());
       ps.setInt(10, CAP.getCodContasAPagar());
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
       String sql = "delete from ContasAPagar where CodcontasAPagar_= ?";
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

  
    public ArrayList<ContasAPagar> selectAll() {
     ArrayList<ContasAPagar> ArrayCAP = new ArrayList<>();
     String sql = "select * from ContasAPagar";
     try{
         PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         
         while(rs.next()){
             
         ContasAPagar CAP = new ContasAPagar();
         
         CAP.setCodContasAPagar(rs.getInt("CodcontasAPagar_"));
         CAP.setDescricao(rs.getString("Descricao"));
         CAP.setValor(rs.getString("Valor"));
         CAP.setDataVencimento(rs.getString("DataVencimento"));
         CAP.setDataPagamento(rs.getString("Datapagamento"));
         CAP.setFornecedor(rs.getString("Fornecedor"));
         CAP.setCategoria(rs.getString("Categoria"));
         CAP.setStatusPagamento(rs.getString("StatusPagamento"));
         CAP.setMetodoPagamento(rs.getString("Metodopagamento"));
         CAP.setObservacoes(rs.getString("Observacoes"));
         }
     
     }catch(SQLException e){
    JOptionPane.showMessageDialog(null,"error: 452");
     } 
     
  return ArrayCAP;
 
    }
}   
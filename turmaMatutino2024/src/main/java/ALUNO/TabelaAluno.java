package ALUNO;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaAluno {
    public static AlunoDao ADao = new AlunoDao();
    public void ExibirTabela(){
        
      ArrayList<Alunos> Aa = new ArrayList<>();
      Aa = ADao.selectAll();
      
      JFrame frame = new JFrame("----TABELA DE ALUNOS-----");
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setBounds(380, 80, 500, 300);
      
      JPanel pane = new JPanel();
      pane.setLayout(new FlowLayout());
       
      DefaultTableModel model = new DefaultTableModel();
       
      model.addColumn("Codigo");
      model.addColumn("Nome");
      model.addColumn("CPF");
      model.addColumn("Endereço");
      model.addColumn("Telefone");
      model.addColumn("Email");
      model.addColumn("Data Nascimento");
      model.addColumn("Serie Ano");
      model.addColumn("Nome Responsavel");
      model.addColumn("Escola de Origem");
      int i = 0;
      boolean parar = true;
      
      while(parar){
        if(i<Aa.size()){
         model.addRow(new Object [] {Aa.get(i).getCodAlunos(),
             Aa.get(i).getNome(),Aa.get(i).getCPF(),Aa.get(i).getEndereco(),Aa.get(i).getTelefone(),
             Aa.get(i).getEmail(),Aa.get(i).getDataNasci(),Aa.get(i).getSerieAno(),
             Aa.get(i).getNomeRespo(),Aa.get(i).getEscolaOrigem()
                 
         });
         i++;
 
        }else{
          parar = false;  
        }  
      }
      
     JTable tabela = new JTable(model);
     
     JScrollPane Scrol = new JScrollPane(tabela);
     
     pane.add(Scrol);
     
     frame.add(pane);
     
     
     frame.setVisible(true);
    // frame.setResizable(false);
     
      
    }
}

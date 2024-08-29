package CONTAS_A_PAGAR;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaContasAPagar {
   public static ContasAPagarDao CAD = new ContasAPagarDao();
   public void ExibirTabela(){
       
    ArrayList<ContasAPagar> Acp = new ArrayList<>();
     Acp = CAD.selectAll();
     
     JFrame frame = new JFrame("----TABELA DE CONTAS A PAGAR-----");
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setBounds(380, 80, 500, 300);
      
      JPanel pane = new JPanel();
      pane.setLayout(new FlowLayout());
       
      DefaultTableModel model = new DefaultTableModel();
      
      model.addColumn("Codigo");
      model.addColumn("Descricao");
      model.addColumn("Valor");
      model.addColumn("DataVencimento");
      model.addColumn("DataPagamento");
      model.addColumn("Fornecedor");
      model.addColumn("Categoria");
      model.addColumn("StatusPagamento");
      model.addColumn("MetodoPagamento");
      model.addColumn("Observacoes");
      int i = 0;
      boolean parar = true;
      
      while(parar){
        if(i<Acp.size()){
         model.addRow(new Object [] {Acp.get(i).getCodContasAPagar(),
        Acp.get(i).getDescricao(),Acp.get(i).getValor(),Acp.get(i).getDataVencimento(),
        Acp.get(i).getDataPagamento(),Acp.get(i).getFornecedor(),Acp.get(i).getCategoria(),
        Acp.get(i).getStatusPagamento(),Acp.get(i).getMetodoPagamento(),Acp.get(i).getObservacoes()
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


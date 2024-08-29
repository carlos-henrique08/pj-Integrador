/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLIENTE;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Senac
 */
public class TabelaCliente {
    public static ClienteDao CDao = new ClienteDao();
    public void ExibirTabela(){
        
        ArrayList<Cliente> Ac = new ArrayList<>();
        Ac = CDao.selectAll();
        
        JFrame frame = new JFrame("----TABELA DE CLIENTE-----");
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
      model.addColumn("Sexo");
      model.addColumn("Estado Civil");
      model.addColumn("Profissão");
      int i = 0;
      boolean parar = true;
      
      while(parar){
        if(i<Ac.size()){
         model.addRow(new Object [] {Ac.get(i).getCodCliente(),
             Ac.get(i).getNome(),Ac.get(i).getCPF(),Ac.get(i).getEndereco(),Ac.get(i).getTelefone(),
             Ac.get(i).getEmail(),Ac.get(i).getDataNasci(),Ac.get(i).getSexo(),
             Ac.get(i).getEstadoCivil(),Ac.get(i).getProfissao()
                 
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

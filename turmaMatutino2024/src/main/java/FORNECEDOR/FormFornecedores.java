/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORNECEDOR;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class FormFornecedores extends javax.swing.JFrame {

    /**
     * Creates new form FormFornecedores
     */
    public FormFornecedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbCNPJ = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbNomeContato = new javax.swing.JLabel();
        lbTipoProduto = new javax.swing.JLabel();
        lbCondPagamento = new javax.swing.JLabel();
        lbPrazoEntrega = new javax.swing.JLabel();
        txfCondPagamento = new javax.swing.JTextField();
        txfPrazoEntrega = new javax.swing.JTextField();
        txfTipoProduto = new javax.swing.JTextField();
        txfNomeContato = new javax.swing.JTextField();
        txfEmail = new javax.swing.JTextField();
        txfTelefone = new javax.swing.JTextField();
        txfEndereco = new javax.swing.JTextField();
        txfCNPJ = new javax.swing.JTextField();
        txfNome = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lbNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNome.setText("Nome");

        lbCNPJ.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCNPJ.setText("CNPJ");

        lbEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEndereco.setText("Endereço");

        lbTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTelefone.setText("Telefone");

        lbEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEmail.setText("Email");

        lbNomeContato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNomeContato.setText("Nome do Contato");

        lbTipoProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTipoProduto.setText("Tipo de Produto");

        lbCondPagamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCondPagamento.setText("Condições de Pagamento");

        lbPrazoEntrega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPrazoEntrega.setText("Prazo de Entrega");

        txfNomeContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeContatoActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbCondPagamento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeContato, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPrazoEntrega, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTipoProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCNPJ, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNome, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPrazoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfCondPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGravar)
                .addGap(220, 220, 220))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCNPJ))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEndereco))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeContato)
                    .addComponent(txfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoProduto)
                    .addComponent(txfTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCondPagamento)
                    .addComponent(txfCondPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPrazoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrazoEntrega))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGravar)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNomeContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeContatoActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        Fornecedor F = this.MontarFornecedor();
        JOptionPane.showMessageDialog(null, "\nNome: "+F.getNome()+ "\nCNPJ: "+F.getCNPJ()+
             "\nEndereço: "+F.getEndereço()+ "\nTelefone: "+F.getTelefone()+ "\nEmail: "+F.getEmail()+
              "\nNome do Contato: "+F.getNomeContato()+ "\nTipo de produto: "+F.getTProduto()+
               "\nCondição de Pagamento: "+F.getCondPagamento()+ "\nPrazo de Entrega: "+F.getPrazoEntrega());        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
        Fornecedor F = this.MontarFornecedor();
        FornecedorControle FC = new FornecedorControle();
        FC.insert(FC);
        
    }//GEN-LAST:event_btnGravarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFornecedores().setVisible(true);
            }
        });
    }
    public Fornecedor MontarFornecedor(){
     Fornecedor F = new Fornecedor();
     F.setNome(txfNome.getText());
     F.setCNPJ(Integer.parseInt(txfCNPJ.getText()));
     F.setEndereço(txfEndereco.getText());
     F.setTelefone(Float.parseFloat(txfTelefone.getText()));
     F.setEmail(txfEmail.getText());
     F.setNomeContato(txfNomeContato.getText());
     F.setTProduto(txfTipoProduto.getText());
     F.setCondPagamento(txfCondPagamento.getText());
     F.setPrazoEntrega(txfPrazoEntrega.getText());
     
     return F;
     
    }
    
    public void Limpar(){
     txfNome.setText("");
     txfCNPJ.setText("");
     txfEndereco.setText("");
     txfTelefone.setText("");
     txfEmail.setText("");
     txfNomeContato.setText("");
     txfTipoProduto.setText("");
     txfCondPagamento.setText("");
     txfPrazoEntrega.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCondPagamento;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeContato;
    private javax.swing.JLabel lbPrazoEntrega;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTipoProduto;
    private javax.swing.JTextField txfCNPJ;
    private javax.swing.JTextField txfCondPagamento;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfEndereco;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfNomeContato;
    private javax.swing.JTextField txfPrazoEntrega;
    private javax.swing.JTextField txfTelefone;
    private javax.swing.JTextField txfTipoProduto;
    // End of variables declaration//GEN-END:variables
}

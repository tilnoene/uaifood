/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Eduardo
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
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

        jPanel1 = new javax.swing.JPanel();
        jlTituloProduto = new javax.swing.JLabel();
        jlNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jlValorProduto = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JTextField();
        jlDescricaoProduto = new javax.swing.JLabel();
        jlCategoriaProduto = new javax.swing.JLabel();
        cmbCategoriaProduto = new javax.swing.JComboBox<>();
        jlDiaDaPromocaoProduto = new javax.swing.JLabel();
        cmbjlDiaDaPromocaoProduto = new javax.swing.JComboBox<>();
        rbtnAlcoolicoProduto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricaoProduto = new javax.swing.JTextArea();
        btnNovoProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnPesquisarProduto = new javax.swing.JButton();
        btnVoltarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 29, 44));

        jlTituloProduto.setFont(new java.awt.Font("Sul Sans", 0, 24)); // NOI18N
        jlTituloProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloProduto.setText("Novo Produto");

        jlNomeProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeProduto.setText("Nome:");

        txtNomeProduto.setBackground(new java.awt.Color(234, 29, 44));
        txtNomeProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jlValorProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlValorProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlValorProduto.setText("Valor:");

        txtValorProduto.setBackground(new java.awt.Color(234, 29, 44));
        txtValorProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtValorProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtValorProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jlDescricaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDescricaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlDescricaoProduto.setText("Descrição:");

        jlCategoriaProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlCategoriaProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlCategoriaProduto.setText("Categoria:");

        cmbCategoriaProduto.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlDiaDaPromocaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDiaDaPromocaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlDiaDaPromocaoProduto.setText("Dia da promoção:");

        cmbjlDiaDaPromocaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbjlDiaDaPromocaoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rbtnAlcoolicoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        rbtnAlcoolicoProduto.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAlcoolicoProduto.setText("Alcoolico");
        rbtnAlcoolicoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAlcoolicoProdutoActionPerformed(evt);
            }
        });

        jtaDescricaoProduto.setBackground(new java.awt.Color(234, 29, 44));
        jtaDescricaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jtaDescricaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jtaDescricaoProduto.setRows(5);
        jtaDescricaoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jScrollPane1.setViewportView(jtaDescricaoProduto);

        btnNovoProduto.setText("NOVO");

        btnEditarProduto.setText("EDITAR");

        btnExcluirProduto.setText("EXCLUIR");

        btnPesquisarProduto.setText("PESQUISAR");
        btnPesquisarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPesquisarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnVoltarProduto.setText("VOLTAR");
        btnVoltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarProduto)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtValorProduto)
                        .addComponent(txtNomeProduto)
                        .addComponent(rbtnAlcoolicoProduto)
                        .addComponent(jlDescricaoProduto)
                        .addComponent(jlValorProduto)
                        .addComponent(jlNomeProduto)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCategoriaProduto)
                                .addComponent(cmbCategoriaProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbjlDiaDaPromocaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlDiaDaPromocaoProduto)))
                        .addComponent(jScrollPane1)
                        .addComponent(jlTituloProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnNovoProduto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEditarProduto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnExcluirProduto))
                        .addComponent(btnVoltarProduto, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTituloProduto)
                .addGap(30, 30, 30)
                .addComponent(jlNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlValorProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDescricaoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCategoriaProduto)
                    .addComponent(jlDiaDaPromocaoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbjlDiaDaPromocaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnAlcoolicoProduto)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto)
                    .addComponent(btnEditarProduto)
                    .addComponent(btnExcluirProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnVoltarProduto)
                .addGap(17, 17, 17))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnAlcoolicoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAlcoolicoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAlcoolicoProdutoActionPerformed

    private void btnVoltarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarProdutoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JButton btnVoltarProduto;
    private javax.swing.JComboBox<String> cmbCategoriaProduto;
    private javax.swing.JComboBox<String> cmbjlDiaDaPromocaoProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCategoriaProduto;
    private javax.swing.JLabel jlDescricaoProduto;
    private javax.swing.JLabel jlDiaDaPromocaoProduto;
    private javax.swing.JLabel jlNomeProduto;
    private javax.swing.JLabel jlTituloProduto;
    private javax.swing.JLabel jlValorProduto;
    private javax.swing.JTextArea jtaDescricaoProduto;
    private javax.swing.JRadioButton rbtnAlcoolicoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}

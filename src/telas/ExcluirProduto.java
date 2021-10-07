/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.ManipuladorArquivo;
import classes.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */

class MyComboBoxModel extends DefaultComboBoxModel<String> {
    public MyComboBoxModel(String[] items) {
        super(items);
    }
 
    @Override
    public String getSelectedItem() {
        String selectedString = (String) super.getSelectedItem();
 
        return selectedString;
    }
}

public class ExcluirProduto extends javax.swing.JFrame {
    private ArrayList<Produto> produtos;
    
    /**
     * Creates new form CadastroProduto
     */
    public ExcluirProduto() {
        initComponents();
        
        carregarProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSelecionarProduto = new javax.swing.JPanel();
        cmbProdutos = new javax.swing.JComboBox<>();
        jlDescricaoProduto1 = new javax.swing.JLabel();
        btnNovoProduto1 = new javax.swing.JButton();
        btnNovoProduto2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Produto");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_uaifood.png")).getImage());
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSelecionarProduto.setBackground(new java.awt.Color(234, 29, 44));
        jpSelecionarProduto.setMaximumSize(null);
        jpSelecionarProduto.setPreferredSize(new java.awt.Dimension(360, 640));

        cmbProdutos.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlDescricaoProduto1.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDescricaoProduto1.setForeground(new java.awt.Color(255, 255, 255));
        jlDescricaoProduto1.setText("Selecione um produto:");

        btnNovoProduto1.setBackground(new java.awt.Color(234, 29, 44));
        btnNovoProduto1.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnNovoProduto1.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_fechar_branco.png"))); // NOI18N
        btnNovoProduto1.setText("Excluir");
        btnNovoProduto1.setBorder(null);
        btnNovoProduto1.setBorderPainted(false);
        btnNovoProduto1.setContentAreaFilled(false);
        btnNovoProduto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProduto1ActionPerformed(evt);
            }
        });

        btnNovoProduto2.setBackground(new java.awt.Color(234, 29, 44));
        btnNovoProduto2.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnNovoProduto2.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProduto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_voltar_branco.png"))); // NOI18N
        btnNovoProduto2.setText("Voltar");
        btnNovoProduto2.setBorder(null);
        btnNovoProduto2.setBorderPainted(false);
        btnNovoProduto2.setContentAreaFilled(false);
        btnNovoProduto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProduto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSelecionarProdutoLayout = new javax.swing.GroupLayout(jpSelecionarProduto);
        jpSelecionarProduto.setLayout(jpSelecionarProdutoLayout);
        jpSelecionarProdutoLayout.setHorizontalGroup(
            jpSelecionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarProdutoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jpSelecionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNovoProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cmbProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDescricaoProduto1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoProduto2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jpSelecionarProdutoLayout.setVerticalGroup(
            jpSelecionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarProdutoLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jlDescricaoProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );

        getContentPane().add(jpSelecionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProduto1ActionPerformed
        // TODO add your handling code here:
        int indice_produto = cmbProdutos.getSelectedIndex();
        Produto produto = produtos.get(indice_produto);

        try {
            ManipuladorArquivo.excluirProduto(produto);
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
            
            carregarProdutos();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! O produto não foi excluído.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNovoProduto1ActionPerformed

    private void btnNovoProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProduto2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnNovoProduto2ActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoProduto1;
    private javax.swing.JButton btnNovoProduto2;
    private javax.swing.JComboBox<String> cmbProdutos;
    private javax.swing.JLabel jlDescricaoProduto1;
    private javax.swing.JPanel jpSelecionarProduto;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutos() {
        try {
            produtos = ManipuladorArquivo.carregarProdutos();
            ArrayList<String> nomes_produtos = new ArrayList();
            
            for (Produto produto : produtos) {
                nomes_produtos.add(String.valueOf(produto.getCodProduto()) + " - " + produto.getNome());
            }
            
            MyComboBoxModel myModel = new MyComboBoxModel(nomes_produtos.toArray(new String[0]));
            cmbProdutos.setModel(myModel);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar os produtos!", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
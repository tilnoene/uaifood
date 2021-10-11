/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.ManipuladorArquivo;
import static classes.ManipuladorArquivo.editarMotoboy;
import classes.Motoboy;
import classes.Produto;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */

public class EditarMotoboy extends javax.swing.JFrame {
    private ArrayList<Motoboy> motoboys;
    int codigoGlobalMotoboy;
    
    /**
     * Creates new form CadastroProduto
     */
    public EditarMotoboy() {
        initComponents();
        
        jpSelecionarMotoboy.setVisible(true);
        jpEditarMotoboy.setVisible(false);
        
        carregarMotoboys();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSelecionarMotoboy = new javax.swing.JPanel();
        cmbMotoboy = new javax.swing.JComboBox<>();
        jlDescricaoMotoboy = new javax.swing.JLabel();
        btnEditarMotoboy = new javax.swing.JButton();
        btnVoltarMotoboy = new javax.swing.JButton();
        jpEditarMotoboy = new javax.swing.JPanel();
        jlTituloMotoboy = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jlTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jlDataDeNascimento = new javax.swing.JLabel();
        txtDataDeNascimento = new javax.swing.JFormattedTextField();
        jlCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jlExpediente = new javax.swing.JLabel();
        txtInicioExpediente = new javax.swing.JFormattedTextField();
        txtFinalExpediente = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        rbtnDisponibilidade = new javax.swing.JRadioButton();
        btnSalvarMotoboy = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Motoboy");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_uaifood.png")).getImage());
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSelecionarMotoboy.setBackground(new java.awt.Color(234, 29, 44));
        jpSelecionarMotoboy.setMaximumSize(null);
        jpSelecionarMotoboy.setPreferredSize(new java.awt.Dimension(360, 640));

        cmbMotoboy.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbMotoboy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlDescricaoMotoboy.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDescricaoMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        jlDescricaoMotoboy.setText("Selecione um motoboy:");

        btnEditarMotoboy.setBackground(new java.awt.Color(234, 29, 44));
        btnEditarMotoboy.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnEditarMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarMotoboy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_editar_branco.png"))); // NOI18N
        btnEditarMotoboy.setText("Editar");
        btnEditarMotoboy.setBorder(null);
        btnEditarMotoboy.setBorderPainted(false);
        btnEditarMotoboy.setContentAreaFilled(false);
        btnEditarMotoboy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMotoboyActionPerformed(evt);
            }
        });

        btnVoltarMotoboy.setBackground(new java.awt.Color(234, 29, 44));
        btnVoltarMotoboy.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnVoltarMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarMotoboy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_voltar_branco.png"))); // NOI18N
        btnVoltarMotoboy.setText("Voltar");
        btnVoltarMotoboy.setBorder(null);
        btnVoltarMotoboy.setBorderPainted(false);
        btnVoltarMotoboy.setContentAreaFilled(false);
        btnVoltarMotoboy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMotoboyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSelecionarMotoboyLayout = new javax.swing.GroupLayout(jpSelecionarMotoboy);
        jpSelecionarMotoboy.setLayout(jpSelecionarMotoboyLayout);
        jpSelecionarMotoboyLayout.setHorizontalGroup(
            jpSelecionarMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarMotoboyLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jpSelecionarMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditarMotoboy, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cmbMotoboy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDescricaoMotoboy, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarMotoboy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jpSelecionarMotoboyLayout.setVerticalGroup(
            jpSelecionarMotoboyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarMotoboyLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jlDescricaoMotoboy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltarMotoboy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );

        getContentPane().add(jpSelecionarMotoboy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpEditarMotoboy.setBackground(new java.awt.Color(234, 29, 44));
        jpEditarMotoboy.setMinimumSize(new java.awt.Dimension(343, 638));
        jpEditarMotoboy.setPreferredSize(new java.awt.Dimension(360, 640));
        jpEditarMotoboy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTituloMotoboy.setFont(new java.awt.Font("Sul Sans", 0, 24)); // NOI18N
        jlTituloMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloMotoboy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloMotoboy.setText("Editar Motoboy");
        jpEditarMotoboy.add(jlTituloMotoboy, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 30, 320, -1));

        jlNome.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlNome.setForeground(new java.awt.Color(255, 255, 255));
        jlNome.setText("Nome:");
        jpEditarMotoboy.add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 86, -1, -1));

        txtNome.setBackground(new java.awt.Color(234, 29, 44));
        txtNome.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jpEditarMotoboy.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 106, 300, 38));

        jlEmail.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(255, 255, 255));
        jlEmail.setText("Email:");
        jpEditarMotoboy.add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 156, -1, -1));

        txtEmail.setBackground(new java.awt.Color(234, 29, 44));
        txtEmail.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jpEditarMotoboy.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 176, 300, 38));

        jlSenha.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(255, 255, 255));
        jlSenha.setText("Senha:");
        jpEditarMotoboy.add(jlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtSenha.setBackground(new java.awt.Color(234, 29, 44));
        txtSenha.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtSenha.setSelectionColor(new java.awt.Color(160, 35, 49));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jpEditarMotoboy.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 300, 38));

        jlTelefone.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jlTelefone.setText("Telefone:");
        jpEditarMotoboy.add(jlTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtTelefone.setBackground(new java.awt.Color(234, 29, 44));
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        jpEditarMotoboy.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 300, 38));

        jlDataDeNascimento.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDataDeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jlDataDeNascimento.setText("Data de Nascimento:");
        jpEditarMotoboy.add(jlDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtDataDeNascimento.setBackground(new java.awt.Color(234, 29, 44));
        txtDataDeNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtDataDeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDeNascimento.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDeNascimentoActionPerformed(evt);
            }
        });
        jpEditarMotoboy.add(txtDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, 40));

        jlCpf.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlCpf.setForeground(new java.awt.Color(255, 255, 255));
        jlCpf.setText("CPF:");
        jpEditarMotoboy.add(jlCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        txtCpf.setBackground(new java.awt.Color(234, 29, 44));
        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        jpEditarMotoboy.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 130, 40));

        jlExpediente.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlExpediente.setForeground(new java.awt.Color(255, 255, 255));
        jlExpediente.setText("Expediente:");
        jpEditarMotoboy.add(jlExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        txtInicioExpediente.setBackground(new java.awt.Color(234, 29, 44));
        txtInicioExpediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtInicioExpediente.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtInicioExpediente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtInicioExpediente.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtInicioExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioExpedienteActionPerformed(evt);
            }
        });
        jpEditarMotoboy.add(txtInicioExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 130, 40));

        txtFinalExpediente.setBackground(new java.awt.Color(234, 29, 44));
        txtFinalExpediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtFinalExpediente.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtFinalExpediente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFinalExpediente.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        jpEditarMotoboy.add(txtFinalExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 460, 130, 40));

        jLabel1.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jpEditarMotoboy.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 40, 40));

        rbtnDisponibilidade.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        rbtnDisponibilidade.setForeground(new java.awt.Color(255, 255, 255));
        rbtnDisponibilidade.setText("Disponível");
        rbtnDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDisponibilidadeActionPerformed(evt);
            }
        });
        jpEditarMotoboy.add(rbtnDisponibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        btnSalvarMotoboy.setBackground(new java.awt.Color(234, 29, 44));
        btnSalvarMotoboy.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnSalvarMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarMotoboy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_verificar_branco.png"))); // NOI18N
        btnSalvarMotoboy.setText("Salvar");
        btnSalvarMotoboy.setBorder(null);
        btnSalvarMotoboy.setBorderPainted(false);
        btnSalvarMotoboy.setContentAreaFilled(false);
        btnSalvarMotoboy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarMotoboy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMotoboyActionPerformed(evt);
            }
        });
        jpEditarMotoboy.add(btnSalvarMotoboy, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 120, 38));

        btnCancelar.setBackground(new java.awt.Color(234, 29, 44));
        btnCancelar.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_fechar_branco.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpEditarMotoboy.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 120, 38));

        getContentPane().add(jpEditarMotoboy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnEditarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMotoboyActionPerformed
        // TODO add your handling code here:
        if (cmbMotoboy.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um motoboy.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // tela de edição visível
        jpSelecionarMotoboy.setVisible(false);
        jpEditarMotoboy.setVisible(true);
        this.setTitle("Editar Motoboy");
        
        int indice_motoboy = cmbMotoboy.getSelectedIndex() - 1;
        Motoboy motoboy = motoboys.get(indice_motoboy);
        codigoGlobalMotoboy = motoboy.getCodMotoboy();

        // valores do objeto original
        txtNome.setText(motoboy.getNome());
        txtEmail.setText(motoboy.getEmail());
        txtSenha.setText(motoboy.getSenha());
        txtTelefone.setText(motoboy.getTelefone().replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3")); // coloca o telefone no formato (##) #####-####
        txtDataDeNascimento.setText(motoboy.getDataDeNascimento());
        txtCpf.setText(motoboy.getCpf().replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4")); // coloca o cpf no formato ###.###.###-##
        // comentei pq estava dando erro e impedindo de obter a disponibilidade, quando consertarem, descomentem
        // txtInicioExpediente.setText((motoboy.getInicioExpediente()).toString());
        // txtFinalExpediente.setText((motoboy.getFinalExpediente()).toString());
        rbtnDisponibilidade.setSelected(motoboy.getDisponibilidade());
    }//GEN-LAST:event_btnEditarMotoboyActionPerformed

    private void btnVoltarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMotoboyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarMotoboyActionPerformed

    private void btnSalvarMotoboyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMotoboyActionPerformed
        // TODO add your handling code here:
        if (txtNome.getText().equals("")
            || txtEmail.getText().equals("")
            || txtCpf.getText().equals("")
            || String.valueOf(txtSenha.getPassword()).equals("")
            || txtTelefone.getText().equals("")
            || txtDataDeNascimento.getText().equals("")
            || txtInicioExpediente.getText().equals("")
            || txtFinalExpediente.getText().equals("")
        ) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String cpf = txtCpf.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        String telefone = txtTelefone.getText();
        String dataDeNascimento = txtDataDeNascimento.getText();
        String comecoExpediente = txtInicioExpediente.getText();
        String fimExpediente = txtFinalExpediente.getText();
        boolean disponibilidade = rbtnDisponibilidade.isSelected();
        
        try {
            Motoboy motoboy = new Motoboy(codigoGlobalMotoboy, 0.1f, disponibilidade, cpf, nome, email, senha, dataDeNascimento, telefone);
            ManipuladorArquivo.editarMotoboy(motoboy);
            JOptionPane.showMessageDialog(null, "Motoboy editado com sucesso.", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! O motoboy não foi editado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarMotoboyActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDeNascimentoActionPerformed

    private void txtInicioExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioExpedienteActionPerformed

    private void rbtnDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDisponibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnDisponibilidadeActionPerformed

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
            java.util.logging.Logger.getLogger(EditarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarMotoboy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarMotoboy;
    private javax.swing.JButton btnSalvarMotoboy;
    private javax.swing.JButton btnVoltarMotoboy;
    private javax.swing.JComboBox<String> cmbMotoboy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataDeNascimento;
    private javax.swing.JLabel jlDescricaoMotoboy;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlExpediente;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTituloMotoboy;
    private javax.swing.JPanel jpEditarMotoboy;
    private javax.swing.JPanel jpSelecionarMotoboy;
    private javax.swing.JRadioButton rbtnDisponibilidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFinalExpediente;
    private javax.swing.JFormattedTextField txtInicioExpediente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void carregarMotoboys() {
        try {
            motoboys = ManipuladorArquivo.carregarMotoboys();
            ArrayList<String> nomes_motoboys = new ArrayList();
            
            nomes_motoboys.add("Selecione um motoboy");
            for (Motoboy motoboy : motoboys) {
                nomes_motoboys.add(String.valueOf(motoboy.getCodMotoboy()) + " - " + motoboy.getNome());
            }
            
            MyComboBoxModel myModel = new MyComboBoxModel(nomes_motoboys.toArray(new String[0]));
            cmbMotoboy.setModel(myModel);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar os motoboys!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

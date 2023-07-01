package com.senai.cronos;

import connection.ConnectionFactory;
import com.senai.cronos.TelaApontamento;
import static connection.ConnectionFactory.getConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class TelaSelecao extends javax.swing.JFrame {

    
    public TelaSelecao() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcome.setText("Bem vindo");

        btnRegistro.setText("Registrar usuário");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnPonto.setText("Apontar horário");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnRelatorio.setText("Emitir relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnDelete.setText("Excluir usuário");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblWelcome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        TelaRegistro telaRegistro = new TelaRegistro();
        telaRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
       TelaRelatorio telaRelatorio = new TelaRelatorio();
       telaRelatorio.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        
        TelaApontamento tela = new TelaApontamento();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      String loginDelete = JOptionPane.showInputDialog(null, "Digite o usuário que deseja excluir", "Login", JOptionPane.QUESTION_MESSAGE);
      String senhaDelete = JOptionPane.showInputDialog(null, "Digite a senha do usuário", "Senha", JOptionPane.QUESTION_MESSAGE);
      
        try {
      Connection con = getConnection();
String sql = "SELECT * FROM contas WHERE usuario = ? AND senha = ?";
PreparedStatement stmt = con.prepareStatement(sql);
stmt.setString(1, loginDelete);
stmt.setString(2, senhaDelete);
ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Usuário e senha corretos, prosseguir com a exclusão
                String sqlExcluir = "DELETE FROM contas WHERE usuario = ?";
                PreparedStatement stmtExcluir = con.prepareStatement(sqlExcluir);
                stmtExcluir.setString(1, loginDelete);
                stmtExcluir.executeUpdate();
                stmtExcluir.close();
                JOptionPane.showMessageDialog(null, "Conta excluída com sucesso");
            } else {
                // Senha incorreta, exibir mensagem de erro
                JOptionPane.showMessageDialog(null, "Senha incorreta. Não é possível excluir a conta.");
            stmt.close();
            con.close();
            }       } catch (SQLException ex) {
            Logger.getLogger(TelaSelecao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSelecao().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}

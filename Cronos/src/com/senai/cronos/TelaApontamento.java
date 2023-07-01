package com.senai.cronos;
import com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import com.senai.cronos.TelaLogin;
import static connection.ConnectionFactory.getConnection;
import java.sql.*;

public class TelaApontamento extends javax.swing.JFrame {

     TelaLogin tela = new TelaLogin();

    public TelaApontamento() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTela = new javax.swing.JPanel();
        calendario = new com.toedter.calendar.JDateChooser();
        btnConfirmar = new javax.swing.JButton();
        lblEntrada = new javax.swing.JLabel();
        lblIntervaloInicio = new javax.swing.JLabel();
        lblIntervaloFim = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JFormattedTextField();
        txtIntervaloInicio = new javax.swing.JFormattedTextField();
        txtIntervaloFim = new javax.swing.JFormattedTextField();
        txtSaida = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronos");
        setResizable(false);

        btnConfirmar.setText("Salvar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblEntrada.setText("Entrada");

        lblIntervaloInicio.setText("Início Intervalo");

        lblIntervaloFim.setText("Fim Intervalo");

        lblSaida.setText("Saída");

        txtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        txtIntervaloInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtIntervaloInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntervaloInicioActionPerformed(evt);
            }
        });

        txtIntervaloFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtIntervaloFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntervaloFimActionPerformed(evt);
            }
        });

        txtSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        lblNome.setText("Insira seu nome");

        javax.swing.GroupLayout pnlTelaLayout = new javax.swing.GroupLayout(pnlTela);
        pnlTela.setLayout(pnlTelaLayout);
        pnlTelaLayout.setHorizontalGroup(
            pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaLayout.createSequentialGroup()
                        .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEntrada)
                            .addComponent(lblIntervaloInicio)
                            .addComponent(lblIntervaloFim)
                            .addComponent(lblSaida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIntervaloFim, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(txtIntervaloInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSaida)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaLayout.createSequentialGroup()
                                .addComponent(btnConfirmar)
                                .addGap(17, 17, 17))
                            .addComponent(calendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlTelaLayout.setVerticalGroup(
            pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTelaLayout.createSequentialGroup()
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEntrada)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIntervaloInicio)
                            .addComponent(txtIntervaloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(lblIntervaloFim))
                    .addComponent(txtIntervaloFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSaida)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
              
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date dataAtual = calendario.getDate();
            if (dataAtual == null) {
                JOptionPane.showMessageDialog(null,"Data não foi selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            else{
            String dataSelecionada = format.format(dataAtual);
            System.out.println("Data selecionada: " + dataSelecionada);
                       
            String valEntrada = txtEntrada.getText();
            String valInicioInt = txtIntervaloInicio.getText();
            String valFimInt = txtIntervaloFim.getText();
            String valSaida = txtSaida.getText();
            String nomeUsuario = txtNome.getText();
                
            
            
            if (valEntrada.isEmpty() || valInicioInt.isEmpty() || valFimInt.isEmpty() || valSaida.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            else if (valEntrada.equals(valInicioInt) || valEntrada.equals(valFimInt) || valEntrada.equals(valSaida) ||
            valInicioInt.equals(valFimInt) || valInicioInt.equals(valSaida) || valFimInt.equals(valSaida)) {
                JOptionPane.showMessageDialog(null, "Erro: Os campos não podem ser iguais", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            else{
              
            System.out.println(nomeUsuario);    
            System.out.println(valEntrada);
            System.out.println(valInicioInt);
            System.out.println(valFimInt);
            System.out.println(valSaida);
      
        
            JOptionPane.showMessageDialog(null, "Apontamento de horas gravado com sucesso!\n\nData selecionada: " + dataSelecionada + "\nNome do usuário: " + nomeUsuario 
            + "\nHorário de entrada: " + valEntrada + "\nInício do intervalo:   " + valInicioInt
            + "\nFim do intervalo:      " + valFimInt + "\nHorário de saída:     " + valSaida, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
 
            
            }
            try{
            Connection con = getConnection();
            String sql = "INSERT INTO APONTAMENTOS (data_atual, usuario, valor_entrada, valor_saida) VALUES (?, ?, ?, ?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dataSelecionada);
            stmt.setString(2, nomeUsuario);
            stmt.setString(3,valEntrada);
            stmt.setString(4, valSaida);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Dados salvos com sucesso");
            
            stmt.close();
            con.close();
            
            TelaSelecao tela = new TelaSelecao();
            tela.setVisible(true);
            dispose();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
            
            
            
            }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtIntervaloInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntervaloInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntervaloInicioActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        
       
    }//GEN-LAST:event_txtEntradaActionPerformed

    private void txtIntervaloFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntervaloFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntervaloFimActionPerformed

        
    public static void main(String args[]) {
        TelaLogin tela = new TelaLogin();
    
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaApontamento().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConfirmar;
    public com.toedter.calendar.JDateChooser calendario;
    public javax.swing.JLabel lblEntrada;
    public javax.swing.JLabel lblIntervaloFim;
    public javax.swing.JLabel lblIntervaloInicio;
    public javax.swing.JLabel lblNome;
    public javax.swing.JLabel lblSaida;
    public javax.swing.JPanel pnlTela;
    public javax.swing.JFormattedTextField txtEntrada;
    public javax.swing.JFormattedTextField txtIntervaloFim;
    public javax.swing.JFormattedTextField txtIntervaloInicio;
    public javax.swing.JTextField txtNome;
    public javax.swing.JFormattedTextField txtSaida;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Registros;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Mota
 */
public class Jogar extends javax.swing.JFrame {

    public Jogar() {
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

        jLabelJogadorN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        jTextFieldDezena03 = new javax.swing.JTextField();
        jTextFieldDezena01 = new javax.swing.JTextField();
        jTextFieldDezena02 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextFieldDezena06 = new javax.swing.JTextField();
        jTextFieldDezena04 = new javax.swing.JTextField();
        jTextFieldDezena05 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabelControle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJogadorN.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabelJogadorN.setText("Jogador 01");
        getContentPane().add(jLabelJogadorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jLabel2.setText("Dezenas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        txtNome.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel8.setText("Copyright © Vestindo Certo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        btnJogar.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        btnJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/jogar-icone.png"))); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 60));

        jTextFieldDezena03.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        getContentPane().add(jTextFieldDezena03, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 40, 30));

        jTextFieldDezena01.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jTextFieldDezena01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDezena01ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDezena01, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 40, 30));

        jTextFieldDezena02.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jTextFieldDezena02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDezena02ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDezena02, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 40, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 40, 30));

        jTextFieldDezena06.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        getContentPane().add(jTextFieldDezena06, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 40, 30));

        jTextFieldDezena04.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        getContentPane().add(jTextFieldDezena04, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 40, 30));

        jTextFieldDezena05.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        getContentPane().add(jTextFieldDezena05, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 40, 30));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 40, 30));

        btnVoltar.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icone-voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, 60));

        jLabelControle.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabelControle.setText("1/3");
        getContentPane().add(jLabelControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 20));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/mega-sena-background.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 420, 340));

        setSize(new java.awt.Dimension(400, 342));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        //String nome1 = txtNome.getText();
    }//GEN-LAST:event_txtNomeActionPerformed
   
    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        // setado as variaveis e objetos
        String dados[] = new String[7];
        Registros registros = new Registros();
        String controle, controleRepetidos;
        
        // PEGO TODOS OS DADOS DO JFRAME
        dados[0] = txtNome.getText();
        dados[1] = jTextFieldDezena01.getText();
        dados[2] = jTextFieldDezena02.getText();
        dados[3] = jTextFieldDezena03.getText();
        dados[4] = jTextFieldDezena04.getText();
        dados[5] = jTextFieldDezena05.getText();
        dados[6] = jTextFieldDezena06.getText();
        
        controle = registros.validateRegistro(dados);
        if("".equals(controle)){
            //INSTANCIO O OBJETO DE REGISTRO COM OS DADOS DO JFRAME
            registros.setNome(dados[0]);
            registros.setDezena01(Integer.parseInt(dados[1]));
            registros.setDezena02(Integer.parseInt(dados[2]));
            registros.setDezena03(Integer.parseInt(dados[3]));
            registros.setDezena04(Integer.parseInt(dados[4]));
            registros.setDezena05(Integer.parseInt(dados[5]));
            registros.setDezena06(Integer.parseInt(dados[6]));
        
            try {
                registros.store();
            } catch (SQLException ex) {
                Logger.getLogger(Jogar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
                if(jLabelJogadorN.getText() == "Jogador 01" && jLabelControle.getText() == "1/3"){
                    jLabelJogadorN.setText("Jogador 02");
                    jLabelControle.setText("2/3");
                }else if(jLabelJogadorN.getText() == "Jogador 02" && jLabelControle.getText() == "2/3"){
                    jLabelJogadorN.setText("Jogador 03");
                    jLabelControle.setText("3/3");
                    btnJogar.setText("Finalizar");
                }else{
                    btnJogar.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Agora você pode verificar os resultados!", null, JOptionPane.INFORMATION_MESSAGE);
                }
            }

        
        }else{
            JOptionPane.showMessageDialog(null, "Algo deu errado: "+controle, "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnJogarActionPerformed

    private void jTextFieldDezena01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDezena01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDezena01ActionPerformed

    private void jTextFieldDezena02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDezena02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDezena02ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelControle;
    private javax.swing.JLabel jLabelJogadorN;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldDezena01;
    private javax.swing.JTextField jTextFieldDezena02;
    private javax.swing.JTextField jTextFieldDezena03;
    private javax.swing.JTextField jTextFieldDezena04;
    private javax.swing.JTextField jTextFieldDezena05;
    private javax.swing.JTextField jTextFieldDezena06;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

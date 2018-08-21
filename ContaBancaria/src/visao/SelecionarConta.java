package visao;

import controle.Banco;
import controle.Imprimivel;
import controle.Relatorio;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.ContaBancaria;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

/**
 *
 * @author Imildo Sitoe
 */
public class SelecionarConta extends javax.swing.JFrame {

    ContaCorrente contaCorrente = new ContaCorrente();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    Relatorio relatorio = new Relatorio();
    Banco banco = new Banco();

    public SelecionarConta() {
//        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        super.setResizable(false);
        initComponents();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblConta = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnDepositar = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Conta nº :");

        lblConta.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        lblConta.setForeground(new java.awt.Color(204, 0, 51));
        lblConta.setText("------");

        btnVoltar.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        btnVoltar.setText("<< Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel6.setLayout(new java.awt.GridLayout(2, 0));

        btnDepositar.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        jPanel6.add(btnDepositar);

        btnSacar.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });
        jPanel6.add(btnSacar);

        btnTransferir.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        jPanel6.add(btnTransferir);

        btnGerarRelatorio.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btnGerarRelatorio.setText("Gerar Relatorio");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });
        jPanel6.add(btnGerarRelatorio);

        lblNome.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 171, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblConta)
                                .addGap(299, 299, 299))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblConta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        Executavel executavel = new Executavel();
        executavel.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        this.depositar();
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        this.sacar();
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        this.transferir();
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        this.gerarRelatorio2();
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(SelecionarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SelecionarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblConta;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblConta() {
        return lblConta;
    }
    
    public JLabel getLblNome() {
        return lblNome;
    }

    protected void depositar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor que quer depositar!"));
        // O metodo procuraConta retorna uma conta, dependendo do indice indicado
        banco.procurarConta(Integer.parseInt(lblConta.getText().trim())).depositar(valor);
        JOptionPane.showMessageDialog(null, banco.procurarConta(Integer.parseInt(lblConta.getText())).getSaldo());
    }

    protected void sacar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor que quer sacar!"));
        banco.procurarConta(Integer.parseInt(lblConta.getText().trim())).sacar(valor);
    }

    protected void transferir() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor que deseja transferir!"));
        ContaBancaria.transferir(valor, banco.procurarConta(Integer.parseInt(lblConta.getText().trim())), retornaConta());
    }
    
    private ContaBancaria retornaConta() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduza a conta destino!"));
        if(banco.myContains(a)) {
            return banco.procurarConta(a);
        }else{
            JOptionPane.showMessageDialog(null, "Conta destino inexistente.");
            return null;
        }
    }
    
    protected void gerarRelatorio() {
        String a = ((Imprimivel)banco.procurarConta(Integer.parseInt(lblConta.getText().trim()))).mostrarDados();
        JOptionPane.showMessageDialog(null, a);
    }
    
    protected void gerarRelatorio2() {
        String a = relatorio.gerarRelatorio((Imprimivel)banco.procurarConta(Integer.parseInt(lblConta.getText().trim())));
        JOptionPane.showMessageDialog(null, a);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class JogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form JogoDaVelha
     */
    public JogoDaVelha() {
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
        jPanel2 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        menuBarra = new javax.swing.JMenuBar();
        mnNovoJogo = new javax.swing.JMenu();
        miNovoJogo = new javax.swing.JMenuItem();
        miNovaPartida = new javax.swing.JMenuItem();
        miEstatistica = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        bt1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt7.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2)
                    .addComponent(bt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt4)
                    .addComponent(bt5)
                    .addComponent(bt6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt7)
                    .addComponent(bt8)
                    .addComponent(bt9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9});

        menuBarra.setBackground(java.awt.SystemColor.controlHighlight);

        mnNovoJogo.setText("Opções");
        mnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoJogoActionPerformed(evt);
            }
        });

        miNovoJogo.setText("Novo Jogo");
        miNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoJogoActionPerformed(evt);
            }
        });
        mnNovoJogo.add(miNovoJogo);

        miNovaPartida.setText("Nova Partida");
        miNovaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovaPartidaActionPerformed(evt);
            }
        });
        mnNovoJogo.add(miNovaPartida);

        miEstatistica.setText("Estatística");
        miEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEstatisticaActionPerformed(evt);
            }
        });
        mnNovoJogo.add(miEstatistica);

        menuBarra.add(mnNovoJogo);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    boolean jogador1 = true;
    boolean jogador2 = false;
    int vitoriajog1 = 0;
    int vitoriajog2 = 0;
    int empates = 0;

    public void mudaJogador() {
        if (jogador1) {
            jogador1 = false;
            jogador2 = true;
        } else {
            jogador1 = true;
            jogador2 = false;
        }
        vencedor("X");
        vencedor("O");
    }

    public void vencedor(String letra) {

        if (bt1.getText().equals(letra)
                && bt2.getText().equals(letra)
                && bt3.getText().equals(letra)) {

            if (bt1.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }

        if (bt4.getText().equals(letra)
                && bt5.getText().equals(letra)
                && bt6.getText().equals(letra)) {

            if (bt4.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }

        if (bt7.getText().equals(letra)
                && bt8.getText().equals(letra)
                && bt9.getText().equals(letra)) {

            if (bt7.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }
        if (bt1.getText().equals(letra)
                && bt4.getText().equals(letra)
                && bt7.getText().equals(letra)) {

            if (bt1.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }

        if (bt2.getText().equals(letra)
                && bt5.getText().equals(letra)
                && bt8.getText().equals(letra)) {

            if (bt2.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }

        if (bt3.getText().equals(letra)
                && bt6.getText().equals(letra)
                && bt9.getText().equals(letra)) {

            if (bt3.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }

        if (bt1.getText().equals(letra)
                && bt5.getText().equals(letra)
                && bt9.getText().equals(letra)) {

            if (bt1.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }

        if (bt3.getText().equals(letra)
                && bt5.getText().equals(letra)
                && bt7.getText().equals(letra)) {

            if (bt3.getText().equals("X")) {
                JOptionPane.showMessageDialog(null, "Jogador 1 é o vencedor");
                vitoriajog1++;
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Jogador 2 é o vencedor");
                vitoriajog2++;
                limpar();
            }

        }

        if (!bt1.getText().equals("")
                && !bt2.getText().equals("")
                && !bt3.getText().equals("")
                && !bt4.getText().equals("")
                && !bt5.getText().equals("")
                && !bt6.getText().equals("")
                && !bt7.getText().equals("")
                && !bt8.getText().equals("")
                && !bt9.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Velha!");
            empates++;
            limpar();
        }

    }
    
    public void limpar(){
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
    }
    

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        if (bt1.getText().equals("")) {
            if (jogador1) {
                bt1.setText("X");
                mudaJogador();
            } else {
                bt1.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        if (bt2.getText().equals("")) {
            if (jogador1) {
                bt2.setText("X");
                mudaJogador();
            } else {
                bt2.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        if (bt3.getText().equals("")) {
            if (jogador1) {
                bt3.setText("X");
                mudaJogador();
            } else {
                bt3.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        if (bt4.getText().equals("")) {
            if (jogador1) {
                bt4.setText("X");
                mudaJogador();
            } else {
                bt4.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        if (bt5.getText().equals("")) {
            if (jogador1) {
                bt5.setText("X");
                mudaJogador();
            } else {
                bt5.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        if (bt6.getText().equals("")) {
            if (jogador1) {
                bt6.setText("X");
                mudaJogador();
            } else {
                bt6.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        if (bt7.getText().equals("")) {
            if (jogador1) {
                bt7.setText("X");
                mudaJogador();
            } else {
                bt7.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        if (bt8.getText().equals("")) {
            if (jogador1) {
                bt8.setText("X");
                mudaJogador();
            } else {
                bt8.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        if (bt9.getText().equals("")) {
            if (jogador1) {
                bt9.setText("X");
                mudaJogador();
            } else {
                bt9.setText("O");
                mudaJogador();
            }
        }
    }//GEN-LAST:event_bt9ActionPerformed

    private void mnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoJogoActionPerformed
        
    }//GEN-LAST:event_mnNovoJogoActionPerformed

    private void miNovaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovaPartidaActionPerformed
        limpar();
    }//GEN-LAST:event_miNovaPartidaActionPerformed

    private void miNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoJogoActionPerformed
        vitoriajog1 = 0;
        vitoriajog2 = 0;
        empates = 0;
        limpar();
    }//GEN-LAST:event_miNovoJogoActionPerformed

    private void miEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEstatisticaActionPerformed
        JOptionPane.showMessageDialog(null, "Jogo atual\nVitórias do jogador 1: "+vitoriajog1 +"\nVitórias do jogador 2: "+vitoriajog2 +"\nEmpates: "+empates);
    }//GEN-LAST:event_miEstatisticaActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem miEstatistica;
    private javax.swing.JMenuItem miNovaPartida;
    private javax.swing.JMenuItem miNovoJogo;
    private javax.swing.JMenu mnNovoJogo;
    // End of variables declaration//GEN-END:variables
}

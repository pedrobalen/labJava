/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogodavelha;

import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author pedro
 */
public class Tabuleiro extends javax.swing.JFrame {
    private Timer timer1; 
    private Timer timer2; 
    private int tempoJogador1; 
    private int tempoJogador2; 
    private boolean jogoEmAndamento; 

    public Tabuleiro() {
        initComponents();
        timer1 = new Timer(1000, e -> atualizarTempoJogador1());
        timer2 = new Timer(1000, e -> atualizarTempoJogador2());
        tempoJogador1 = 0;
        tempoJogador2 = 0;
        jogoEmAndamento = false;        
    }
    private void atualizarTempoJogador1() {
        tempoJogador1++;
        lblTempo1.setText(Integer.toString(tempoJogador1));
    }
    private void atualizarTempoJogador2() {
        tempoJogador2++;
        lblTempo2.setText(Integer.toString(tempoJogador2));
    }    
    private void reiniciarTimers() {
        timer1.stop();
        timer2.stop();
        tempoJogador1 = 0;
        tempoJogador2 = 0;
        lblTempo1.setText("0");
        lblTempo2.setText("0");
    }
    public void verificaGanhador(){
        if(btn0.getText()=="O" && btn4.getText()=="O" && btn8.getText()=="O" || btn2.getText()=="O" && btn4.getText()=="O" && btn6.getText()=="O"){
            JOptionPane.showMessageDialog(null, "Jogador 1 Ganhou");
        } 
        if(btn0.getText()=="X" && btn4.getText()=="X" && btn8.getText()=="X" || btn2.getText()=="X" && btn4.getText()=="X" && btn6.getText()=="X"){
            JOptionPane.showMessageDialog(null, "Jogador 2 Ganhou");
        }
    }
    
    public void verificaEmpate(){
        if (jogoEmAndamento && !btn0.getText().isEmpty() && !btn1.getText().isEmpty() && !btn2.getText().isEmpty() &&
            !btn3.getText().isEmpty() && !btn4.getText().isEmpty() && !btn5.getText().isEmpty() &&
            !btn6.getText().isEmpty() && !btn7.getText().isEmpty() && !btn8.getText().isEmpty()) {
            jogoEmAndamento = false;
            int vencedor = tempoJogador1 < tempoJogador2 ? 1 : 2;
            if (tempoJogador1 == tempoJogador2) {
                JOptionPane.showMessageDialog(null, "Empate!");
            } else {
                JOptionPane.showMessageDialog(null, "Jogador " + vencedor + " ganhou!");
            }
        }
        
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        lblJogador = new javax.swing.JLabel();
        btnComecar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbltmp1 = new javax.swing.JLabel();
        lbltmp2 = new javax.swing.JLabel();
        lblTempo1 = new javax.swing.JLabel();
        lblTempo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        lblJogador.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        btnComecar.setText("Comecar");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lbltmp1.setText("Tempo do jogador 1");

        lbltmp2.setText("Tempo do jogador 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnComecar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbltmp1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTempo1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbltmp2)
                                        .addGap(17, 17, 17)
                                        .addComponent(lblTempo2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnComecar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltmp1)
                    .addComponent(lblTempo1))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltmp2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTempo2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn0.setText("O");
            } else {
                btn0.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }

    }//GEN-LAST:event_btn0ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn4.setText("O");
            } else {
                btn4.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn8.setText("O");
            } else {
                btn8.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn1.setText("O");
            } else {
                btn1.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed
        lblJogador.setText("Jogador 1");
        reiniciarTimers();
        timer1.start();
        jogoEmAndamento = true;
    }//GEN-LAST:event_btnComecarActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn2.setText("O");
            } else {
                btn2.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn3.setText("O");
            } else {
                btn3.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn5.setText("O");
            } else {
                btn5.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        } 
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn6.setText("O");
            } else {
                btn6.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (jogoEmAndamento) {
            if (lblJogador.getText().equals("Jogador 1")) {
                btn7.setText("O");
            } else {
                btn7.setText("X");
            }

            if (lblJogador.getText().equals("Jogador 1")) {
                lblJogador.setText("Jogador 2");
                timer1.stop();
                timer2.start();
            } else {
                lblJogador.setText("Jogador 1");
                timer2.stop();
                timer1.start();
            }

            verificaGanhador();
            verificaEmpate();
        }
    }//GEN-LAST:event_btn7ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnComecar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblTempo1;
    private javax.swing.JLabel lblTempo2;
    private javax.swing.JLabel lbltmp1;
    private javax.swing.JLabel lbltmp2;
    // End of variables declaration//GEN-END:variables
}

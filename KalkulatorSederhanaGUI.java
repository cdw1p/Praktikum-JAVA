package com.tugas;

public class GUICalculator extends javax.swing.JFrame {
    String angka = "";
    double angka1,jumlah,angka2;
    int pilih;
    boolean reset = false;
    
    public GUICalculator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        layarKalkulator = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnSamaDengan = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(layarKalkulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 60));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 50, 30));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 30));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 30));

        btnKali.setText("X");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 70, 30));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 50, 30));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 30));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 30));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, 30));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 50, 30));

        btnSamaDengan.setText("=");
        btnSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamaDenganActionPerformed(evt);
            }
        });
        getContentPane().add(btnSamaDengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 30));

        btnKoma.setText(".");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnKoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 30));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, 30));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 30));

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, 30));

        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 70, 30));

        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 30));

        btnClear.setText("c");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(reset){
            angka="";
        }
        angka += "1";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(reset){
            angka="";
        }
        angka +="2";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(reset){
            angka="";
        }
        angka +="3";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(reset){
            angka="";
        }
        angka +="4";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(reset){
            angka="";
        }
        angka +="5";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(reset){
            angka="";
        }
        angka +="6";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(reset){
            angka="";
        }
        angka +="7";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(reset){
            angka="";
        }
        angka +="8";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(reset){
            angka="";
        }
        angka +="9";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        if(reset){
            angka="";
        }
        angka +=".";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(reset){
            angka="";
        }
        angka +="0";
        layarKalkulator.setText(angka);
        reset = false;
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        angka1 = Double.parseDouble(layarKalkulator.getText());
        layarKalkulator.setText("+");
        angka ="";
        pilih = 1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        angka1 = Double.parseDouble(layarKalkulator.getText());
        layarKalkulator.setText("*");
        angka ="";
        pilih = 3;
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        angka1 = Double.parseDouble(layarKalkulator.getText());
        layarKalkulator.setText("-");
        angka ="";
        pilih = 2;
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        angka1 = Double.parseDouble(layarKalkulator.getText());
        layarKalkulator.setText("/");
        angka ="";
        pilih = 4;
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        layarKalkulator.setText("");
        angka1 = 0.0;
        angka2 = 0.0;
        jumlah = 0.0;
        pilih = 0;
        angka = "";
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamaDenganActionPerformed
        switch (pilih){
            case 1:
                angka2 = Double.parseDouble(layarKalkulator.getText());
                jumlah = angka1+angka2;
                layarKalkulator.setText(Double.toString(jumlah));
                break;
            case 2:
                angka2 = Double.parseDouble(layarKalkulator.getText());
                jumlah = angka1-angka2;
                layarKalkulator.setText(Double.toString(jumlah));
                break;
            case 3:
                angka2 = Double.parseDouble(layarKalkulator.getText());
                jumlah = angka1*angka2;
                layarKalkulator.setText(Double.toString(jumlah));
                break;
            case 4:
                angka2 = Double.parseDouble(layarKalkulator.getText());
                jumlah = angka1/angka2;
                layarKalkulator.setText(Double.toString(jumlah));
                break;
            default:
                break;
        }
        reset = true;
    }//GEN-LAST:event_btnSamaDenganActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICalculator().setVisible(true);
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
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnSamaDengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField layarKalkulator;
    // End of variables declaration//GEN-END:variables
}

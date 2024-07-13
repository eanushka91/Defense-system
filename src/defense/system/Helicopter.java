/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defense.system;

/**
 *
 * @author DELL
 */
public class Helicopter extends javax.swing.JFrame implements DSObserver {

    /**
     * Creates new form helicopter
     */
    public DSObservable dSObsevable;
    public Helicopter() {
        initComponents();
        setTitle("Helicopter");
        setLocation(50,350);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helislider = new javax.swing.JSlider();
        lblAction = new javax.swing.JLabel();
        shoot = new javax.swing.JButton();
        btnMissileOperation = new javax.swing.JButton();
        btnLaserOperation = new javax.swing.JButton();
        sendtextfield = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Spinnersoldier = new javax.swing.JSpinner();
        Spinnerammo = new javax.swing.JSpinner();
        positionbox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgTxtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helislider.setBackground(new java.awt.Color(153, 153, 153));
        helislider.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        helislider.setMajorTickSpacing(20);
        helislider.setMinorTickSpacing(10);
        helislider.setOrientation(javax.swing.JSlider.VERTICAL);
        helislider.setPaintLabels(true);
        helislider.setPaintTicks(true);
        helislider.setToolTipText("");
        helislider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        helislider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                helisliderStateChanged(evt);
            }
        });
        getContentPane().add(helislider, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 22, 57, 237));

        lblAction.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblAction.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, 150, 19));

        shoot.setBackground(new java.awt.Color(153, 153, 153));
        shoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shoot.setText("Shoot");
        shoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootActionPerformed(evt);
            }
        });
        getContentPane().add(shoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 47, 120, -1));

        btnMissileOperation.setBackground(new java.awt.Color(153, 153, 153));
        btnMissileOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMissileOperation.setText("Missile Operation");
        getContentPane().add(btnMissileOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 47, -1, -1));

        btnLaserOperation.setBackground(new java.awt.Color(153, 153, 153));
        btnLaserOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLaserOperation.setText("Laser Operation");
        btnLaserOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserOperationActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaserOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 75, 120, -1));

        sendtextfield.setBackground(new java.awt.Color(204, 204, 204));
        sendtextfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendtextfield.setText(" ");
        sendtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(sendtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, 282, -1));

        btnSend.setBackground(new java.awt.Color(204, 204, 204));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 237, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier count");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 50, 62, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo count");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 78, 62, -1));
        getContentPane().add(Spinnersoldier, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 47, 58, -1));
        getContentPane().add(Spinnerammo, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 75, 58, -1));

        positionbox.setBackground(new java.awt.Color(204, 204, 204));
        positionbox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        positionbox.setText("Position");
        positionbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionboxActionPerformed(evt);
            }
        });
        getContentPane().add(positionbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 108, -1, -1));

        msgTxtArea.setBackground(new java.awt.Color(204, 204, 204));
        msgTxtArea.setColumns(20);
        msgTxtArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        msgTxtArea.setRows(5);
        jScrollPane1.setViewportView(msgTxtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 351, 123));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helicopter-involved-military-actions (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shootActionPerformed

    private void btnLaserOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaserOperationActionPerformed

    private void sendtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendtextfieldActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        Maincontraller maincontraller = new Maincontraller();
        String message = sendtextfield.getText();
        Maincontraller.txtmessagebox.append("\nHelicopter :"+message);
        
    }//GEN-LAST:event_btnSendActionPerformed

    private void positionboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionboxActionPerformed

    private void helisliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_helisliderStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_helisliderStateChanged

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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Helicopter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JSpinner Spinnerammo;
    public static javax.swing.JSpinner Spinnersoldier;
    private javax.swing.JButton btnLaserOperation;
    private javax.swing.JButton btnMissileOperation;
    private javax.swing.JButton btnSend;
    public static javax.swing.JSlider helislider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAction;
    private javax.swing.JTextArea msgTxtArea;
    private javax.swing.JCheckBox positionbox;
    private javax.swing.JTextField sendtextfield;
    private javax.swing.JButton shoot;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClearedMessage(boolean status) {
        if (status == true) {
            lblAction.setText("Cleared");
        } else if (status == false) {
            lblAction.setText("Area Not Cleared");
        }
    }
    @Override
    public void updatePosition(int positionLevel) {

        if (positionbox.isSelected() == true) {
            if (positionLevel > 20) {
                shoot.setEnabled(true);
            } else {
                shoot.setEnabled(false);
            }
            if (positionLevel > 40) {
                btnMissileOperation.setEnabled(true);
            } else {
                btnMissileOperation.setEnabled(false);
            }
            if (positionLevel > 60) {
                btnLaserOperation.setEnabled(true);
            } else {
                btnLaserOperation.setEnabled(false);
            }
        } else {
            shoot.setEnabled(false);
            btnMissileOperation.setEnabled(false);
            btnLaserOperation.setEnabled(false);
        }
    }
    @Override
    public void updateSendMessage(String message) {
        msgTxtArea.setText(message);
    }
}


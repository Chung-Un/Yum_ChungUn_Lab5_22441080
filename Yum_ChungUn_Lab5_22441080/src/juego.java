/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chung
 * 
 * 
 */
import javax.swing.*;
public class juego extends javax.swing.JFrame {

    /**
     * Creates new form juego
     */
    
    private boolean turnoX; //una variable para controlar los turnos
    public juego() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        turnos = new javax.swing.JLabel();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        turnos.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        turnos.setText("Turno: X");

        btn11.setText("....");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setText("....");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setText("....");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn21.setText("....");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn31.setText("....");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn23.setText("....");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn33.setText("....");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn32.setText("....");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn22.setText("....");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn32))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn11)
                                .addGap(38, 38, 38)
                                .addComponent(btn12)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn13)
                            .addComponent(btn23)
                            .addComponent(btn33))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btn23, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btn22, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btn33, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btn32, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        
        if(btn11.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX = true){ //si es el turno de x, se llena con una x
        btn11.setText("X");}
        else if (turnoX=false){ //si es el turno de 0, se llena con una 0
        btn11.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        if(btn12.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn12.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn12.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        if(btn21.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn21.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn21.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
        
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // TODO add your handling code here:
        if(btn31.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn31.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn31.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
        if(btn23.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn23.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn23.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
        if(btn33.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn33.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn33.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
        if(btn32.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn32.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn32.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        if(btn22.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn22.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn22.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        if(btn13.getText().equals("....")){ //verifica si la casilla esta disponible
        if(turnoX){ //si es el turno de x, se llena con una x
        btn13.setText("X");}
        else if (!turnoX){ //si es el turno de 0, se llena con una 0
        btn13.setText("0");
        }}
        else{ //si no esta vacia, le pide al usuario que vuelva a intentar
        JOptionPane.showMessageDialog(null, "Casilla invalida, intente de nuevo");
        return;
        
        }
        turnoX = !turnoX; //el turno se pasa al otro jugador
    }//GEN-LAST:event_btn13ActionPerformed

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
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel turnos;
    // End of variables declaration//GEN-END:variables
}

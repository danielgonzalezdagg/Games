/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author charly
 */
public class game1 extends javax.swing.JFrame {

    int numeroDados;
    /**
     * Creates new form ventana_Principal
     */
    public game1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_dado2 = new javax.swing.JLabel();
        label_dado1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/game1.1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 42, -1, -1));

        jLabel3.setFont(new java.awt.Font("Capture it 2", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 94, 15));
        jLabel3.setText("SERPIENTE Y ESCALERAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, -1, -1));

        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(146, 217, 181));
        jPanel1.setLayout(null);

        label_dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/game1.dado6.jpg"))); // NOI18N
        jPanel1.add(label_dado2);
        label_dado2.setBounds(10, 200, 190, 180);

        label_dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/game1.dado1.jpg"))); // NOI18N
        jPanel1.add(label_dado1);
        label_dado1.setBounds(10, 10, 190, 180);

        jButton1.setText("TIRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 430, 140, 90);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 120, 210, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Random random = new Random();
        int dado1 = 0;
        dado1 = ((int)(random.nextDouble()*6));
        int dado2 = 0;
        dado2 = ((int)(random.nextDouble()*6));
        
        if(dado1 == 0){
            label_dado1.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado1.jpg")));
        }else if(dado1 == 1){
            label_dado1.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado2.jpg")));
        }else if(dado1 == 2){
            label_dado1.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado3.jpg")));
        }else if(dado1 == 3){
            label_dado1.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado4.jpg")));
        }else if(dado1 == 4){
            label_dado1.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado5.jpg")));
        }else if(dado1 == 5){
            label_dado1.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado6.jpg")));
        }
        
        
        if(dado2 == 0){
            label_dado2.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado1.jpg")));
        }else if(dado2 == 1){
            label_dado2.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado2.jpg")));
        }else if(dado2 == 2){
            label_dado2.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado3.jpg")));
        }else if(dado2 == 3){
            label_dado2.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado4.jpg")));
        }else if(dado2 == 4){
            label_dado2.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado5.jpg")));
        }else if(dado2 == 5){
            label_dado2.setIcon(new ImageIcon(getClass().getResource("/Images/game1.dado6.jpg")));
        }
        
        dado1++;
        dado2++;
        int numeroTotal = dado1+dado2;
        numeroDados = numeroTotal;
        
        JOptionPane.showMessageDialog(this, "DEBE AVANZAR "+ numeroTotal + " ESPACIOS", "*****ATENCION*****", HEIGHT);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_dado1;
    private javax.swing.JLabel label_dado2;
    // End of variables declaration//GEN-END:variables
}

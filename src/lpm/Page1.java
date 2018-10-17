/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpm;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author zha
 */
public class Page1 extends javax.swing.JFrame {

    /**
     * Creates new form Page1
     */
    public Page1() {
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

        nextBTN = new javax.swing.JButton();
        closeBTN = new javax.swing.JButton();
        btnSelectFile = new javax.swing.JButton();
        pathFile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ekstrak = new javax.swing.JCheckBox();
        pathEkstrak = new javax.swing.JTextField();
        btnSelectFolderEkstrak = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        rootPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nextBTN.setText("lanjut");
        nextBTN.setMargin(new java.awt.Insets(2, 10, 2, 10));
        nextBTN.setPreferredSize(new java.awt.Dimension(100, 27));
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        closeBTN.setText("batal");
        closeBTN.setMargin(new java.awt.Insets(2, 10, 2, 10));
        closeBTN.setMaximumSize(new java.awt.Dimension(81, 23));
        closeBTN.setMinimumSize(new java.awt.Dimension(81, 23));
        closeBTN.setPreferredSize(new java.awt.Dimension(100, 27));
        closeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTNActionPerformed(evt);
            }
        });

        btnSelectFile.setText("pilih file");
        btnSelectFile.setPreferredSize(new java.awt.Dimension(100, 27));
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });

        pathFile.setEditable(false);
        pathFile.setPreferredSize(new java.awt.Dimension(159, 27));

        jLabel1.setText("Pilih file .alldeb yang akan diinstal!");

        ekstrak.setText("Ekstrak file .deb");
        ekstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekstrakActionPerformed(evt);
            }
        });

        pathEkstrak.setEditable(false);
        pathEkstrak.setPreferredSize(new java.awt.Dimension(159, 27));

        btnSelectFolderEkstrak.setText("pilih folder");
        btnSelectFolderEkstrak.setEnabled(false);
        btnSelectFolderEkstrak.setPreferredSize(new java.awt.Dimension(100, 27));
        btnSelectFolderEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFolderEkstrakActionPerformed(evt);
            }
        });

        rootPassword.setPreferredSize(new java.awt.Dimension(159, 27));

        jLabel2.setText("Masukkan root password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pathFile, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ekstrak)
                            .addComponent(labelError)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rootPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pathEkstrak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectFolderEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ekstrak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectFolderEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rootPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(labelError)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Alldeb File", "alldeb");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        if (file == null) {
            labelError.setText("[!] Pilih satu file .alldeb");
            labelError.setForeground(new java.awt.Color(255, 0, 0));
        } else {
            labelError.setText("");
        }
        try {
            String fileName = file.getAbsolutePath();
            pathFile.setText(fileName);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }//GEN-LAST:event_btnSelectFileActionPerformed

    private void closeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBTNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        try {
            String pathFileSelected = pathFile.getText();
            String pathFolderEkstrak;
            int opsi = 4;
            if (ekstrak.isSelected()) {
                opsi = 3;
                pathFolderEkstrak = pathEkstrak.getText();
            } else {
                opsi = 1;
                pathFolderEkstrak = "/home/zha/lpm/ekstrak";
            }
            Runtime rt = Runtime.getRuntime();
            
            String command[] = {
                "/bin/bash",
                "-c",
                "echo " + rootPassword.getText() + 
                " | sudo -S /home/zha/lpm/./alldeb-manager-cli " + pathFileSelected + " " + pathFolderEkstrak + " " + opsi + " --laos"
            };
            Process proc = rt.exec(command);
            
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            
            String s = null;
            
            // Tampilkan output command
            System.out.println("Output:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // Tampilkan error
            System.out.println("Error:\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }//GEN-LAST:event_nextBTNActionPerformed

    private void ekstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekstrakActionPerformed
        if (ekstrak.isSelected()) {
            btnSelectFolderEkstrak.setEnabled(true);
        } else {
            btnSelectFolderEkstrak.setEnabled(false);
        }
    }//GEN-LAST:event_ekstrakActionPerformed

    private void btnSelectFolderEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFolderEkstrakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectFolderEkstrakActionPerformed

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
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Page1().setVisible(true);
//            }
//        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JButton btnSelectFolderEkstrak;
    private javax.swing.JButton closeBTN;
    private javax.swing.JCheckBox ekstrak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelError;
    private javax.swing.JButton nextBTN;
    private javax.swing.JTextField pathEkstrak;
    private javax.swing.JTextField pathFile;
    private javax.swing.JTextField rootPassword;
    // End of variables declaration//GEN-END:variables
}
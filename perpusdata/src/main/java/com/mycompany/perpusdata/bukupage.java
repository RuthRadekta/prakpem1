package com.mycompany.perpusdata;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class bukupage extends javax.swing.JFrame {

    /**
     * Creates new form bukupage
     */
    public bukupage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFFF"));    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JButton();
        anggota = new javax.swing.JButton();
        buku = new javax.swing.JButton();
        peminjaman = new javax.swing.JButton();
        pengembalian = new javax.swing.JButton();
        statkini = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        labelpilihopsi = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        create = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        read = new javax.swing.JButton();
        bg2 = new javax.swing.JPanel();
        kembali = new javax.swing.JButton();
        hover = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(241, 244, 246));
        home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota.setBackground(new java.awt.Color(241, 244, 246));
        anggota.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota.setForeground(new java.awt.Color(255, 255, 255));
        anggota.setText("ANGGOTA");
        anggota.setBorderPainted(false);
        anggota.setContentAreaFilled(false);
        anggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku.setBackground(new java.awt.Color(241, 244, 246));
        buku.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku.setForeground(new java.awt.Color(255, 255, 255));
        buku.setText("BUKU");
        buku.setBorderPainted(false);
        buku.setContentAreaFilled(false);
        buku.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman.setText("PEMINJAMAN");
        peminjaman.setBorderPainted(false);
        peminjaman.setContentAreaFilled(false);
        peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian.setText("PENGEMBALIAN");
        pengembalian.setBorderPainted(false);
        pengembalian.setContentAreaFilled(false);
        pengembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini.setBackground(new java.awt.Color(241, 244, 246));
        statkini.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini.setForeground(new java.awt.Color(255, 255, 255));
        statkini.setText("STATUS TERKINI");
        statkini.setBorderPainted(false);
        statkini.setContentAreaFilled(false);
        statkini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(statkini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        riwayat.setBackground(new java.awt.Color(241, 244, 246));
        riwayat.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        riwayat.setForeground(new java.awt.Color(255, 255, 255));
        riwayat.setText("RIWAYAT");
        riwayat.setBorderPainted(false);
        riwayat.setContentAreaFilled(false);
        riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 270, 150, -1));

        labelpilihopsi.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelpilihopsi.setForeground(new java.awt.Color(190, 196, 205));
        labelpilihopsi.setText("PILIH OPSI UNTUK DATABASE BUKU");
        getContentPane().add(labelpilihopsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        update.setBackground(new java.awt.Color(155, 164, 180));
        update.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Perbaharui Data");
        update.setBorder(null);
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 200, 70));

        create.setBackground(new java.awt.Color(155, 164, 180));
        create.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("Buat Data Baru");
        create.setBorderPainted(false);
        create.setContentAreaFilled(false);
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 200, 70));

        delete.setBackground(new java.awt.Color(155, 164, 180));
        delete.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Hapus Data");
        delete.setBorderPainted(false);
        delete.setContentAreaFilled(false);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 200, 70));

        read.setBackground(new java.awt.Color(155, 164, 180));
        read.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        read.setForeground(new java.awt.Color(255, 255, 255));
        read.setText("Tampilkan Data");
        read.setBorderPainted(false);
        read.setContentAreaFilled(false);
        read.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(read, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, 70));

        bg2.setBackground(new java.awt.Color(155, 164, 180));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("kembali");
        kembali.setBorderPainted(false);
        kembali.setContentAreaFilled(false);
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg2.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, -1, -1));

        hover.setBackground(new java.awt.Color(190, 196, 205));
        bg2.add(hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        getContentPane().add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 430));

        jPanel1.setBackground(new java.awt.Color(155, 164, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 200, 70));

        jPanel2.setBackground(new java.awt.Color(155, 164, 180));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 200, 70));

        jPanel3.setBackground(new java.awt.Color(155, 164, 180));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 200, 70));

        jPanel4.setBackground(new java.awt.Color(155, 164, 180));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(bukupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bukupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bukupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bukupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bukupage().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anggota;
    private javax.swing.JPanel bg2;
    private javax.swing.JButton buku;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private javax.swing.JButton home;
    private javax.swing.JPanel hover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel labelpilihopsi;
    private javax.swing.JButton peminjaman;
    private javax.swing.JButton pengembalian;
    private javax.swing.JButton read;
    private javax.swing.JButton riwayat;
    private javax.swing.JButton statkini;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

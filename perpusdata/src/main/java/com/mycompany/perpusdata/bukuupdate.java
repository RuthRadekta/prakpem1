package com.mycompany.perpusdata;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class bukuupdate extends javax.swing.JFrame {

    /**
     * Creates new form bukuupdate
     */
    public bukuupdate() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFFF"));
        setDefaultCloseOperation(bukuupdate.DISPOSE_ON_CLOSE);
        hasil.setDefaultCloseOperation(hasil.DISPOSE_ON_CLOSE);
        hasil2.setDefaultCloseOperation(hasil2.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasil = new javax.swing.JDialog();
        home1 = new javax.swing.JButton();
        anggota1 = new javax.swing.JButton();
        buku1 = new javax.swing.JButton();
        peminjaman1 = new javax.swing.JButton();
        pengembalian1 = new javax.swing.JButton();
        statkini1 = new javax.swing.JButton();
        bg3 = new javax.swing.JPanel();
        kembali1 = new javax.swing.JButton();
        hover1 = new javax.swing.JPanel();
        labelupdate = new javax.swing.JLabel();
        labelupdate2 = new javax.swing.JLabel();
        labelida = new javax.swing.JLabel();
        labeljudul = new javax.swing.JLabel();
        labelpenulis = new javax.swing.JLabel();
        labelpenerbit = new javax.swing.JLabel();
        labeljumha = new javax.swing.JLabel();
        inputjumha = new javax.swing.JTextField();
        inputidb = new javax.swing.JTextField();
        inputjudul = new javax.swing.JTextField();
        inputpenerbit = new javax.swing.JTextField();
        buttonupdate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        inputpenulis = new javax.swing.JTextField();
        hasil2 = new javax.swing.JDialog();
        home2 = new javax.swing.JButton();
        anggota2 = new javax.swing.JButton();
        buku2 = new javax.swing.JButton();
        peminjaman2 = new javax.swing.JButton();
        pengembalian2 = new javax.swing.JButton();
        statkini2 = new javax.swing.JButton();
        bg4 = new javax.swing.JPanel();
        kembali2 = new javax.swing.JButton();
        hover2 = new javax.swing.JPanel();
        labelupdate3 = new javax.swing.JLabel();
        labelberhasil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelupdate4 = new javax.swing.JLabel();
        lagi = new javax.swing.JButton();
        labelberhasil1 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        anggota = new javax.swing.JButton();
        buku = new javax.swing.JButton();
        peminjaman = new javax.swing.JButton();
        pengembalian = new javax.swing.JButton();
        statkini = new javax.swing.JButton();
        bg2 = new javax.swing.JPanel();
        kembali = new javax.swing.JButton();
        hover = new javax.swing.JPanel();
        labelmasukkanid = new javax.swing.JLabel();
        cekidb = new javax.swing.JTextField();
        buttoncek = new javax.swing.JButton();
        labelupdate1 = new javax.swing.JLabel();

        hasil.setMinimumSize(new java.awt.Dimension(830, 450));
        hasil.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home1.setBackground(new java.awt.Color(241, 244, 246));
        home1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home1.setForeground(new java.awt.Color(255, 255, 255));
        home1.setText("HOME");
        home1.setBorderPainted(false);
        home1.setContentAreaFilled(false);
        home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil.getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota1.setBackground(new java.awt.Color(241, 244, 246));
        anggota1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota1.setForeground(new java.awt.Color(255, 255, 255));
        anggota1.setText("ANGGOTA");
        anggota1.setBorderPainted(false);
        anggota1.setContentAreaFilled(false);
        anggota1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anggota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggota1ActionPerformed(evt);
            }
        });
        hasil.getContentPane().add(anggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku1.setBackground(new java.awt.Color(241, 244, 246));
        buku1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku1.setForeground(new java.awt.Color(255, 255, 255));
        buku1.setText("BUKU");
        buku1.setBorderPainted(false);
        buku1.setContentAreaFilled(false);
        buku1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku1ActionPerformed(evt);
            }
        });
        hasil.getContentPane().add(buku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman1.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman1.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman1.setText("PEMINJAMAN");
        peminjaman1.setBorderPainted(false);
        peminjaman1.setContentAreaFilled(false);
        peminjaman1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peminjaman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjaman1ActionPerformed(evt);
            }
        });
        hasil.getContentPane().add(peminjaman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian1.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian1.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian1.setText("PENGEMBALIAN");
        pengembalian1.setBorderPainted(false);
        pengembalian1.setContentAreaFilled(false);
        pengembalian1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengembalian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalian1ActionPerformed(evt);
            }
        });
        hasil.getContentPane().add(pengembalian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini1.setBackground(new java.awt.Color(241, 244, 246));
        statkini1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini1.setForeground(new java.awt.Color(255, 255, 255));
        statkini1.setText("STATUS TERKINI");
        statkini1.setBorderPainted(false);
        statkini1.setContentAreaFilled(false);
        statkini1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statkini1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statkini1ActionPerformed(evt);
            }
        });
        hasil.getContentPane().add(statkini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        bg3.setBackground(new java.awt.Color(155, 164, 180));
        bg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali1.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali1.setForeground(new java.awt.Color(255, 255, 255));
        kembali1.setText("logout");
        kembali1.setBorderPainted(false);
        kembali1.setContentAreaFilled(false);
        kembali1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali1ActionPerformed(evt);
            }
        });
        bg3.add(kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, -1, -1));

        hover1.setBackground(new java.awt.Color(190, 196, 205));
        bg3.add(hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        hasil.getContentPane().add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 410));

        labelupdate.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelupdate.setForeground(new java.awt.Color(190, 196, 205));
        labelupdate.setText("MEMPERBAHARUI DATA");
        hasil.getContentPane().add(labelupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        labelupdate2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelupdate2.setForeground(new java.awt.Color(155, 164, 180));
        labelupdate2.setText("UPDATE");
        hasil.getContentPane().add(labelupdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        labelida.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelida.setForeground(new java.awt.Color(155, 164, 180));
        labelida.setText("ID Buku");
        hasil.getContentPane().add(labelida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        labeljudul.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labeljudul.setForeground(new java.awt.Color(155, 164, 180));
        labeljudul.setText("Judul");
        hasil.getContentPane().add(labeljudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        labelpenulis.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelpenulis.setForeground(new java.awt.Color(155, 164, 180));
        labelpenulis.setText("Penulis");
        hasil.getContentPane().add(labelpenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        labelpenerbit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelpenerbit.setForeground(new java.awt.Color(155, 164, 180));
        labelpenerbit.setText("Penerbit");
        hasil.getContentPane().add(labelpenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        labeljumha.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labeljumha.setForeground(new java.awt.Color(155, 164, 180));
        labeljumha.setText("Jumlah Halaman");
        hasil.getContentPane().add(labeljumha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        inputjumha.setBackground(new java.awt.Color(216, 219, 227));
        inputjumha.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputjumha.setForeground(new java.awt.Color(155, 164, 180));
        inputjumha.setBorder(null);
        hasil.getContentPane().add(inputjumha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 270, 30));

        inputidb.setBackground(new java.awt.Color(216, 219, 227));
        inputidb.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputidb.setForeground(new java.awt.Color(155, 164, 180));
        inputidb.setBorder(null);
        hasil.getContentPane().add(inputidb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 300, 30));

        inputjudul.setBackground(new java.awt.Color(216, 219, 227));
        inputjudul.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputjudul.setForeground(new java.awt.Color(155, 164, 180));
        inputjudul.setBorder(null);
        hasil.getContentPane().add(inputjudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 300, 30));

        inputpenerbit.setBackground(new java.awt.Color(216, 219, 227));
        inputpenerbit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputpenerbit.setForeground(new java.awt.Color(155, 164, 180));
        inputpenerbit.setBorder(null);
        hasil.getContentPane().add(inputpenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 300, 30));

        buttonupdate.setBackground(new java.awt.Color(155, 164, 180));
        buttonupdate.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buttonupdate.setForeground(new java.awt.Color(255, 255, 255));
        buttonupdate.setText("Update");
        buttonupdate.setBorder(null);
        buttonupdate.setBorderPainted(false);
        buttonupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonupdateActionPerformed(evt);
            }
        });
        hasil.getContentPane().add(buttonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 110, 30));
        hasil.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 360, 10));

        inputpenulis.setBackground(new java.awt.Color(216, 219, 227));
        inputpenulis.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputpenulis.setForeground(new java.awt.Color(155, 164, 180));
        inputpenulis.setBorder(null);
        hasil.getContentPane().add(inputpenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 300, 30));

        hasil2.setMinimumSize(new java.awt.Dimension(830, 450));
        hasil2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home2.setBackground(new java.awt.Color(241, 244, 246));
        home2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home2.setForeground(new java.awt.Color(255, 255, 255));
        home2.setText("HOME");
        home2.setBorderPainted(false);
        home2.setContentAreaFilled(false);
        home2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil2.getContentPane().add(home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota2.setBackground(new java.awt.Color(241, 244, 246));
        anggota2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota2.setForeground(new java.awt.Color(255, 255, 255));
        anggota2.setText("ANGGOTA");
        anggota2.setBorderPainted(false);
        anggota2.setContentAreaFilled(false);
        anggota2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anggota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggota2ActionPerformed(evt);
            }
        });
        hasil2.getContentPane().add(anggota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku2.setBackground(new java.awt.Color(241, 244, 246));
        buku2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku2.setForeground(new java.awt.Color(255, 255, 255));
        buku2.setText("BUKU");
        buku2.setBorderPainted(false);
        buku2.setContentAreaFilled(false);
        buku2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil2.getContentPane().add(buku2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman2.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman2.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman2.setText("PEMINJAMAN");
        peminjaman2.setBorderPainted(false);
        peminjaman2.setContentAreaFilled(false);
        peminjaman2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil2.getContentPane().add(peminjaman2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian2.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian2.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian2.setText("PENGEMBALIAN");
        pengembalian2.setBorderPainted(false);
        pengembalian2.setContentAreaFilled(false);
        pengembalian2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasil2.getContentPane().add(pengembalian2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini2.setBackground(new java.awt.Color(241, 244, 246));
        statkini2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini2.setForeground(new java.awt.Color(255, 255, 255));
        statkini2.setText("STATUS TERKINI");
        statkini2.setBorderPainted(false);
        statkini2.setContentAreaFilled(false);
        statkini2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statkini2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statkini2ActionPerformed(evt);
            }
        });
        hasil2.getContentPane().add(statkini2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        bg4.setBackground(new java.awt.Color(155, 164, 180));
        bg4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali2.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali2.setForeground(new java.awt.Color(255, 255, 255));
        kembali2.setText("logout");
        kembali2.setBorderPainted(false);
        kembali2.setContentAreaFilled(false);
        kembali2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali2ActionPerformed(evt);
            }
        });
        bg4.add(kembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, -1, -1));

        hover2.setBackground(new java.awt.Color(190, 196, 205));
        bg4.add(hover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        hasil2.getContentPane().add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 410));

        labelupdate3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelupdate3.setForeground(new java.awt.Color(190, 196, 205));
        labelupdate3.setText("MEMPERBAHARUI DATA");
        hasil2.getContentPane().add(labelupdate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        labelberhasil.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelberhasil.setForeground(new java.awt.Color(155, 164, 180));
        labelberhasil.setText("DI UPDATE");
        hasil2.getContentPane().add(labelberhasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 180, -1));
        hasil2.getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 360, 10));

        labelupdate4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelupdate4.setForeground(new java.awt.Color(155, 164, 180));
        labelupdate4.setText("UPDATE");
        hasil2.getContentPane().add(labelupdate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        lagi.setBackground(new java.awt.Color(216, 219, 227));
        lagi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lagi.setForeground(new java.awt.Color(155, 164, 180));
        lagi.setText("Update Data Lain");
        lagi.setBorder(null);
        lagi.setBorderPainted(false);
        lagi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagiActionPerformed(evt);
            }
        });
        hasil2.getContentPane().add(lagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 150, 40));

        labelberhasil1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelberhasil1.setForeground(new java.awt.Color(155, 164, 180));
        labelberhasil1.setText("DATA BERHASIL");
        hasil2.getContentPane().add(labelberhasil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 250, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(241, 244, 246));
        home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota.setBackground(new java.awt.Color(241, 244, 246));
        anggota.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota.setForeground(new java.awt.Color(255, 255, 255));
        anggota.setText("ANGGOTA");
        anggota.setBorderPainted(false);
        anggota.setContentAreaFilled(false);
        anggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggotaActionPerformed(evt);
            }
        });
        getContentPane().add(anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku.setBackground(new java.awt.Color(241, 244, 246));
        buku.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku.setForeground(new java.awt.Color(255, 255, 255));
        buku.setText("BUKU");
        buku.setBorderPainted(false);
        buku.setContentAreaFilled(false);
        buku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuActionPerformed(evt);
            }
        });
        getContentPane().add(buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman.setText("PEMINJAMAN");
        peminjaman.setBorderPainted(false);
        peminjaman.setContentAreaFilled(false);
        peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanActionPerformed(evt);
            }
        });
        getContentPane().add(peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian.setText("PENGEMBALIAN");
        pengembalian.setBorderPainted(false);
        pengembalian.setContentAreaFilled(false);
        pengembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianActionPerformed(evt);
            }
        });
        getContentPane().add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini.setBackground(new java.awt.Color(241, 244, 246));
        statkini.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini.setForeground(new java.awt.Color(255, 255, 255));
        statkini.setText("STATUS TERKINI");
        statkini.setBorderPainted(false);
        statkini.setContentAreaFilled(false);
        statkini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statkini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statkiniActionPerformed(evt);
            }
        });
        getContentPane().add(statkini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        bg2.setBackground(new java.awt.Color(155, 164, 180));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("logout");
        kembali.setBorderPainted(false);
        kembali.setContentAreaFilled(false);
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        bg2.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, -1, -1));

        hover.setBackground(new java.awt.Color(190, 196, 205));
        bg2.add(hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        getContentPane().add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 430));

        labelmasukkanid.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        labelmasukkanid.setForeground(new java.awt.Color(155, 164, 180));
        labelmasukkanid.setText("Masukkan ID Buku");
        getContentPane().add(labelmasukkanid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        cekidb.setBackground(new java.awt.Color(216, 219, 227));
        cekidb.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cekidb.setForeground(new java.awt.Color(155, 164, 180));
        cekidb.setBorder(null);
        cekidb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(cekidb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 160, 40));

        buttoncek.setBackground(new java.awt.Color(155, 164, 180));
        buttoncek.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        buttoncek.setForeground(new java.awt.Color(255, 255, 255));
        buttoncek.setText("Cek");
        buttoncek.setBorder(null);
        buttoncek.setBorderPainted(false);
        buttoncek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttoncek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncekActionPerformed(evt);
            }
        });
        getContentPane().add(buttoncek, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 80, 30));

        labelupdate1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelupdate1.setForeground(new java.awt.Color(190, 196, 205));
        labelupdate1.setText("MEMPERBAHARUI DATA");
        getContentPane().add(labelupdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        new loginform().setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        dispose();
        new mainpage().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanActionPerformed
        // TODO add your handling code here:
        dispose();
        new pinjampage().setVisible(true);
    }//GEN-LAST:event_peminjamanActionPerformed

    private void bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuActionPerformed
        // TODO add your handling code here:
        dispose();
        new bukupage().setVisible(true);
    }//GEN-LAST:event_bukuActionPerformed

    private void pengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianActionPerformed
        // TODO add your handling code here:
        dispose();
        new kembalipage().setVisible(true);
    }//GEN-LAST:event_pengembalianActionPerformed

    private void statkiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statkiniActionPerformed
        // TODO add your handling code here:
        dispose();
        new statuspage().setVisible(true);
    }//GEN-LAST:event_statkiniActionPerformed

    private void anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggotaActionPerformed
        // TODO add your handling code here:
        dispose();
        new anggotapage().setVisible(true);
    }//GEN-LAST:event_anggotaActionPerformed

    private void buttoncekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncekActionPerformed
        // TODO add your handling code here:
        try {
            CRUDBuku cek = new CRUDBuku();
            int id_buku = Integer.parseInt(cekidb.getText());
            
            cek.idb(id_buku);
            if (cek.idb(id_buku)){
                dispose();
                hasil.getContentPane().setBackground(Color.decode("0xFFFFFF"));
                hasil.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "ID Buku tidak ditemukan!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka atau integer saja", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_buttoncekActionPerformed

    private void buttonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonupdateActionPerformed
    // TODO add your handling code here
        try {
            int id_bukuBaru = Integer.parseInt(inputidb.getText());
            String judulBaru = String.valueOf(inputjudul.getText());
            String penulisBaru = String.valueOf(inputpenulis.getText());
            String penerbitBaru = String.valueOf(inputpenerbit.getText());
            String jumlah_halamanBaru = String.valueOf(inputjumha.getText());
            CRUDBuku CrudB = new CRUDBuku();
            CrudB.update(id_bukuBaru, judulBaru, penulisBaru, penerbitBaru, jumlah_halamanBaru);

            hasil.dispose();
            hasil2.setVisible(true);
            hasil2.getContentPane().setBackground(Color.decode("0xFFFFFFF"));
        //}catch (SQLException e) {
          //  e.printStackTrace();
          //  JOptionPane.showMessageDialog(this, "Gagal mengupdate data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka atau integer saja", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_buttonupdateActionPerformed

    private void kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali1ActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new loginform().setVisible(true);
    }//GEN-LAST:event_kembali1ActionPerformed

    private void statkini2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statkini2ActionPerformed
        // TODO add your handling code here:
        hasil2.dispose();
        new statuspage().setVisible(true);
    }//GEN-LAST:event_statkini2ActionPerformed

    private void kembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali2ActionPerformed
        // TODO add your handling code here:
        hasil2.dispose();
        new loginform().setVisible(true);
    }//GEN-LAST:event_kembali2ActionPerformed

    private void lagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagiActionPerformed
        // TODO add your handling code here:
        hasil2.dispose();
        new anggotacreate().setVisible(true);
    }//GEN-LAST:event_lagiActionPerformed

    private void anggota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggota2ActionPerformed
        // TODO add your handling code here:
        hasil2.dispose();
        new anggotapage().setVisible(true);
    }//GEN-LAST:event_anggota2ActionPerformed

    private void anggota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggota1ActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new anggotapage().setVisible(true);
    }//GEN-LAST:event_anggota1ActionPerformed

    private void buku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku1ActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new bukupage().setVisible(true);
    }//GEN-LAST:event_buku1ActionPerformed

    private void peminjaman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjaman1ActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new pinjampage().setVisible(true);
    }//GEN-LAST:event_peminjaman1ActionPerformed

    private void pengembalian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalian1ActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new kembalipage().setVisible(true);
    }//GEN-LAST:event_pengembalian1ActionPerformed

    private void statkini1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statkini1ActionPerformed
        // TODO add your handling code here:
        hasil.dispose();
        new statuspage().setVisible(true);
    }//GEN-LAST:event_statkini1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void bukuupdate(String args[]) {
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
            java.util.logging.Logger.getLogger(bukuupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bukuupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bukuupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bukuupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bukuupdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anggota;
    private javax.swing.JButton anggota1;
    private javax.swing.JButton anggota2;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel bg3;
    private javax.swing.JPanel bg4;
    private javax.swing.JButton buku;
    private javax.swing.JButton buku1;
    private javax.swing.JButton buku2;
    private javax.swing.JButton buttoncek;
    private javax.swing.JButton buttonupdate;
    private javax.swing.JTextField cekidb;
    private javax.swing.JDialog hasil;
    private javax.swing.JDialog hasil2;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JButton home2;
    private javax.swing.JPanel hover;
    private javax.swing.JPanel hover1;
    private javax.swing.JPanel hover2;
    private javax.swing.JTextField inputidb;
    private javax.swing.JTextField inputjudul;
    private javax.swing.JTextField inputjumha;
    private javax.swing.JTextField inputpenerbit;
    private javax.swing.JTextField inputpenulis;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton kembali;
    private javax.swing.JButton kembali1;
    private javax.swing.JButton kembali2;
    private javax.swing.JLabel labelberhasil;
    private javax.swing.JLabel labelberhasil1;
    private javax.swing.JLabel labelida;
    private javax.swing.JLabel labeljudul;
    private javax.swing.JLabel labeljumha;
    private javax.swing.JLabel labelmasukkanid;
    private javax.swing.JLabel labelpenerbit;
    private javax.swing.JLabel labelpenulis;
    private javax.swing.JLabel labelupdate;
    private javax.swing.JLabel labelupdate1;
    private javax.swing.JLabel labelupdate2;
    private javax.swing.JLabel labelupdate3;
    private javax.swing.JLabel labelupdate4;
    private javax.swing.JButton lagi;
    private javax.swing.JButton peminjaman;
    private javax.swing.JButton peminjaman1;
    private javax.swing.JButton peminjaman2;
    private javax.swing.JButton pengembalian;
    private javax.swing.JButton pengembalian1;
    private javax.swing.JButton pengembalian2;
    private javax.swing.JButton statkini;
    private javax.swing.JButton statkini1;
    private javax.swing.JButton statkini2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.hthdt.chuong3.dohoa.Framers;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class XuatDuLieuFrame extends javax.swing.JInternalFrame {

    private int[] a;

    /**
     * Creates new form Xuadulieuframe
     */
    public XuatDuLieuFrame() {
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

        pnPanel = new javax.swing.JPanel();
        btnsapxep = new javax.swing.JButton();
        btnVe1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vẽ dữ liệu mảng 1 chiều");

        javax.swing.GroupLayout pnPanelLayout = new javax.swing.GroupLayout(pnPanel);
        pnPanel.setLayout(pnPanelLayout);
        pnPanelLayout.setHorizontalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );
        pnPanelLayout.setVerticalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        btnsapxep.setText("Sắp xếp mảng 1 chiều");
        btnsapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsapxepActionPerformed(evt);
            }
        });

        btnVe1.setText("Vẽ mảng 1 chiều ra màn hình");
        btnVe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVe1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsapxep, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnVe1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnsapxep))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(358, Short.MAX_VALUE)
                    .addComponent(btnVe1)
                    .addGap(32, 32, 32)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsapxepActionPerformed
         // TODO add your handling code here:
       
          Graphics2D gr = (Graphics2D) pnPanel.getGraphics();
        int maxX = pnPanel.getWidth();
        int maxY = pnPanel.getHeight();
        int step = 5;
        int n = maxX/step;
         int beginX =0, beginX2 = 0;
         for(int i = 0; i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                int temp=a[i];
                gr.clearRect(beginX, maxY - a[i], step, a[i]);
                a[i]= a[j];
                gr.drawRect(beginX, maxY - a[i], step, a[i]);
                beginX2=j*step;
                gr.clearRect(beginX2, maxY-a[j], step, a[j]);
                a[j] = temp;
                gr.drawRect(beginX2, maxY-a[j], step, a[j]);
            }
        }
        beginX += step;
    }
        
    }//GEN-LAST:event_btnsapxepActionPerformed

    private void btnVe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVe1ActionPerformed
        // TODO add your handling code here:
         Graphics2D gr = (Graphics2D) pnPanel.getGraphics();
        int maxX = pnPanel.getWidth();
        int maxY = pnPanel.getHeight();
        int step = 5;
        int n = maxX/step;
         a =new int[n];
        Random rnd = new Random();
        for(int i = 0; i <n;i++){
            a[i] = rnd.nextInt(maxY);       
        }
        int beginX =0, beginY = 0;
        gr.clearRect(0, 0, maxX, maxY);
        for(int i =0;i<n;i++){
         //   gr.drawRect(beginX, beginY, step, a[i]);
           gr.drawRect(beginX, maxY - a[i], step, a[i]);
            beginX+=step;
    }//GEN-LAST:event_btnVe1ActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVe1;
    private javax.swing.JButton btnsapxep;
    private javax.swing.JPanel pnPanel;
    // End of variables declaration//GEN-END:variables
}

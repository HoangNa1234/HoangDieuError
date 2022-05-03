/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.hthdt.chuong3.dohoa.Framers;

import com.mycompany.hthdt.chuong3.coffeelogic.CoffeeShop;
import com.mycompany.hthdt.chuong3.coffeelogic.Manager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class MyCoffee extends javax.swing.JInternalFrame {
 Manager[] managers;
    
    /**
     * Creates new form MyCoffee
     */
    public MyCoffee() throws ParseException {
        initComponents();
          SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[] {new CoffeeShop("Kha coffee", "2 Nguyen Hue"),
                                            new CoffeeShop("White Coffee","2 Ba Trieu")};
      managers = new Manager[]{
            new Manager(a, 1000,"Le Thi A", 0,df.parse("12-12-199")),
        new Manager(new CoffeeShop[] {new CoffeeShop("Hoang Hac","12 Nguyen Hue")}, 1000,"Nguyen van B", 1,df.parse("12-12-1999"))};
    for(int i =0; i<managers.length;i++){
        cbQuanLy.addItem(managers[i].getHoten());
    }
    
        DefaultTableModel model = (DefaultTableModel) tblCoffeeShop.getModel();
        
        model.removeRow(0);
        CoffeeShop[] shops = managers[0].getShops();
        for(int i = 0; i< shops.length;i++){
            model.insertRow(model.getRowCount(),
                    new Object[]{model.getRowCount()+1,
                    shops[i].getName(),
                    shops[i].getAddress()});
  
// 
      
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

        jLabel1 = new javax.swing.JLabel();
        cbQuanLy = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCoffeeShop = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Danh sách quản lý coffee");

        jLabel1.setText("Họ tên người quản lý");

        cbQuanLy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbQuanLyItemStateChanged(evt);
            }
        });

        tblCoffeeShop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên quán", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(tblCoffeeShop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbQuanLy))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbQuanLyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbQuanLyItemStateChanged
//             TODO add your handling code here:
              DefaultTableModel model1 = (DefaultTableModel) tblCoffeeShop.getModel();
    model1.setRowCount(0);
    int index = cbQuanLy.getSelectedIndex();
    CoffeeShop[] shops = managers[index].getShops();
    for(int i = 0; i < shops.length;i++){
        model1.insertRow(model1.getRowCount(), 
       new Object[]{model1.getRowCount() +1,
           shops[i].getName(),
           shops[i].getAddress()});
    }
    }//GEN-LAST:event_cbQuanLyItemStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbQuanLy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCoffeeShop;
    // End of variables declaration//GEN-END:variables
}
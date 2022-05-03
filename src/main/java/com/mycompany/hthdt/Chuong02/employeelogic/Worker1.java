/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hthdt.Chuong02.employeelogic;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Worker1 extends Person1 implements TaxInterface1 {
    public String congty;

    public Worker1() {
    }
    
    

    public Worker1(String congty, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.congty = congty;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    @Override
    public double calcTax(double income) {
      return (0.04*income);
      
    }
    
}

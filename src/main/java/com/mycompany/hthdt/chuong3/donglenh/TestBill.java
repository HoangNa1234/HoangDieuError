/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hthdt.chuong3.donglenh;

import com.mycompany.hthdt.chuong3.coffeelogic.Bill;
import com.mycompany.hthdt.chuong3.coffeelogic.Product;

/**
 *
 * @author LENOVO
 */
public class TestBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException{

        Bill a = new Bill(12, new Product[]{
            new Product("Shampoo", 12),
            new Product("Closeup",21)});
        System.out.println("a = " + a);
        Bill temp = (Bill) a.clone();
        temp.setBillID(15);
        System.out.println("a = " +a);
        System.out.println("temp = "+temp);
    }
    
}

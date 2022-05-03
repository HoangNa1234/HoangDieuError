/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hthdt.chuong3.coffeelogic;

import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class ProductComByeName implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
      return o1.getName().compareToIgnoreCase(o2.getName());
      
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hthdt.chuong3.donglenh;

import com.mycompany.hthdt.chuong3.coffeelogic.CoffeeShop;
import com.mycompany.hthdt.chuong3.coffeelogic.Manager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author LENOVO
 */
public class TestCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[] {new CoffeeShop("Kha coffee", "2 Nguyen Hue"),
                                            new CoffeeShop("White Coffee","2 Ba Trieu")};
        Manager[] managers = new Manager[]{
            new Manager(a, 1000,"Le Thi A", 0,df.parse("12-12-199")),
        new Manager(new CoffeeShop[] {new CoffeeShop("Hoang Hac","12 Nguyen Hue")}, 1000,"Nguyen van B", 1,df.parse("12-12-1999"))};
         
           
        
      System.out.println(Arrays.toString(managers));
      
    }
}       // mi cchay cai ni thu
        

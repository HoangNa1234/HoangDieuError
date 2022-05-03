/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hthdt.donglenh.chuong01;

/**
 *
 * @author LENOVO
 */
public class bai04 {
    public static void main(String[] args){
       
        Shape htron = new circle(5, 1, 2);
//        System.out.println("Chu vi hinh tron la " + htron.calcPerimeter());
//        System.out.println("Dien tich hinh tron la " + htron.calcArea());
            System.out.println(htron.toString());
         Shape  hcn = new Rectangle(13,15,8,5);
        
//        System.out.println("Chu vi hcn " + hcn.calcPerimeter());
//        System.out.println("Dien tich hcn" + hcn.calcArea());
        System.out.println(hcn);
    } 
}

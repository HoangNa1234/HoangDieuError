/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hthdt.Chuong02.donglenh;

import com.mycompany.hthdt.Chuong02.employeelogic.Student1;
//import com.mycompany.hthdt.donglenh.chuong01.Student;
//import com.mycompany.hthdt.donglenh.chuong01.Student;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author LENOVO
 */
public class TestStudent {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
    String input = "12-12-1999";
        Date ngaysinh = df.parse(input);
   Student1 obj = new Student1("DAI HOC HUE", "XUAT SAC", "NGUYEN VAN A", 1,ngaysinh);
  //  Student1 obj = new Student1(input, input, input, 1, ngaysinh);
 //   Student obj = new Student(input, input, input, 0, ngaysinh);
    
  switch(obj.getHocluc()){
      case "Xuat sac":
          obj.setHocbong(1000);
          break;
          case"Gioi":
              obj.setHocbong(885.5);
              break;
          default:
              obj.setHocbong(0);
              break;
  }
    System.out.println(obj);
    
}

}
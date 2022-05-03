                    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hthdt.chuong3.donglenh;

import com.mycompany.hthdt.chuong3.coffeelogic.Product;
import com.mycompany.hthdt.chuong3.coffeelogic.ProductComByeName;
import com.mycompany.hthdt.chuong3.coffeelogic.ProductCompByPrice;
import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tạo mảng các sản phẩm
       Product[] sp = new Product[] { new Product("Sunsilk",12),
                                                        new Product("LifeBouy",5),
                                                        new Product("Sunsilk",8),
                                                        new Product("Espresso",2),                                        
                                                 new Product("Thien long",1)};    
       
    
   System.out.println("Mang ban dau la");
   System.out.println(Arrays.toString(sp));
//       Product temp;
//       for(int i =0; i <sp.length -1;i++)
//           for(int j = i +1;j<sp.length;j++)
//               if(sp[i].getPrice()>sp[j].getPrice()){
//                   temp = sp[i];
//                   sp[i] = sp[j];
//                   sp[j]= temp;
//               }
//Sắp xếp mảng theo giá cả tăng dần
//Arrays.sort(sp,new ProductCompByPrice());
//   System.out.println("Mang sap xep tang dan theo gia ca");
//   System.out.println(Arrays.toString(sp));
     System.out.println("Sap xep theo ten san pham");
     Arrays.sort(sp, new ProductComByeName());
     System.out.println(Arrays.toString(sp));
     int index = Arrays.binarySearch(sp, new Product("Sunsilk",12),new ProductComByeName());
     if(index<0){
         System.out.println("Khong tin thay");
     }
     else{
         System.out.println("Phan tu thu"+ index+ "chia gia tri can tim");
         System.out.println(sp[index]);
         
     }
     
}
    
}

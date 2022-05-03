/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hthdt.chuong3.donglenh;

/**
 *
 * @author LENOVO
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = " Long lanh day nuoc in troi\n Thanh xua khoi biec non phoi bong vang";
        System.out.println(content);
        int a;
        // Thao tac tin vi tri
        System.out.println("Vi tri cua ki tu a trong chuoi la"+ content.indexOf("a"));
        System.out.println("Vi tri cua tu nguoc trong chuoi la"+ content.indexOf("nuoc"));
    //Thao tac kiem tra khoi dau va ket thuc
    System.out.println("Chuoi mo dau bang cum tu Long:" + content.startsWith("Long"));
    System.out.println("Chuoi mo ket thuc cum tu troi:" + content.endsWith("troi"));
//Thao tac 3; cat chuoi theo vi tri
String temp = content.substring(20,26);
System.out.println("Chuoi con la " + temp );
// theo tac 4: phan tach chuoi
String[] result = content.split("\n");
for(int i=0;i<result.length;i++){
    System.out.println(result[i]);
    
}
//thao tac 5: loai bo khoang trang dau cuoi giua
for(int i=0;i<result.length;i++){
    System.out.println(result[i].trim());
    }
//theo tac tahy the ki ty
temp = content.replace('a','z');
System.out.println(temp);
//theo tac 7: chuyen kieu
temp = content.toUpperCase();
System.out.println(temp);
temp = content.toLowerCase();
//TT8: so sanh chuoi
temp = "Nguyen";
if(temp.compareToIgnoreCase("nguyen")==0){
    System.out.println("2 chuoi bang nhau");
}else{
    System.out.println("2 chuoi k bang nhau");
    
}
//tt9 : noi chuoi
temp = temp.concat("Van A");
System.out.println(temp);
//Tt10: truy xuat 
for(int i =0;i<temp.length();i++){
    System.out.print(temp.charAt(i));
}
System.out.println();
// thao tac 10: Chuyen kieu
temp="155";
int n= Integer.parseInt(temp);
System.out.println("n = " + n);
// thao tac 12:Su dung tringbuilder
StringBuilder sb = new StringBuilder();
sb.append("Long lanh day nuoc in troi\n");
sb.append("Thanh xay khoi biec non phoi bong vang");
temp = sb.toString();
System.out.println(sb);

}
}
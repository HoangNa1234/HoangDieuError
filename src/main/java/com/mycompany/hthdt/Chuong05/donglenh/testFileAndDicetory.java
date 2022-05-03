/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hthdt.Chuong05.donglenh;

import com.mycompany.hthdt.Chuong05.logic.FileAndDircetoryOperations;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class testFileAndDicetory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    FileAndDircetoryOperations fo = new FileAndDircetoryOperations();
  //  File[] content = fo.getDirectoryContent("D:\\New folder (2)");
 //  System.out.println(fo.displayContent(content));
// File[] thumuc = fo.getSubDirectorimes(content);
// System.out.println("Danh sach cac thu muc con la");
// System.out.println(fo.displayContent(thumuc));
// File[] taptin = fo.getFiles(content);
// System.out.println("Danh sach cac tap tin");
// System.out.println(fo.displayContent(taptin));
fo.GetcontetntRecursively("D:\\New folder (2)");
    }

            
        
    

}

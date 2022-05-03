/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hthdt.Chuong05.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class FileAndDircetoryOperations {

    public FileAndDircetoryOperations() {
    }
    //thao tac 1: liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }
    //Thao tac 2: xuat ket qua
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<content.length;i++){
            sb.append(content[i].getPath()+ File.separator+ content[i].getName());
            sb.append("\n");
            
        }
        return sb.toString();
    }
    //Theo tac 3: loc ra cac thu muc
    public File[] getSubDirectorimes (File[] content){
    ArrayList<File> result = new ArrayList<>();
    for(int i=0;i<content.length;i++){
        if(content[i].isFile()){
            result.add(content[i]);
}
    }
    File[] ketqua = new File[result.size()];
    return result.toArray(ketqua);
    
    }
    //Thao tac 4: loc ra tat ca cac tap tin
    
    public File[] getFiles(File[] content) {
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i< content.length; i++){
        if(content[i].isFile()){
            result.add(content[i]);
            
        }
            
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }

    //tt5: DUYET DE QUY
    public void  GetcontetntRecursively(String folder){
        File content = new File(folder);
     
        if(content.isFile()){
            System.out.println(content.getPath()+File.separator + content.getName());
     return;
        }
        //cau goi de quy trong stack
        System.out.println("Thu muc: " + folder);
        File[] sub = content.listFiles();
        for(int i=0; i<sub.length;i++){
            GetcontetntRecursively(folder+File.separator + sub[i].getName());
            
        }
    }
    public String readTextFile(String filename) throws IOException{
        StringBuilder content = new StringBuilder();
        
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine())!=null){
                content.append(line);
                content.append("\n");
            }
                br.close();
                fr.close();
            
            
        }catch (FileNotFoundException ex ){
          return"khong tin thay file" + filename;
            //Logger.getLogger(FileAndDircetoryOperations.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex ){
           return "khong the doc file"+filename;
            //Logger.getLogger(FileAndDircetoryOperations.class.getName()).log(Level.SEVERE,null,ex);
        }
        return content.toString();
    }
    public boolean writeTextFile(String filename, String content) throws IOException{
    boolean flag = true;
    try{
        
    //mở file
        FileWriter fw = new FileWriter(filename);
      
        BufferedWriter bw = new BufferedWriter(fw);
        //sử dụng
        bw.write(content);
        //đóng
        bw.flush();
        bw.close();
        fw.close();
        
    }
    catch (IOException ex ){
           
        return false;
        }
    return flag;
    }
}
   
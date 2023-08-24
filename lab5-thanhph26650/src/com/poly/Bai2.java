
package com.poly;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Bai2 {
     private ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner (System.in) ;
    
    public void nhap(){
         System.out.println("danh sách ");
      
         do{
             System.out.printf("nhap ten  là : ");
             String st=sc.nextLine();
             if(st.isEmpty() ){
                 break;
             }
               list.add(st);
             
             
              
              
             
         }
         while (true);
    }
    public void xuat(){
        System.out.println("----------------------");
        for(String item : list){
            System.out.print("    "+item);
            
        }
        System.out.println();
    }
    public void xuatngaunhien(){
        Collections.shuffle(list);
        xuat();
        
    }    
    public void sapxep(){
        Collections.sort(list, (a,b)->a.compareTo(b));
        //tự chỉnh số tăng hoặc giảm
        xuat();
    }
    public void timvaxoa(){
            
        Scanner sc= new Scanner (System.in);
        System.out.println("ten là ");
        String hoten= sc.nextLine();
        for( String x:list){
            if (x.equals(hoten)){
                list.remove(x);
                        break;
            }
        }
                
            }
            
    
}

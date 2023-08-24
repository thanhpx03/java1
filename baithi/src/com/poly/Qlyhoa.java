/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Qlyhoa {
    ArrayList<Hoa> list=new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        String chon;
        do{
        Hoa a= new Hoa();
      a.nhapHoa();
      list.add(a);
            System.out.println("nhấn Y để nhập tip hoặc  N đẻ thoát");
      chon=sc.nextLine();
        }
        while(chon.equals("Y"));
    }
    public void xuat(){
        System.out.println("-----------------------------)");
        System.out.println("mã            loại            màu sắc");
        for(Hoa x: list){
            x.xuatHoa();
        }
        System.out.println("------------------------");
        
    }
    public void xoa(){
        System.out.print("mời nhập id xóa là : ");
        int id= sc.nextInt();
        for(Hoa x:list){
            if(id==x.getId()){
                x.xuatHoa();
                list.remove(x);
                break;
            }        
        }
               
        
    }
    public void sapxep(){
        Comparator <Hoa> ab=new Comparator<Hoa>(){
            @Override
            public int compare(Hoa o1, Hoa o2) {
               int s=0;
               int hoa1=o1.getId();int hoa2=o2.getId();
               if(hoa1>hoa2) s=-1;
               else if(hoa1<hoa2)s=1;
               return s;
            }
            
        };
        Collections.sort(list, ab);
    }
    public void kethua(){
       
    
        
    }
}

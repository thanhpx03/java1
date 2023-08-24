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


public class Ql {
   ArrayList<Nhanvien> list = new ArrayList<> ();
    Scanner sc =new Scanner (System.in);
    public void nhap(){
        System.out.print("ma nhan vien là ");
     String   ma=new Scanner(System.in).nextLine();
        System.out.print("tên nhân vien ");
        String hoTen=new Scanner(System.in).nextLine();
        System.out.print("lương cơ bản là ");
        double luongcoban = new Scanner(System.in).nextDouble();  
        System.out.println("nhâp. 1 hành chính - 2 .kinh doanh ");
        int phongban= new Scanner(System.in).nextInt();
        
        switch(phongban){
            case 1:{
                System.out.print("số ngày công là ");
                double songay=sc.nextDouble();
               Nhanvien nv1 =new NVHC(ma,hoTen,luongcoban,songay);      
                list.add(nv1);
            
            
        }
            break;
        
            case 2:{
                 System.out.print("lương kinh doanh là ");
                double luongkd=sc.nextDouble();
                Nhanvien nv2=new NVKD( ma, hoTen,  luongcoban,luongkd);
                list.add(nv2);
                
            }
            break;
    
        default :
        System.out.println("bạn chọn sai rui xin nhập lại");
        break;
        }
}
    public void xuat(){
        System.out.println("---------danh sách nv --------");
        System.out.println("mã        hoten       phòng ban        lương");
        for(Nhanvien nv:list){
            System.out.printf("%-10s  %-10s  %-15f  %-20s \n",nv.getMa(), 
            nv.getHoTen(),nv.getLuongcoban(),nv.getPhongban());
        }
         System.out.println("--------------------------------------");
        System.out.println("");
    }
    public void tim(String ma){
        boolean found= false;
         System.out.println("---------danh sách nv --------");
        System.out.println("mã        hoten       phòng ban        lương");
       
        for(Nhanvien nv: list){
            if(nv.getMa().equalsIgnoreCase(ma)){
               System.out.printf("%-10s  %-10s  %-15f  %-20s \n",nv.getMa(), 
            nv.getHoTen(),nv.getLuongcoban(),nv.getPhongban());
               found=true;
               break;
            }if (found==false) {
                System.out.println("không  tìm thấy mã ");
                break;
            }
        }
        
    } 
    public void xoa (String ma){
        boolean found= false;
         System.out.println("---------danh sách nv --------");
        System.out.println("mã        hoten       phòng ban        lương");
       
        for(Nhanvien nv: list){
            if(nv.getMa().equalsIgnoreCase(ma)){
               System.out.printf("%-10s  %-10s  %-15f  %-20s \n",nv.getMa(), 
            nv.getHoTen(),nv.getLuongcoban(),nv.getPhongban());
               list.remove(nv);
               found=true;
               break;
            }if (found==false) {
                System.out.println("khoogn tìm thấy mã ");
                break;
            }
        }
        
    }
    public void capnhat(){
        boolean ok =false;
        for(Nhanvien nv : list){
            
        }
        
    }
    public void sapxepten(){
        Comparator<Nhanvien> ab=new Comparator<Nhanvien>() {
            @Override
            public int compare(Nhanvien o1, Nhanvien o2) {
                return (o1.hoTen.compareTo(o2.hoTen));
            }
        };
         Collections.sort(list, ab);
    
} 
    public void sapxeptop(){
        Comparator<Nhanvien> nv = new Comparator<Nhanvien>() {
            @Override
            public int compare(Nhanvien o1, Nhanvien o2) {
               int s=0;
               double nv1 = o1.getLuongcoban(),nv2 = o2.getLuongcoban();
               if (nv1>nv2) s=-1;
               else if (nv1<nv2)s=1;
               return s;
            }
        };
        Collections.sort(list, nv);
    }
    public void top5(){
        sapxeptop();
        int t =(list.size()<5)?list.size():5;
    for (int i=0;i<t;i++){
        list.get(i).xuat();
        
    }
}
}

package com.ploy;

import java.util.ArrayList;
import java.util.Scanner;




public class Ql {
    ArrayList<SinhVien> list=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
       
    public void nhap(){
        SinhVien sv = new SinhVien();
        
       
        
        sv.nhap();
        list.add(sv);
        
    }
    
    public void xuat(){
        System.out.println("---------------");
        System.out.println("----------danh sách sinh viên ------------");
        System.out.println("mã            tên            chuyen nganh");
        
        for(SinhVien x : list){
            x.xuât();
        }
        System.out.println("");
    }
    public void tim (){
         System.out.print("Nhap ma nhan vien can tim: ");
            String masv = sc.nextLine();
            for (SinhVien item : list) {
                if(masv.equalsIgnoreCase(item.getMaSv())){
                    System.out.println("Nhan vien can tim la: ");
                     System.out.println("mã            tên            chuyen nganh");
                    item.xuât();
                    return;
                }
            }
            System.out.println("Khong tim thay nhan vien co ma: "+ masv);
        }
    
  
    public static void menu (){
        System.out.println("---------------------");
        System.out.println("1 nhập sinh viên ");
        System.out.println("2. xuất sinh vien ");
        System.out.println("com.ploy.Ql.menu()");
        System.out.println("com.ploy.Ql.menu()");
        System.out.println("--------------------");
        System.out.println("chọn só : ");
    
}
    public static void main(String[] args) {
        Ql nv = new Ql();
        do{
            menu();
            int chon;
            Scanner sc = new Scanner(System.in);
            chon=sc.nextInt();
            switch(chon){
                case 1: nv.nhap();
                break ; 
                case 2 : nv.xuat();
                break;
                case 3: nv.tim();
            }
                
                }while(true);
    }
}

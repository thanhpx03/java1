package com.poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ql {
    ArrayList<SinhVien> list = new ArrayList<>();
    public static void menu() {
        System.out.println("----------------------------------");
        System.out.println("1.nhâp thông tin sinh vien ");
        System.out.println("2. in thông tin sinh viên");
        System.out.println("3.tìm sinh viên theo mã");
        System.out.println("4.sắp xếp nhân viên");
        System.out.println("5. thoát");
        System.out.println("-----------------------------------");
        System.out.print("mời chọn: ");

    }
   
    public  void nhapsv(){
       SinhVien nv =new SinhVien();
                    nv.nhap();
                    list.add(nv);
    
    }
    public  void xuatsv(){
         System.out.println("-----------dánh sách sinh viên----------");
        System.out.println("mã        hoten       chuyen nganh");

        for(SinhVien x:list){
           x.xuat();
           
        }
    }
    public void tim(String MaSv){
        boolean ok = false;
        System.out.println("-------------------");
         System.out.println("mã        hoten       chuyen nganh");
        for(SinhVien x:list){
            if(x.getMaSv().equalsIgnoreCase(MaSv)){  
            System.out.printf("%-10s  %-10s  %-15s  \n",x.getMaSv(), 
            x.getHoTen(),x.getChuyenNganh());
                ok=true;
                break;
            }
        }
         if(ok==false){
                System.out.println("k tìm thấy mã");
                
     
         
        }
    }
    public void sapxep(){
       Comparator <SinhVien> ab=new Comparator <SinhVien>() {
           @Override
           public int compare(SinhVien o1, SinhVien o2) {
             return (o1.getChuyenNganh().compareTo(o2.getChuyenNganh()));
           }
        };
        Collections.sort(list, ab);
    }
    public static void main(String[] args) {
        Ql sv = new Ql();
         Scanner sc = new Scanner(System.in);
        do {
            menu();

            int luachon;
            luachon = sc.nextInt();
            switch(luachon){
                case 1: {
                   sv.nhapsv();
                }
                        
                break;
                case 2 :
                   sv.xuatsv();
                break;
                case 3: 
            {System.out.println("nhập mã để tìm là ");
                String MaSv = new Scanner(System.in).nextLine();
                sv.tim(MaSv);
                break;
            }
                case 4 : {
                    System.out.println("đã sắp xếp theo chuyên ngành !");
                    sv.sapxep();
                    break;
                }
            }

        } while (true);
    }

   
   
}

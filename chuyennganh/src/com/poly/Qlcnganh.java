
package com.poly;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javafx.print.Collation;


public class Qlcnganh {
    ArrayList<Cnganh> list = new ArrayList<>();
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
   public void nhap1(){
       Cnganh nv = new Cnganh();
       nv.nhap();
       list.add(nv);
   }
   public void xuat1(){
       System.out.println("----------------------------");
       System.out.println("ten        số lượng        machuyen nganh");
       for(Cnganh x : list){
           x.xuat();
       }
   }
   public void tim(int ma){
       
       System.out.println("----------------------------");
       System.out.println("ten        số lượng        machuyen nganh");
       for(Cnganh x: list ){
           if(ma==x.getMa()) {
               System.out.printf("%-10s     %-10d      %-10d \n" ,x.getCnganh(),x.getGV(),x.getMa());
               break;
           } else{
                   System.out.println("k tim thấy !");
                   }
       }
       
   }
   public void sapxep(){
       Comparator<Cnganh> ab =new Comparator<Cnganh>() {
           @Override
           public int compare(Cnganh o1, Cnganh o2) {
               int s= 0 ;
               int nv1 = o1.getGV();int nv2 = o2.getGV();
                if (nv1<nv2) s=-1;
               else if (nv1>nv2)s=1;
               return s;
           }
       };
        Collections.sort(list, ab);
       
   }
   public static void main(String[] args) {
        Qlcnganh sv = new Qlcnganh();
        
         Scanner sc = new Scanner(System.in);
        do {
            menu();

            int luachon;
            luachon = sc.nextInt();
            switch(luachon){
                case 1: {
                   sv.nhap1();
                }
                        
                break;
                case 2 :
                   sv.xuat1();
                break;
                case 3: {
                    System.out.println("nhập  mã là ");
                    int ma = sc.nextInt();
                    sv.tim(ma);
                    
                }break;
                
                case 4: {
                    System.out.println("đã sắp xếp xog rui ");
                    sv.sapxep();
                    
                }
                break;
                case 5: {
                   
                    sv.nhap1();
                }
                
                    
            }
            

        } while (true);
    


        }
}

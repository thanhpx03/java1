
package com.poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
     static   List<Bai2> list = new ArrayList<Bai2>();
        
       public static void menu() {
        System.out.println("1.Nhập danh sách sinh viên");
        System.out.println("2.Xuất thông tin danh sách sinh viên");
        System.out.println("3.Xuất danh sách sinh viên có học lực giỏi");
        System.out.println("4.Sắp xếp danh sách sinh viên theo điểm");
        System.out.println("5.Thoát");
        System.out.println("-------------------------------");
        System.out.print("Mời chọn: ");

    }

    public static void main(String[] args) {
        Main qlSV = new Main();
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    qlSV.nhap();
                    break;
                case 2:
                    qlSV.xuat();
                    break;
                case 3:
                    qlSV.gethocgioi();
                    break;
                case 4:
                    qlSV.sapxep();
                    break;
                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng!");
                    return;
                default:
                    System.out.println("Chọn sai chức năng, chọn lại");

            }
        } while (true);
    }
             
        
          
       
      public static void nhap(){
           Scanner sc = new Scanner(System.in);
       
        System.out.print("Chọn ngành [Biz - IT]: ");
        String nganh = sc.nextLine();

        if (nganh.equalsIgnoreCase("biz")) {
            Biz biz = new Biz();
           
            biz.nhap();
            list.add(biz);
        } else if (nganh.equalsIgnoreCase("it")) {
            It it = new It();
           
            it.nhap();
            list.add(it);
        }
    }
      
       public static void xuat(){
      for (int i=0;i<list.size();i++){
          list.get(i).xuat();
      }
           System.out.println();
    }

    
   public static void gethocgioi(){
       System.out.println("---------------Thông tin sinh viên---------------");
        System.out.printf("%-20s %-15s %-10s %-10s\n", "Họ tên", "Ngành", "Điểm", "Học lực");
        for (Bai2 dssv : list) {
            if ("Giỏi".equals(dssv.hocluc())) {
                dssv.xuat();
            }
           }
       }
      
   
   
    
  Comparator<Bai2> giac = new Comparator<Bai2>() {
                @Override
                public int compare(Bai2 sp1, Bai2 sp2) {
                   if(sp1.diem() < sp2.diem())return 1;
                   else return -1;
                }
            };
                   //phuong thuwsc sap xep danh sach theo diem
                   public void sapxep(){
                       Collections.sort(list, giac);
                   }

}
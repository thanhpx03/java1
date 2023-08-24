package com.poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {

    private ArrayList<sanpham> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.println("danh sách ");
         int   i=1;
      
        do {
            System.out.printf("nhap ten san pham  là : ");
            String sp = sc.nextLine();
            if (sp == null || sp.equals("")) {
                break;
            }
            System.out.println("giá sản phẩm");
            double b = sc.nextDouble();
            
            list.add(new sanpham(sp ,b));
            
            sc.nextLine();

        } while (true);
    }

    public void xuat() {
        System.out.println("----------------------");
        for (sanpham item : list) {
            System.out.printf("%20s | %.2f \n    " , item.getTen(),item.getGia());

        }
        System.out.println();
    }

   

    Comparator<sanpham> giac = new Comparator<sanpham>() {
                @Override
                public int compare(sanpham sp1, sanpham sp2) {
                   if(sp1.gia < sp2.gia)return 1;
                   else return -1;
                }
            };
                   //phuong thuwsc sap xep danh sach theo diem
                   public void sapxeptheogia(){
                       Collections.sort(list, giac);
                   }
    public void timkiemvaxoa(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("ten sp là ");
        String a=sc.nextLine();
        sanpham found = null;
        
        for (sanpham x:list){
            if (x.getTen().equals(a)){
                found= x;
                break;
            }
        }
        if (found != null){
            
            list.remove(found);
            System.out.println("san phảm xoa khỏi danh sách ");
        }else {
            System.out.println("k có sản phẩm ");
        }
    }
    public void tinhtrungbinh(){
        
        double tb=0,tong=0;
        for(sanpham x: list){
            tong+=x.getGia();
            
        }
        tb=tong/list.size();
        System.out.printf("gia trung bình là %f\n", tb);
    }
}

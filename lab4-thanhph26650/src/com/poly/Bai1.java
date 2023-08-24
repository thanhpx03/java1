
package com.poly;

import java.util.Scanner;


public class Bai1 {
        String tenSp;
        double GiaDon;
        double GiamGia;
        double getThueNhapKhau(){
            return GiaDon*0.1;
        }
        void xuat(){
            System.out.println("ten sp "+tenSp+"- don gia "+GiaDon+"- giam gia"
                    +GiamGia+"- thue"+ getThueNhapKhau());
        }
        void nhap (){
            Scanner sc = new Scanner (System.in);
            System.out.println("nhap ten san pham ");
            tenSp =sc.nextLine();
            
            System.out.print("nhap don gia : ");
            GiaDon = sc.nextDouble();
             System.out.print("nhap giam gia la : ");
             GiamGia = sc.nextDouble();
}
}

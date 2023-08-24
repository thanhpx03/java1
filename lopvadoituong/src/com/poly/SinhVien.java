
package com.poly;

import java.util.Scanner;


public class SinhVien {
    String ten;
    double diem;

    public SinhVien() {
    }
    
    void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("ten sinh vien la ");
        ten=sc.nextLine();
        System.out.println("nhap diem la ");
        diem=sc.nextDouble();
        
    }
    void xuat(){
        System.out.println("ten "+ten+ "-diem"+diem+   xeploai());
    }
    String xeploai(){
        if(diem<=5)
            return "yếu";
        else
            return "gioi";
    }
    
}

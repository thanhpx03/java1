

package com.poly;

import java.util.Scanner;


public class Hamgiatritrave {
    String ten;
    double diem;

   // public Hamgiatritrave() {
  //      ten="pham xuan thanh";
  //      diem = 8;
  //  }

  //  public Hamgiatritrave(String ten, double diem) {
 //       this.ten = ten;
 //       this.diem = diem;
 //   }
    
    void nhap(){
        for(int i=0;i<3;i++){
        Scanner sc = new Scanner (System.in);
        System.out.println("ten sinh vien la ");
        ten=sc.nextLine();
        System.out.println("nhap diem la ");
        diem=sc.nextDouble();
        }
    }
    void xuat(){
        for(int i=0;i<3;i++){
        System.out.println("ten "+ten+ "-diem"+diem+   xeploai());
        }
    }
    String xeploai(){
        if(diem<=5)
            return "yếu";
        else
            return "gioi";
    }
    
}
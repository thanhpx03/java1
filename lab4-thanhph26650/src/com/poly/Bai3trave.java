
package com.poly;


public class Bai3trave {
    public static void main(String[] args) {
        //khởi tạo đối tượng
         Bai3 sp1 = new Bai3();
         Bai3 sp2 = new Bai3();
         
       
         sp1.nhap();
         sp1.xuat();
         sp2.nhap();
         sp2.xuat();
         
         
         Bai3 sp3 = new Bai3("hoa",10000,1000);
         Bai3 sp4 = new Bai3("nuoc hoa", 10000);
         sp3.xuat();
         sp4.xuat();
         
         
    }
}


package com.poly;

public class Main {
    public static void main(String[] args) {
         
        SinhVien sv[]=new SinhVien[5];
        for(int i=0;i < sv.length;i++){
            sv[i]=new SinhVien();
            sv[i].nhap();
            sv[i].xuat();
       
        }
        
    }
}


package com.poly;

import java.util.Scanner;


public class SinhVien {
    Scanner sc=new Scanner(System.in);
    private String maSv;
    private String hoTen;
    private String chuyenNganh;
    int n=0;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String chuyenNganh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
     public void nhap(){
         System.out.println("nhập mã sinh viên là ");
         this.maSv=new Scanner(System.in).nextLine();
         System.out.println("nhập tên là ");
         this. hoTen=new Scanner(System.in).nextLine();
         System.out.println("nhâp chuyên ngành là ");
         this. chuyenNganh=new Scanner(System.in).nextLine();
         System.out.println("");
     }
    public void xuat(){
       
        System.out.printf("%-10s  %-10s  %-15s  \n",getMaSv(), 
            getHoTen(),getChuyenNganh());
        System.out.println("");
    }

   
  
}

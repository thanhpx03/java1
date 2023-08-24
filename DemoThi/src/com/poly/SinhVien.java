package com.poly;

import java.util.Scanner;


public class SinhVien {
    private String maSV;
    private String hoTen;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        chuyenNganh = sc.nextLine();
    }
    public void inThongTin(){
        System.out.printf("id: %s\t Ten: %s\t Chuyen ghanh: %s\n",getMaSV(),getHoTen(),getChuyenNganh());
    }
}

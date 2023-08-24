
package com.poly;

import java.util.Scanner;


public abstract class NhanVien {
    protected String ma;
    protected String hoTen;
    protected String phongBan;
    protected double luongCoBan;

    public NhanVien() {
    }
    

    public NhanVien(String ma, String hoTen, String phongBan, double luongCoBan) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.luongCoBan = luongCoBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    abstract double getLuong();

    
   public int compareTo(NhanVien sc){
        return this.hoTen.compareTo(sc.hoTen);
    }

    void nhapDanhSachNhanVien() {
    }
    public void xuat(){
        
    }

    void nhapDanhSachNhanVien(Scanner sc) {
        
    }

   
}



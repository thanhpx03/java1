 
package com.ploy;

import java.util.Scanner;


public class SinhVien {
    private  String maSv;
    private String hoTen;
    private String chuyenNganh;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã bạn là  : ");
        this.maSv=sc.nextLine();
        System.out.println("nhập tên bạn là : ");
        this.hoTen=sc.nextLine();
        System.out.println("chuyên ngành là :");
        this.chuyenNganh=sc.nextLine();
                
    }
    public void xuât(){
        System.out.printf("%-10s    %-10s     %-10s \n"
                ,getMaSv(),getHoTen(),getChuyenNganh());
    }
}

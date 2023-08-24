package com.poly;

import java.util.Scanner;

public class Bai3 {// lớp (gói)
// thuộc tính (trường)

    private String tenSp;
    private double GiaDon;
    private double GiamGia;

    double getThueNhapKhau() {
        return GiaDon * 0.1;
    }

    public Bai3() {
    }
// get and setting

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGiaDon() {
        return GiaDon;
    }

    public void setGiaDon(double GiaDon) {
        this.GiaDon = GiaDon;
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }
// hàm (CONSTRUCTOR)

    public Bai3(String tenSp, double GiaDon, double GiamGia) {
        this.tenSp = tenSp;
        this.GiaDon = GiaDon;
        this.GiamGia = GiamGia;
    }

    public Bai3(String tenSp, double GiaDon) {
        this.tenSp = tenSp;
        this.GiaDon = GiaDon;
        this.GiamGia = 0;
    }
// phương thức

    void xuat() {
        System.out.println("ten sp " + tenSp + "- don gia " + GiaDon + "-"+
                " giam gia" + GiamGia + "- thue" + getThueNhapKhau());
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten san pham ");
        tenSp = sc.nextLine();

        System.out.print("nhap don gia : ");
        GiaDon = sc.nextDouble();
        System.out.print("nhap giam gia la : ");
        GiamGia = sc.nextDouble();
    }

}

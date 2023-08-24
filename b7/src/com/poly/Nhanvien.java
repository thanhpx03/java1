/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
 public abstract class NhanVien {

    Scanner sc = new Scanner(System.in);
    public String maNV, tenNV;
    protected double luongCB;

     public NhanVien() {

    }

     public NhanVien(String maSV, String tenNV, double luongCB) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;

    }

    public void nhapNV() {
        System.out.println("Nhập Tông Tin Sinh Viên:");
        System.out.print("\t Mã NV: ");
        maNV = sc.nextLine();
        System.out.print("\t Tên NV: ");
        tenNV = sc.nextLine();
        System.out.print("\t Lương CB: ");
        luongCB = sc.nextDouble();
    }

    abstract public double tinhLuong();

    abstract public void hienNV();

}

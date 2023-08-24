/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.util.Scanner;

class Account {

    String manv;
    String hoten;
    double luong, doanhSo, hoaHong, trachNhiem;
    Scanner sc = new Scanner(System.in);
    Scanner line = new Scanner(System.in);

    // Hàm nhập thông tin đối tượng
    public void setDataHC() {
        System.out.println("Nhap ma nhan vien: ");
        manv = line.nextLine();
        System.out.println("Nhap ho ten nhan vien: ");
        hoten = line.nextLine();
        System.out.println("Nhap luong nhan vien: ");
        luong = sc.nextDouble();
        System.out.println("\t =================");
    }

    public void setDataTT() {
        System.out.println("Nhap ma nhan vien: ");
        manv = line.nextLine();
        System.out.println("Nhap ho ten nhan vien: ");
        hoten = line.nextLine();
        System.out.println("Nhap luong nhan vien: ");
        luong = sc.nextDouble();
        System.out.println("Nhap doanh so ban hang: ");
        doanhSo = sc.nextDouble();
        System.out.println("Nhap ti le hoa hong: ");
        hoaHong = sc.nextDouble();
        System.out.println("\t =================");
    }

    // Hàm in thông tin đối tượng
    public void showDataHC() {
        System.out.println("Ma nhan vien: " + manv);
        System.out.println("Ten nhan vien : " + hoten);
        System.out.println("Luong nhan vien: " + luong);
        System.out.println("\t =================");
    }

    public void showDataTT() {
        System.out.println("Ma nhan vien: " + manv);
        System.out.println("Ten nhan vien : " + hoten);
        System.out.println("Luong nhan vien: " + luong);
        System.out.println("Doanh so ban hang: " + doanhSo);
        System.out.println("Ti le hoa hong: " + hoaHong);
        System.out.println("\t =================");
    }

}

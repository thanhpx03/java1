
package com.poly;

import java.util.Scanner;


public class ThongTinSinhVien {
    Scanner sc= new Scanner(System.in);
    //khai bao thuoc tinh
    String maSV, hoTen;
    double diem;

    public ThongTinSinhVien() {
    }

    public ThongTinSinhVien(String maSV, String hoTen, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public void nhap(){
        System.out.println("nhap thong tinn sinh vien ");
        System.out.print("Ma sinh vien ");
        maSV=sc.nextLine();
        System.out.print("ho ten la : ");
        hoTen = sc.nextLine();
        System.out.print("diem la : ");
        diem= sc.nextDouble();
                
    }
    public void xuat(){
        System.out.printf("%-10s  %-30s  %-5.1f \n",maSV, hoTen, diem);
    }
}

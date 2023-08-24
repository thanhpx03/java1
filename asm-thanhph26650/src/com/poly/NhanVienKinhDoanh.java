
package com.poly;

import java.util.Scanner;

 public class NhanVienKinhDoanh extends NhanVien {

    private double luongKinhDoanh;

    public NhanVienKinhDoanh() {
    }

    public NhanVienKinhDoanh(String ma, String hoTen, double luongCoBan, double luongKinhDoanh) {
        super(ma, hoTen, "Kinh doanh", luongCoBan);
        this.luongKinhDoanh = luongKinhDoanh;
    }

    public double getLuongKinhDoanh() {
        return luongKinhDoanh;
    }

    public void setLuongKinhDoanh(double luongKinhDoanh) {
        this.luongKinhDoanh = luongKinhDoanh;
    }

   
    @Override
    double getLuong() {
        return luongCoBan + this.luongKinhDoanh;
    }

    @Override
  public  void nhapDanhSachNhanVien() {
     Scanner sc = new Scanner(System.in);
         System.out.print("Nhập mã: ");
        this.ma = sc.nextLine();
        System.out.print("Nhập họ và tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        this.luongCoBan = sc.nextDouble();
        System.out.print("Nhập số ngày công: ");
        this.luongKinhDoanh = sc.nextDouble();
    }

    public NhanVienKinhDoanh(String ma, String hoTen, String phongBan, double luongCoBan) {
        super(ma, hoTen, phongBan, luongCoBan);
    }
  
    @Override
    public void xuat(){
     
 }
 


}

    


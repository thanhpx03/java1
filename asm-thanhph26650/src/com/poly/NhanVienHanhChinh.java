
package com.poly;

import java.util.Scanner;



    public class NhanVienHanhChinh extends NhanVien {

    private double ngayCong;
    public NhanVienHanhChinh(String ma, String hoTen, double luongCoBan, double ngayCong) {
        super(ma, hoTen, "Hành chính", luongCoBan);
        this.ngayCong = ngayCong;
    }
    public NhanVienHanhChinh() {
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

  
    @Override
    public double getLuong() {
        return luongCoBan * this.ngayCong;
    }

    @Override
 public   void nhapDanhSachNhanVien() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhập mã: ");
        this.ma = sc.nextLine();
        System.out.print("Nhập họ và tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        this.luongCoBan= sc.nextDouble();
        System.out.print("Nhập số ngày công: ");
        this.ngayCong = sc.nextDouble();
     
 }

    
 
 public void xuat(){
     
 }
    }
    
 
       
    
        
        
    

   
     
    

    
   




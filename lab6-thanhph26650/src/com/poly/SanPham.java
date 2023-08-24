
package com.poly;

import java.util.Scanner;


public class SanPham {
   private String tenSp;
    double donGia;
   private String hang;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    
 

    
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("SanPham nhap là ");
        tenSp=sc.nextLine();
        System.out.println(" giá SanPham là");
        donGia=sc.nextDouble();
        
        sc.nextLine();
        System.out.println("hãng là ");
        hang=sc.nextLine();
        
        
    }
    
    public void xuat() {
        System.out.println("----------------------");
        
            System.out.printf("%20s | %.2f \n  | %20s   " , tenSp,donGia,hang);

                
    }
    
    
}
    

    
    
    
    
    
    
    


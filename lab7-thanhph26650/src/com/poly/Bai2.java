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
public abstract class Bai2 {
  protected String hoTen;
  protected String nganh;

    public Bai2() {
    }

    public Bai2(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public void nhap(){
        Scanner sc =new Scanner (System.in);
        System.out.println("ten là ");
        hoTen=sc.nextLine();
        System.out.println("ngành là ");
        nganh=sc.nextLine();
    }
    public void xuat(){
        System.out.printf("họ tên %s      nganh %s   diem %f  "
                + "  học lực %s \n",hoTen, nganh, diem(),hocluc());
    }
    public abstract double diem();
    public String hocluc() {
    double diem = diem();
    String strhocluc = "";
    if (diem > 9){
    strhocluc = "xuat sắc";
    
} else if(diem>=8){
    strhocluc = "gioi";
    
}else if(diem>=7.5){
    strhocluc="khá";
    
}else if(diem>=6.5){
    strhocluc="trung binh";
    
}else if(diem>=5){
    strhocluc = "";

    }
        return strhocluc;
}
}

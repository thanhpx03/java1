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
public class It  extends Bai2 {
    private double diemjv
            ;
    private double diemcss;
    private double diemhtml;

    public It() {
    }

    public It(double diemjv, double diemcss, double diemhtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemjv = diemjv;
        this.diemcss = diemcss;
        this.diemhtml = diemhtml;
    }

    
    
    

    

   

    public double getDiemjv() {
        return diemjv;
    }

    public void setDiemjv(double diemjv) {
        this.diemjv = diemjv;
    }

    public double getDiemcss() {
        return diemcss;
    }

    public void setDiemcss(double diemcss) {
        this.diemcss = diemcss;
    }

    public double getDiemhtml() {
        return diemhtml;
    }

    public void setDiemhtml(double diemhtml) {
        this.diemhtml = diemhtml;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("diem java là ");
        diemjv = sc.nextDouble();
        System.out.println("ddiem css là ");
        diemcss=sc.nextDouble();
        System.out.println("điểm html  là ");
        diemhtml= sc.nextDouble();
    }
    

    @Override
    public double diem() {
    return (2*getDiemjv()+getDiemcss()+getDiemhtml())/4;
    
    }
    
    public static void main(String[] args) {
        It svit=new It();
        
        svit.nhap();
        svit.xuat();
    }
}

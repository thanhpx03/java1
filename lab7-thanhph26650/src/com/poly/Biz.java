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
public class Biz extends Bai2{
    private double diemMK;
    private double diemSl;
    

    public Biz() {
    }

   

   

    

    public Biz(double diemMK, double diemSl, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMK = diemMK;
        this.diemSl = diemSl;
    }

    

   

   

    public double getDiemMK() {
        return diemMK;
    }

    public void setDiemMK(double diemMK) {
        this.diemMK = diemMK;
    }

    public double getDiemSl() {
        return diemSl;
    }

    public void setDiemSl(double diemSl) {
        this.diemSl = diemSl;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("diem MK là ");
        diemMK= sc.nextDouble();
        System.out.println("diem Sale là ");
        diemSl=sc.nextDouble();
        
    }
   

    @Override
    public double diem() {
        return (2*getDiemMK()+getDiemSl())/3;
    }
    public static void main(String[] args) {
        Biz svB= new Biz();
        svB.nhap();
        svB.xuat();
    }
    
}

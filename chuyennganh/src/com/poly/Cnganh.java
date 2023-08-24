/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.util.Scanner;


public class Cnganh {
    Scanner sc=new Scanner(System.in);
    private String Cnganh;
    private int GV;
    private int ma;

    public Cnganh() {
    }

    public Cnganh(String Cnganh, int GV, int ma) {
        this.Cnganh = Cnganh;
        this.GV = GV;
        this.ma = ma;
    }

    public String getCnganh() {
        return Cnganh;
    }

    public void setCnganh(String Cnganh) {
        this.Cnganh = Cnganh;
    }

    public int getGV() {
        return GV;
    }

    public void setGV(int GV) {
        this.GV = GV;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    public void nhap(){
        System.out.println("tên là ");
        this.Cnganh=sc.nextLine();
        System.out.println("số GV chuyên nganh  là : ");
        this.GV=sc.nextInt();
        System.out.println("mã chuyen ngành là ");
        this.ma=sc.nextInt();
                
    }
    public void xuat(){
        System.out.printf("%-10s     %-10d      %-10d \n" ,getCnganh(),getGV(),getMa());
        System.out.println("");
        
    }
}

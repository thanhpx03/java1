/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

/**
 *
 * @author Admin
 */
public class Nhanvien {
    public String ma;
    public String hoTen;
    public double luongcoban;
    public String phongban;

    public Nhanvien() {
    }

    public Nhanvien(String ma, String hoTen, double luongcoban, String phongban) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luongcoban = luongcoban;
        this.phongban = phongban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }
    
     public int compareTo(Nhanvien sc){
        return this.hoTen.compareTo(sc.hoTen);
    }

    void xuat() {
       
    }

}
   
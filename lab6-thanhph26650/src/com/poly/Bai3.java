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
public class Bai3 {
    private String hoTen, email, sdt ,cnmd;

    public Bai3(String hoTen, String email, String sdt, String cnmd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cnmd = cnmd;
    }

    public Bai3() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCnmd() {
        return cnmd;
    }

    public void setCnmd(String cnmd) {
        this.cnmd = cnmd;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        do{
                 System.out.println("nhap ten là ");
        hoTen=sc.nextLine();
        
        if(hoTen == null||hoTen.equals("")){
            System.out.println("hợ tên k hợp lệ");
        }else
            break;
                }while(true);
      
       
        System.out.println("email là ");
        email=sc.nextLine();
        System.out.println("sdt là ");
        sdt=sc.nextLine();
        System.out.println("cnmd là ");
        cnmd=sc.nextLine();
    }
    public void xuat(){
        System.out.printf("ho ten: %s- email: %s -sdt: %s- cnmd: %s",hoTen,email,sdt ,cnmd);
    }
}

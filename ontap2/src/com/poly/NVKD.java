/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;


public class NVKD extends Nhanvien{
    private double luongkd;

    public NVKD() {
    }

   public NVKD(String ma, String hoTen, double luongcoban, double luongkd) {
        super(ma, hoTen, luongcoban, "kinh doanh");
         this.luongkd = luongkd;
    }
  

    public double getLuongkd() {
        return luongkd;
    }

    public void setLuongkd(double luongkd) {
        this.luongkd = luongkd;
    }

  
    
    @Override
    public double getLuongcoban(){
        return luongkd+luongcoban;
    }
}

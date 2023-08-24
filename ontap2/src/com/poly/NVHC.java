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
public class NVHC extends Nhanvien{
    private double songay;

    public NVHC() {
    }

    public NVHC(double songay) {
        this.songay = songay;
    }
   public NVHC(String ma, String hoTen, double luongcoban, double songay) {
       super(ma, hoTen, luongcoban, "hành chính");
        this.songay = songay;
    }
    public double getSongay() {
        return songay;
    }

    public void setSongay(double songay) {
        this.songay = songay;
    }

  
    
    

   
    
    @Override
    public double getLuongcoban() {
            return songay*luongcoban;
            }
    
}

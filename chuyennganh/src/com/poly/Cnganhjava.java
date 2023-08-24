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
public class Cnganhjava extends Cnganh{
    private  int soluong;

    public Cnganhjava() {
    }

    public Cnganhjava(int soluong) {
        this.soluong = soluong;
    }

    public Cnganhjava(int soluong, String Cnganh, int GV, int ma) {
        super(Cnganh, GV, ma);
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
   public void nhap(){
       
       this.soluong=sc.nextInt();
       
   }
}

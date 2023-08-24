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
public class NVKD {
      Scanner sc= new Scanner(System.in);
    public double luongKD;
    public NVKD(){
    
    }   
    public NVKD(String maNV, String tenNV, double luongCB, double luongKD){
        super(maNV, tenNV, luongCB);
        this.luongKD= luongKD;
        
    }
    @Override
    public void nhapNV(){
    super.nhapNV();
        System.out.print("\t Luong KD: ");
        luongKD= sc.nextDouble();
            
    }
    @Override
    public double tinhLuong(){
    return luongKD+luongCB;
    
    }
    @Override
    public void hienNV(){
        System.out.printf("%-5s %-25s %-10.1f %-6s %-10f %-10.1f\n", maNV,tenNV,luongCB,luongKD,"-",tinhLuong());
        
    }
}

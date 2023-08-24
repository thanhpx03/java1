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
public class NVHC extends NhanVien{
    Scanner sc= new Scanner(System.in);
    public int soNC;
    public NVHC(){
    
    }   
    public NVHC(String maNV, String tenNV, double luongCB, int soNC){
        super(maNV, tenNV, luongCB);
        this.soNC= soNC;
        
    }
    @Override
    public void nhapNV(){
    super.nhapNV();
        System.out.print("\t Số NC: ");
        soNC= sc.nextInt();
            
    }
    @Override
    public double tinhLuong(){
    return soNC*luongCB;
    
    }
    @Override
    public void hienNV(){
        System.out.printf("%-5s %-25s %-10.1f %-6 %-10s %-10.1f\n", maNV,tenNV,luongCB,soNC,"-",tinhLuong());
        
    }
}

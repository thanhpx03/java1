/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QuanLy {
    Scanner sc= new Scanner(System.in);
    ArrayList<NhanVien>dsNV=new ArrayList<>();
    
   public void nhapDSNV(){
       System.out.print("Chon loai nhan vien[1.NVHC-2NVKD]: ");
       int loaiNV=sc.nextInt();
       switch(loaiNV){
           case 1:
               NVHC hc =new NVHC();
               hc.nhapNV();
               dsNV.add(hc);
               break;
           case 2:
               NVKD kd = new NVKD();
               kd.nhapNV();
               dsNV.add(kd);
               break;
               default:
               System.out.println("Chon sai roi");
               
               
       }
   }
   public void hienDSNV(){
       System.out.println("---------DANH SACH NHAN VIEN---------");
       System.out.printf("%s %s %s %s %s %s\n","Mã NV","Tên NV","LươngCB","Số NC","Lương KD","Thực hình");
       for(NhanVien nv: dsNV){
       nv.hienNV();
       }
   }
}


package com.poly;

import java.util.ArrayList;


public class main2 {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        for(int i=0 ; i<5;i++){
            SanPham sp=new SanPham();
            sp.nhap();
            list.add(sp);
        }
       for (SanPham x : list){
           if(x.getTenSp().equalsIgnoreCase("NOKIA")){
               x.xuat();
               System.out.println("");
           }
       }
     
    }
}

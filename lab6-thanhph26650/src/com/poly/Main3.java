

package com.poly;

import java.util.ArrayList;
import java.util.Scanner;


public class Main3 {
    
        
    
    private ArrayList<Bai3> list = new ArrayList<>();
    
    public void nhap(){
        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            Bai3 sv= new Bai3();
            sv.nhap();
            list.add(sv);
            
        }
    }
    public void xuat(){
        System.out.println("com.poly.Sinhvien.xuat()");
        for(Bai3 x:list){
            x.xuat();
        }
    }
}

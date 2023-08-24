
package com.poly;

import java.util.Scanner;


public class Vidu2 {
    public static void main(String[] args) {
        
    
    Scanner sc=new  Scanner (System.in);
    
    String ten;
        System.out.print("tên bạn là ");
     ten = sc.nextLine();
     String a[]= ten.split(" ");
        System.out.println ("tên : " + a[a.length-1]);
    
    
}
}

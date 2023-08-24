
package com.poly;

import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.printf("nhập tên bạn là ");
        String ten, ho , tendiem;
        ten=sc.nextLine();
        ho=ten.substring(0,ten.indexOf(" ")).toUpperCase();
        tendiem=ten.substring(ten.indexOf(" "),ten.lastIndexOf(" "));
        String ten1[] = ten.split(" ");
        System.out.println(ho);
        System.out.println(ten1[ten1.length-1].toUpperCase());
        System.out.println(tendiem);       
    }
}

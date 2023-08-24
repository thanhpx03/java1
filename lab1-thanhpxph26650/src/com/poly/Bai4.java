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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("nhap a : ");
        int a = sc.nextInt();
        
        System.out.print("nhap b : ");
        int b = sc.nextInt();
         System.out.print("nhap c : ");
        int c = sc.nextInt();
        double delta=b*b-a*4*c;
        double candelta=(double) Math.sqrt(delta);
         System.out.println(+delta);
         System.out.println(+candelta);
}
}
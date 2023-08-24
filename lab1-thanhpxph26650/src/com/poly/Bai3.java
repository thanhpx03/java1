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
public class Bai3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("nhap canh : ");
        double a = sc.nextDouble();
        double c = a*a*a;
         System.out.println(+c);
}
}

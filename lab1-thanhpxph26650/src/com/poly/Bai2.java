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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("nhap chieu dai : ");
        double a = sc.nextDouble();
        System.out.print("nhap chiieu rong : ");
        double b = sc.nextDouble();
        double chuvi = (a+b)*2;
        double dientich = a*b;
        double canhnhonhat = Math.min(a,b);
        System.out.println(chuvi+"-"+dientich+"-"+canhnhonhat);
        
    }
}

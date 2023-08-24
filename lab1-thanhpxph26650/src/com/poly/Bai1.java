/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
    import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("nhap ho ten : ");
        String hoTen = sc.nextLine();
        System.out.print("nhap diem trung binh : ");
        double diem = sc.nextDouble();
         System.out.println(hoTen+"-"+diem);
    }
}

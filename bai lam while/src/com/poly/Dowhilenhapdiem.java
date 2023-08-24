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
public class Dowhilenhapdiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int i;
        do{
            System.out.println("hay nhap i la ");
         i = sc.nextInt();
        
            
        }while(i>10||i<0);
                
    System.out.println(i);
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

/**
 *
 * @author Admin
 */
public class Bai3 {
    static public String x(String a){
        String[] ars=a.split("");
       StringBuilder name = new StringBuilder();
        for(int i=0;i < ars.length;i++){
            String ten =ars[i];
            if(!ten.equals("")){
               String rema = ten.substring(1, ten.length());  
            String ch=ten.substring(0,1).toUpperCase();
            ten = ch + rema;
            name.append(ten).append("");
            }
        }
       

    return name.toString().trim();
    }

    public static void main(String[] args) {
       
        System.out.println(x("nguyen văn anh"));
    }
}

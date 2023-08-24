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
public class Vidu3 {
    public static String getchuoi (String ...arg ){
        String s = "";
        for (String x: arg) {
            s+=x;
        }
        
    
        return s;
    }
            public static void main (String[] args){
                System.out.println("-> " + getchuoi("hi,chào bạn"));
            }
    
}

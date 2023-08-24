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
public class Vidu2 {
    public static int sum (int ...arg){
        int s=0;
        for (int x : arg){
            s+=x;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("kết quả " + sum());
    }
}

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
public class Mani4 {
    public  static void menu (){
//        thêm static là phương thức tĩnh

    }
    public static void main(String[] args) {
        Vidu4 vd = new Vidu4();
        Vidu4 vd1 = new Vidu4();
        System.out.println(vd.x);
        System.out.println(Vidu4.x);
        vd.x+=1;
        System.out.println(vd.x);
//        dùng chung 1 class
// main là phương thức tĩnh 
    }
}

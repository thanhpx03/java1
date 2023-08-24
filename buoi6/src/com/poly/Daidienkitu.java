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
public class Daidienkitu {
    public static void main(String[] args) {
        /*
        [ABC] chỉ nhập kí tự a b, c
        nhập a đến h 
        [A-H]
        k được nhập kí tự a,b,c
        [^abc]
        \s chỉ kí tự (\r\n\t\f)
        \\ \. được nhập dấu chấm
        \w -> (0-9a-zA-Z)
        
        */
        
        
        /*
        [abc] {2,6}
        nhập : abcccc (ít nhất 2 lần ,nhiều là 6)
        {2,}
        nhập : abccccccc{ít nhát 2l và giới hạn k có)
        {2}
        nhập : 2l
        {?}
        nhập : k nhập cx dk và lớn nhất 1 l
        
        {*}
        
        
        
        
        */
        
        
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        // kiểm tra số điện thoại : 10  ksy tự số , bắt đầu từ 0
        String reg ="^0[0-9]{9}";
        // có thẻ {^0\\d{9}}
        if(input.matches(reg))
            System.out.println("đữ lieu hợp lệ");
        else
            System.out.println("lỗi : không hợp lệ");
    }
          
}

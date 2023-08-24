package com.poly;

import java.util.Scanner;

public class Bangcuuchuong7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("hsy nhap n la ");
        int n = sc.nextInt();
        int i = 1;
        int s = 0;
        while (i <= n) {
            s += i;
            i++;
        }
        System.out.println(s);
    }

}

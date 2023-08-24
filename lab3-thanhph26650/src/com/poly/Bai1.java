package com.poly;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("hay nhap n la ");
        int n = sc.nextInt();
        int souoc = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                souoc++;
            }
        }
        if (souoc == 2) {
            System.out.printf(" %d là số nguyên tố", n);

        } else {
            System.out.printf(" %d k là số nguyên tố", n);

        }

    }
}

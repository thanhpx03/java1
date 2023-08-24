package com.poly;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Nhập phần tử của  mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]=", i);
            a[i] = sc.nextInt();

        }
      
        for (int i = 0; i < n; i++) {
             int souoc = 0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    souoc++;
                }
            }

            if (souoc == 2||a[i]==1) {

                System.out.println(a[i]);

            }

        }

    }

}


package com.poly;

import java.util.Scanner;

public class Bai3 {

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
        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%3d", a[i]);
        }
        System.out.println("");
        System.out.print("Sắp xếp mảng: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
            System.out.printf("%3d", a[i]);
        }
        System.out.println("");
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.printf("Phần tử nhỏ nhất là: %d", min);
        System.out.println("");
        float tong = 0;
        int dem = 0;
        float TB = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                dem++;
            }
            TB = tong / dem;
        }
        System.out.printf("Trung bình cộng các phần tử chia hết cho 3 là: %.1f", TB);
        System.out.println("");
    }}
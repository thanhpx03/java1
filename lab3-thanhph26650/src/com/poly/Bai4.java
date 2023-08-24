package com.poly;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien = ");
        int n = sc.nextInt();
        String[] A = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("- Nhap thong tin sinh vien thu " + i + " : ");
            System.out.print("Ho ten sv: ");
            sc.nextLine();
            A[i] = sc.nextLine();

        }
        int B[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("- Nhap thong tin sinh vien thu " + i + " : ");
            System.out.print("Diem : ");
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (B[i] < 5) {
                System.out.println("Ten :"+ A[i] +"\n Diem:"+B[i]+"\nHoc Luc: yeu");
            }
            if (5 <= B[i] && B[i] < 6.5) {

                System.out.println("Ten :"+ A[i]+"\n Diem:"+B[i] +"\nHoc Luc: trung binh");
            }
            if (6.5 <= B[i] && B[i] < 7.5) {

                System.out.println("Ten : "+A[i] +"\n Diem: " +B[i] + "\nHoc Luc: kha");
            }
            if (7.5 <= B[i] && B[i] < 9) {

                System.out.println("Ten : "+ A[i] +"\n Diem: "+B[i] +"\nHoc Luc: gioi");
            }
            if (B[i] >= 9) {

                System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+ "\nHoc Luc: xuat sac");
            }
        }
    }

}

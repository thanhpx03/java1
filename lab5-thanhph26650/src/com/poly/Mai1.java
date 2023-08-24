package com.poly;

import java.util.Scanner;

public class Mai1 {

    public static void main(String[] args) {
        Bai1 a = new Bai1();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("--------menu------- ");
            System.out.println("1 nhap danh sach");
            System.out.println("2 hien thị ");
            System.out.println("3 tính tổng ");
            System.out.println("0 thoát");
            System.out.printf("chọn:");

            choice = sc.nextInt();
            if (choice != 0) {
                switch (choice) {

                    case 0:
                        System.exit(0);
                    case 1:
                        a.nhap();
                        break;
                    case 2:
                        a.xuat();
                        break;
                    case 3:
                        a.tinhtong();
                        break;
                    default:
                        System.out.println("bạn chọn sai rui xin nhập lại ");
                }
            }

        } while (true);

    }
}

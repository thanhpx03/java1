package com.poly;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Bai2 a = new Bai2();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("--------menu------- ");
            System.out.println("1 nhap danh sach");
            System.out.println("2 hien thị ");
            System.out.println("3 xuat hien thị ngẫu nhiên ");
            System.out.println("4 săp xep danh sách ");
            System.out.println("5 tìm kiếm xóa");
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
                        a.xuatngaunhien();
                        break;
                    case 4:
                        a.sapxep();
                        break;
                    case 5:
                        a.timvaxoa();
                        break;
                    default:
                        System.out.println("bạn chọn sai rui xin nhập lại ");
                }
            }

        } while (true);

    }
}

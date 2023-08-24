package com.poly;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Bai3 sp = new Bai3();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("--------menu------- ");
            System.out.println("1 nhap danh sach");
            System.out.println("2 hien thị ");
            System.out.println("3 sap xếp danh sách ");
            System.out.println("4 tim và xoa ");
            System.out.println("5 tính trung bình");
            System.out.println("0 thoát");
            System.out.printf("chọn:");

            choice = sc.nextInt();
            if (choice != 0) {
                switch (choice) {

                    case 0:
                        System.exit(0);
                    case 1:
                        sp.nhap();
                        break;
                    case 2:
                        sp.xuat();
                        break;

                    case 3:
                     sp.sapxeptheogia();
                        break;
                    case 4:
                        sp.timkiemvaxoa();
                                
                        break;
                    case 5:
                        sp.tinhtrungbinh();
                        break;
                    default:
                        System.out.println("bạn chọn sai rui xin nhập lại ");
                }
            }
        }while(true);
        }
}
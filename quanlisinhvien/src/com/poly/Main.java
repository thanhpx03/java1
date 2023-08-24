package com.poly;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("--------- QUẢN LÝ SINH VIÊN ---------");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất danh sách sinh viên");
        System.out.println("3. Tìm sinh viên theo mã");
        System.out.println("4. Sửa sinh viên theo mã");
        System.out.println("5. Xóa sinh viên theo mã");
        System.out.println("6. sap xep  sinh viên theo mã");
        System.out.println("7. Thoát");
        System.out.println("-------------------------------------");
        System.out.print("Mời chọn chức năng [1-6]: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanlisinhvien ql = new Quanlisinhvien();
        int chon;
        do {
            menu();
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ql.nhap1();
                    break;
                case 2:
                    ql.xuat1();
                    break;
                case 3:System.out.println("nhap ma can tim");
                String ma=new Scanner(System.in).nextLine();
                ql.timTheoma(ma);
                break;
                case 6 :
                    ql.sapxeptheodiem();
                    
                    
                    System.out.println("sap xep xong rui ");
                    break;
                default:
                    System.out.println("Bạn chọn sai chức năng");
            }
        } while (chon != 8);
    }
}

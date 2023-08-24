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
public class Main {
    public static void menu() {
System.out.println("\nMời chọn chức năng: ");
System.out.println("1. Thêm nhân viên");
System.out.println("2. Hiển thị danh sách nhân viên");
System.out.println("0. Thoát chương trình");
System.out.println("--------------------------------");
System.out.print("Hãy chọn chức năng: ");
}

public static void main(String[] args) {
QuanLy qlNV = new QuanLy();
Scanner sc = new Scanner(System.in);
do {
menu();
int fn = sc.nextInt();
switch (fn) {
case 1:
qlNV.nhapDSNV();
break;
case 2:
qlNV.hienDSNV();
break;
default:
System.out.println("Nhập sai chức năng, mời nhập lại");
}
} while (true);
}

}

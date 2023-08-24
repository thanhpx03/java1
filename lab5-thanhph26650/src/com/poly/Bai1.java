package com.poly;

import java.util.Scanner;
import java.util.ArrayList;

public class Bai1 {

    private ArrayList<Double> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    double so;

    public void nhap() {
        System.out.println("danh sách so thực ");
        int yes = 1;
        do {
            System.out.printf("nhap so là : ");
            double so = sc.nextDouble();

            list.add(so);
            System.out.println("muốn nhập tiếp (1) , (0) thoát");
            yes = sc.nextInt();
        } while (yes == 1);
    }

    public void xuat() {
        System.out.println("----------------------");
        for (Double item : list) {
            System.out.print("    " + item);

        }
        System.out.println();
    }

    public void tinhtong() {
        double so = 0;
        for (Double item : list) {
            so += item;
        }
        System.out.println("tong " + so);
    }

}

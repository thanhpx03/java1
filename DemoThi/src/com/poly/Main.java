package com.poly;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV qlsv = new QLSV();
        int choice;
        do {            
            System.out.println("==============Menu================");
            System.out.println("1. Nhap sinh vien");
            System.out.println("2. Xuat sinh vien");
            System.out.println("3. Tim sinh vien theo ma");
            System.out.println("4. Sap xep ");
            System.out.println("5. Ke thua");
            System.out.println("0. Thoat");
            System.out.println("==================================");
            System.out.print("Moi ban chon: ");
            choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    qlsv.add();
                    break;
                case 2: 
                    qlsv.show();
                    break;
                case 3: 
                    qlsv.search();
                    break;
                case 4:
                    qlsv.sapXep();
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Xin chao va hen gap lai!");
                    break;
                default:
                    System.out.println("Ban vua chon sai chuc nang!");
            }
        } while (choice!=0);
    }
}

package com.poly;

import java.util.Scanner;

public class bai2 {
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("===== MENU =====");
        System.out.println("1. Bài 1");
        System.out.println("2. Bài 2");
        System.out.println("3. Bài 3");
        System.out.println("4. Bài 4");
        System.out.println("================");
        System.out.println("Mời chọn chức năng: ");
    }
    public static void bai1(){
        System.out.print("nhap a ");
        double a=sc.nextDouble();
        System.out.print("nhap b ");
        double b=sc.nextDouble();
        if(a==0){
            if (b==0){
                
            
            System.out.println("phuong trinh vo so nghie)");
            }
        else {
            System.out.println("phuong trinh vo nghiem");
        }
        }
        else {
                double x= -b/a;
                System.out.println("phuong trinh co nghiem la "+x);
                        
                }
    }
    public static void bai2(){
        System.out.print("nhap a ");
        double a=sc.nextDouble();
        System.out.print("nhap b ");
        double b=sc.nextDouble();
        System.out.println("nhap c ");
        double c= sc.nextDouble();
        if (a==0){
            System.out.println(" pt co nghiem la " +(c/b));
        }else {
            double delta=b*b-4*a*c;
            if (delta<0){
                System.out.println("pt vo nghiem");
            }else if (delta==0){
                double x=-b/2*a;
                System.out.println("pt co nghiem kep "+x);
            }else {
                double x1=(-b - Math.sqrt(delta)) /2*a;
                double x2=(-b + Math.sqrt(delta)) /2*a;
                System.out.println("pt co nghiem");
                System.out.println("x1= "+x1);
                System.out.println("x2= "+x2);
            }
        }
    }
    public static void bai3() {
        float sodien, tiendien;
            System.out.print("nhap so tien dien ");
            sodien=sc.nextFloat();
            if(sodien<=50){
                tiendien=sodien*1000;
                
            }
            else{
                tiendien=50*1000 + (sodien-50)*1200;
            }
            System.out.println("tien dien :"+tiendien);
        
    } 
    public static void bai4() {
        System.out.println("nhap thang : ");
        int thang=sc.nextInt();
        System.out.println("nhap nam : ");
        int nam=sc.nextInt();
        
        switch(thang){
            case 1: case 3: case 5: case 7: case 8:
            case 10: case 12:
                System.out.printf("thang %d nam  %d co 31 ngay",thang, nam );
                break;
            case 4: case 6 : case 9 : case 11 :
                System.out.printf("thang %d nam %d co 30 ngay", thang ,nam);
                break;
            case 2:
                if(nam % 4 == 0 && nam % 100 != 0){
                    System.out.printf("thang %d nam %d co 29 ngay\n", thang, nam);
                }else{
                    System.out.printf("thang %d nam %d co 28 ngay\n", thang , nam);
                }
                break;
                default:
                System.out.println("nhap sai, nhap lai!");
        }
    }
    public static void main(String[] args) {
        menu();
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3: bai3();
                break;
            case 4:bai4();
              break;
            default:
                System.out.println("Sai chức năng");
        }
    }
}

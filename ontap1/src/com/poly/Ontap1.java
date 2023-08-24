package com.poly;
import static java.lang.System.exit;
import java.util.*;


public class Ontap1 {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner line = new Scanner(System.in);
    public static Account hc[] = new Account[100];
    public static Account tt[] = new Account[100];
   
    public static int n;

    public static void nv() {
        System.out.println("----- Chon loai nhan vien -----");
        System.out.println("1. Nhan vien hanh chinh");
        System.out.println("2. Nhan vien tiep thi");
       
        System.out.println("Moi chon nhan vien: ");
        try {
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    nvHC();
                    break;
                case 2:
                    nvTT();
                    break;
               
                default:
                    System.out.println("So so! Vui long chon lai !");
                    break;
            }
        } catch (Exception e) {
            System.out.println("So ban nhap khong dung / Thieu du lieu !");
            System.out.println("Loi do: " + e);
        }
    }

    public static void nv2() {
        System.out.println("----- Chon loai nhan vien -----");
        System.out.println("1. Nhan vien hanh chinh");
        System.out.println("2. Nhan vien tiep thi");
       
        System.out.println("Moi chon nhan vien: ");
        try {
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    inHC();
                    break;
                case 2:
                    inTT();
                    break;
               
                default:
                    System.out.println("So so! Vui long chon lai !");
                    break;
            }
        } catch (Exception e) {
            System.out.println("So ban nhap khong dung / Thieu du lieu !");
            System.out.println("Loi do: " + e);
        }
    }

    public static void nvHC() {
        System.out.println("Nhap so luong nhan vien: ");
        try {
            n = sc.nextInt();
            System.out.print("\t =======Nhap thong tin: =======\n");
            for (int i = 0; i < n; i++) {
                hc[i] = new Account();
                hc[i].setDataHC();
            }
        } catch (Exception e) {
            System.out.println("So ban nhap khong dung / Thieu du lieu !");
            System.out.println("Loi do: " + e);
        }
    }

    public static void nvTT() {
        System.out.println("Nhap so luong nhan vien: ");
        try {
            n = sc.nextInt();
            System.out.print("\t =======Nhap thong tin: =======\n");
            for (int i = 0; i < n; i++) {
                tt[i] = new Account();
                tt[i].setDataTT();
            }
        } catch (Exception e) {
            System.out.println("So ban nhap khong dung / Thieu du lieu !");
            System.out.println("Loi do: " + e);
        }
    }

    

    public static void inHC() {
        System.out.println("\t =================");
        for (int i = 0; i < n; i++) {
            hc[i].showDataHC();
        }
    }

    public static void inTT() {
        System.out.println("\t =================");
        for (int i = 0; i < n; i++) {
            tt[i].showDataTT();
        }
    }

   

    public static void timNV() {
        boolean ok = false;
        System.out.println("Nhap ma nhan vien: ");
        String a = line.nextLine();
        System.out.println("\t =================");
        for (int i = 0; i < n; i++) {
            if (hc[i].manv.equalsIgnoreCase(a)) {
                ok = true;
                System.out.println("Nhan Vien Hanh Chinh");
                System.out.println("\t =================");
                hc[i].showDataHC();
            } else if (tt[i].manv.equalsIgnoreCase(a)) {
                ok = true;
                System.out.println("Nhan Vien Tiep Thi");
                System.out.println("\t =================");
                tt[i].showDataTT();
            
            } else {
                ok = false;
            }
        }
        if (ok == false) {
            System.out.println("Khong co ma nay !");
        } else {
            return;
        }
    
        
        
    }

    public static void menu() {
        System.out.println("+--------------------------------------+");
        System.out.println("+------------------MENU----------------+");
        System.out.println("| Y1. Nhap sanh sach nhan vien         |");
        System.out.println("| Y2. Xuat sanh sach nhan vien         |");
        System.out.println("| Y3. Tim nhan vien theo ma            |");
        System.out.println("| Y4. Xoa nhan vien theo ma            |");
        System.out.println("| Y5. Cap nhat nhan vien theo ma       |");
        System.out.println("| Y6. Tim nhan vien theo luong         |");
        System.out.println("| Y7. Sap sep nhan vien theo ho ten    |");
        System.out.println("| Y8. Sap xep nhan vien theo thu nhap  |");
        System.out.println("| Y9. Xuat 5 nhan vien luong cao nhat  |");
        System.out.println("| Y0. Ket thuc chuong trinh            |");
        System.out.println("+--------------------------------------+");
        System.out.println("+--------------------------------------+");
        System.out.println("Chon chuc nang: ");
        try {
            String a = line.nextLine();
            switch (a) {
                case "Y1":
                    nv();
                    break;
                case "Y2":
                    nv2();
                    break;
                case "Y3":
                    timNV();
                    break;
                case "Y0":
                    exit(0);
                    break;
                default:
                    System.out.println("Chon tu Y0 - Y3 thoi @@@");
                    break;
            }
        } catch (Exception e) {
            System.out.println("So ban nhap khong dung / Thieu du lieu !");
            System.out.println("Loi do: " + e);
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
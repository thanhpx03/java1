package com.poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {

    ArrayList<SinhVien> list;
    Scanner sc;

    public QLSV() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void add() {
        String choice;
        
        do {            
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            list.add(sv);
            System.out.println("Nhap 1 de tiep tuc| Khac 1 de ket thuc");
            choice = sc.nextLine();
        } while (choice.equals("1"));
    }

    public void show() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            System.out.println("======Danh sach sinh vien========");
            for (SinhVien item : list) {
                item.inThongTin();
            }
        }
    }

    public void search() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            System.out.print("Nhap ma nhan vien can tim: ");
            String masv = sc.nextLine();
            for (SinhVien item : list) {
                if(masv.equalsIgnoreCase(item.getMaSV())){
                    System.out.println("Nhan vien can tim la: ");
                    item.inThongTin();
                    return;
                }
            }
            System.out.println("Khong tim thay nhan vien co ma: "+ masv);
        }
    }
    public void sapXep(){
        if(list.isEmpty()){
            System.out.println("Danh sach rong!");
        }else{
            Collections.sort(list, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
            
        }
    }
    public void keThua(){
        SinhVienPoly svpl = new SinhVienPoly();
        
    }
}

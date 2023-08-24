

    package com.poly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void khoiTaoNv() {
      NhanVien nv1 = new NhanVienHanhChinh("123ab", "Tran Thành", 300000, 27);
      NhanVien nv2 = new NhanVienKinhDoanh("567abc", "phạm hoa", 3000000, 5000);
      NhanVien nv3 = new NhanVienKinhDoanh("5678abc", "ly thong", 400000, 4000);
        list.add(nv1);
        list.add(nv2);
        list.add(nv3);
    }

    public DanhSachNhanVien() {
        khoiTaoNv();
    }

    public void nhapDanhSachNhanVien() {
        
       
        System.out.print("Nhập mã nhân viên: ");
        String ma =  new Scanner(System.in).nextLine();
        
        System.out.print("Nhập họ tên nhân viên: ");
        
        String hoTen =  new Scanner(System.in).nextLine();
        System.out.print("Nhập lương cơ bản: ");
        double luongCoBan = sc.nextDouble();
        System.out.print("Nhập phòng ban (4. Hành chính, 5. Kinh doanh, 6. Thoát): ");
        String phongBan = new Scanner(System.in).nextLine();
        int type = Integer.parseInt(phongBan);

        switch (type) {
            case 4:{
                System.out.print("Nhập số ngày công: ");
                double ngayCong = sc.nextDouble();
                NhanVien newNhanVien1 = new NhanVienHanhChinh(ma, hoTen,
                        luongCoBan, ngayCong);
                list.add(newNhanVien1);
            }
            break;
            case 5: {
                System.out.print("Nhập lương kinh doanh: ");
                double luongKinhDoanh = sc.nextDouble();
                NhanVien newNhanVien2 = new NhanVienKinhDoanh(ma, hoTen, 
                        luongCoBan, luongKinhDoanh);
                list.add(newNhanVien2);
                
            }
            break;
            
            
        }
    }

    public void hienDanhSachNhanVien() {
        System.out.println("");
        System.out.println("----------Danh sách nhân viên----------");
        System.out.printf("%-10s %-20s %-15s %-15s\n", "Mã NV", "Họ tên",
                "Phòng Ban", "Lương");
       for (NhanVien nv : list){
            System.out.printf("%-10s %-20s %-15s %-15.2f\n", nv.getMa(),
                    nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
        System.out.println("--------------------------------------");
        System.out.println("");
    }

    public void timNhanVienTheoMa(String ma) {
        boolean found = false;
        System.out.printf("%-10s %-20s %-15s %-15s\n", "Mã NV", "Họ tên",
                "Phòng Ban", "Lương");
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                System.out.printf("%-10s %-20s %-15s %-15.2f\n", nv.getMa(),
                        nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
                found = true;
            }
        }

        if (found == false) {
            System.out.println("Không tìm thấy nhân viên có mã  trong danh sach"  
                     );
        }
    }

    public void xoaNhanVienTheoMa(String ma) {
        boolean found = false;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                list.remove(nv);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Không tìm thấy nhân viên có mã " + ma + ""
                    + " cần xóa trong danh sách");
        }
    }
    public void capNhatNV() {

        NhanVien checkNhanVien = null;

        int index = 0;

        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        String ma = new Scanner(System.in).nextLine();

        for (NhanVien nhanvien : list) {
            if (nhanvien.getMa().equalsIgnoreCase(ma)) {
                checkNhanVien = nhanvien;
                index = list.indexOf(nhanvien);
                break;
            }
        }
        if (checkNhanVien != null) {
            System.out.print("Chọn phòng ban [hành chính - kinh doanh]: ");
            String loai = sc.nextLine();
            if (loai.equalsIgnoreCase("hành chính")) {
                NhanVien nv = new NhanVienHanhChinh();
                nv.nhapDanhSachNhanVien(sc);
                nv.setPhongBan(loai);
                list.set(index, nv);
            } else {
                if (loai.equalsIgnoreCase("kinh doanh")) {
                    NhanVien nv = new NhanVienKinhDoanh();
                    nv.nhapDanhSachNhanVien(sc);
                    nv.setPhongBan(loai);
                    list.set(index, nv);
                }
            }
            System.out.println("--------------------------------------");
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không có nhân viên có mã " + " cần cập nhật");
        }
    }
                     
                
            
         
         
    
    public void sapXepTheoTen(){
        Comparator <NhanVien> haizz = new Comparator<NhanVien>(){
      //Sắp xếp danh sách theo theo thứ tự a b c!
        
            @Override
            public int compare(NhanVien sv1, NhanVien sv2) {
                return (sv1.hoTen.compareTo(sv2.hoTen));
                
            }
        };
        Collections.sort(list, haizz);
 
      
    }
    
    public void sapXepTheoThuNhap(){
       Comparator <NhanVien> haizz = new Comparator<NhanVien>(){

           @Override
           public int compare(NhanVien o1, NhanVien o2) {
               int s= 0;
               double tn1 = o1.getLuong(), tn2 = o2.getLuong();
               if (tn1>tn2) s=-1;
               else if(tn1<tn2) s=1;
               return s;
           }
        };
        Collections.sort(list, haizz);
    }
  
    
     public void xuatTop5NhanVien(){
        sapXepTheoThuNhap();
        int t = (list.size()<5)?list.size():5;
        for (int i = 0; i < t; i++) {
            list.get(i).xuat();
        }
    }

}

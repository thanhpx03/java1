package com.poly;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("---------Quản lý nhân viên---------");
        System.out.println("7. Nhập danh sách nhân viên");
        System.out.println("8. Hiện danh sách nhân viên");
        System.out.println("9. Tìm nhân viên theo mã");
        System.out.println("10. Xóa nhân viên theo mã");
        System.out.println("11.cập nhạt thông tin nhân viên theo tên");
        System.out.println("12.sắp xếp nhân viên theo họ tên");
        System.out.println("13. sắp xếp nhân viên theo thu nhập cao  nhất");
        System.out.println("14. 5  nhân viêm theo thu nhập cao  nhất");
        
        System.out.println("-----------------------------------");
        System.out.print("Mời chọn [7-10]: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachNhanVien list = new DanhSachNhanVien();
        do {
            menu();

            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 7: list.nhapDanhSachNhanVien();
                break;
                case 8: list.hienDanhSachNhanVien();
                break;
                case 9: {
                    System.out.print("Nhập mã nhân viên cần tìm: ");
                    String ma = new Scanner(System.in).nextLine();
                    list.timNhanVienTheoMa(ma);
                }
                break;
                case 10: {
                    System.out.print("Nhập mã nhân viên cần xóa: ");
                    String ma = new Scanner(System.in).nextLine();
                    list.xoaNhanVienTheoMa(ma);
                }
                
                break;
                case 11:
                
                    list.capNhatNV();
                    break;
                case 12 :{ System.out.println("sắp xếp theo tên");
                    list.sapXepTheoTen();}
                break;
                case 13 :{
                    System.out.println("đã sắp xếp top nhân viên");
                    list.sapXepTheoThuNhap();
                }
                break;
                case 14 :{
                    System.out.println("đã săp xếp 5 nhân viên");
                    
                    list.xuatTop5NhanVien();
                }
                break;
                
                default :System.out.println("Chọn sai chức năng, chọn lại!");
                break;
            }
        } while (true);
    }
}
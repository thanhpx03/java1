
package com.poly;

import java.util.Scanner;


public class Main {
    
    public static void menu(){
        System.out.println("nhập danh sách nhân viên");
        System.out.println("2. in nhân viên ");
        System.out.println("3.tìm và xuất ra màn hình");
        System.out.println("4 . xóa nhân viên ");
        System.out.println("5. cập nhật nhân viên ");
        System.out.println("6.sap xep theo ten");
        System.out.println("7.sap xep theo luong");
        System.out.println("8.top 5 ng cao nhat");
        System.out.print("mời chọn ");
    }
    public static void main(String[] args) {
        Ql nv =new Ql();
        Scanner sc = new Scanner(System.in);
        do{
            menu();
            int lua = sc.nextInt();
            switch(lua){
                case 1:
                    nv.nhap();
                    break;
                case 2:
                    nv.xuat();
                    break;
                case 3:{
                     System.out.print("nhâp mã nhân viên cần tìm  là ");
                    String   ma = new Scanner(System.in).nextLine();
                    nv.tim(ma);
                    break;
                
            }
                case 4: {
                     System.out.print("nhâp mã nhân viên  càn xóa là ");
                    String   ma = new Scanner(System.in).nextLine();
                    nv.xoa(ma);
                    break;
                
            }
                case 6:{
                    System.out.println("sap xep thanh cong ");
                    nv.sapxepten();
                    
                }
                case 7: {
                    System.out.println("da sap xep xog rui ");
                    nv.sapxeptop();
                }
            }
        }while(true);
    }
}

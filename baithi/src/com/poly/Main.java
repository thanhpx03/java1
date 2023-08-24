/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
import static java.lang.System.exit;
import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("---------------------");
        System.out.println("1.. nhâp danh sách ");
        System.out.println("2. xuất danh sách  ");
        System.out.println("3. xóa danh sách");
        System.out.println("4. sắp xếp danh sách  ");
        System.out.println("5.kế thừa");
        System.out.println("0. thoát");
        System.out.println("----------------------");
        System.out.print("mời chọn : ");
    }
    public static void main(String[] args) {
        Qlyhoa hoa=new Qlyhoa();
        Scanner sc = new Scanner (System.in);
        do{
            menu();
            int chon;
            chon=sc.nextInt();
            switch(chon){
                case 1: hoa.nhap();
                break;
                case 2:hoa.xuat();
                break;
                case 3 :{ 
                    hoa.xoa();
                     System.out.println("đã xóa ra khỏi danh sách !");
                    break;
                }
                case 4: {
                    System.out.println("đã sắp xếp danh sach rui");
                    hoa.sapxep();
                }
                case 5 : hoa.kethua();
                break;
                case 0 : exit(0);
                break;
            }
            
        }while(true);
    }
}

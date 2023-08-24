package com.poly;

        import java.util.Scanner;

public class Breakvacontinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int diem=0;
        System.out.println("nhap diem");
        while(true){
            diem= sc.nextInt();
            if(diem>=0&&diem<=10){
                continue;
            }
            System.out.println("diem từ 0-10 "+diem);
        }
        
        
    }
}

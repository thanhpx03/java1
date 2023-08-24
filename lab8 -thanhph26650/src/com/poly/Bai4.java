
package com.poly;


import java.util.Scanner;


public class Bai4 {
    public static final double sum (double...a){
    double s =0;
    for (double x:a){
        s+=x;
    }
        return s;
    }
   
     public static double min(double...a){
        double min = 10;
        for (double x : a){
            if(min>x){
                min=x;
            }
        }
    
    return min;
    }
    public static double max (double...a){
        double max=0;
        for (double x:a){
            if(max<x){
                max=x;
            }
        }
    
    return max;
    }
    static public String x(String a){
        String[] ars=a.split("");
       StringBuilder name = new StringBuilder();
        for(int i=0;i < ars.length;i++){
            String ten =ars[i];
            if(!ten.equals("")){
               String rema = ten.substring(1, ten.length());  
            String ch=ten.substring(0,1).toUpperCase();
            
            ten = ch + rema;
            name.append(ten).append("");
            }
        }
       

    return name.toString().trim();
    }
    public static void menu(){
        System.out.println("---------------------------");
        System.out.println("1. tính tổng");
        System.out.println("2. tìm max min");
        System.out.println("3. in chữ in hoa ");
        System.out.println("4. thoát");
        System.out.print("5. chọn : ");
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai4 vd = new Bai4();
        do{
            menu();
            int luachon=sc.nextInt();
            switch(luachon){
                case 1: {
                    System.out.println("kết quả :" + sum(6,7,8));
                }
                break;
                case 2 : {
                    System.out.println("min là "+ min(1,2,3,4)+"max là "+max(1,2,3,4));
                }
                case 3: {
                     System.out.println(x("nguyen văn anh"));
                }
            }
        }while(true);
        
    
    }
}

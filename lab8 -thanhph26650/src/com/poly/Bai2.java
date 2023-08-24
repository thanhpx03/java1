
package com.poly;


public class Bai2 {
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
    public static void main(String[] args) {
        System.out.println("min là "+ min(1,2,3,4)+"max là "+max(1,2,3,4));
    }
}

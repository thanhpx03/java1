
package com.poly;


public class Bai1 {
public static final double sum (double...a){
    double s =0;
    for (double x:a){
        s+=x;
    }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("kết quả :" + sum(5,7,9));
        
    
    }
    
}

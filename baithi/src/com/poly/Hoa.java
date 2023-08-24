/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hoa {
    private int Id;
    private String loaiHoa;
    private String mausac;

    public Hoa() {
    }

    public Hoa(int Id, String loaiHoa, String mausac) {
        this.Id = Id;
        this.loaiHoa = loaiHoa;
        this.mausac = mausac;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLoaiHoa() {
        return loaiHoa;
    }

    public void setLoaiHoa(String loaiHoa) {
        this.loaiHoa = loaiHoa;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
    public void nhapHoa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên hoa là ");
        this.Id=sc.nextInt();
        System.out.println("loại hoa là :");
        this.loaiHoa=new Scanner(System.in).nextLine();
        System.out.println("màu sắc của hóa là :");
        this.mausac=new Scanner(System.in).nextLine();
    }
    public void xuatHoa(){
        System.out.printf("%-10d      %-10s       %-10s\n",
                getId(),getLoaiHoa(), getMausac());
    }
}

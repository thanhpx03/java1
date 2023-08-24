/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14885;

import java.util.Scanner;

/**
 *
 * @author ANPRO
 */
public class NhanVienTiepThi extends NhanVien{
    private double hueHong;
private double doanhSo;
    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double doanhSo, double hueHong, String ma, String hoTen,double luong) {
        super(ma, hoTen,luong);
        
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        
        System.out.print("Doanh So: ");
        doanhSo = sc.nextDouble();
        System.out.print("Hue Hong: ");
        hueHong = sc.nextDouble();
        sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        
        System.out.printf("-Doanh so: %f - Hue Hong: %f\n", doanhSo,hueHong);
    }
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
       return luong + doanhSo * hueHong / 100;
    }
    
}

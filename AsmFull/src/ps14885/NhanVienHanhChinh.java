/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps14885;

/**
 *
 * @author ANPRO
 */
public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh() {
        
    }

    public NhanVienHanhChinh(String ma, String hoTen,double luong) {
        super(ma, hoTen,luong);
    }

    @Override
    public double getThuNhap() {
        return getLuong();
    }

 
}


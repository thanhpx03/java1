package com.poly;


public class SinhVienPoly extends SinhVien{
    private int chuyenNganhHep;

    public SinhVienPoly() {
    }

    public SinhVienPoly( String maSV, String hoTen, String chuyenNganh, int chuyenNganhHep) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }


    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    @Override
    public void inThongTin(){
        System.out.println("");
    }
}

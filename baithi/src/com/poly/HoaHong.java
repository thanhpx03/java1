
package com.poly;


public class HoaHong extends Hoa{
    private String xuatxu;

    public HoaHong() {
    }
    public HoaHong( int Id, String loaiHoa, String mausac,String xuatxu) {
        super(Id, loaiHoa, mausac);
        this.xuatxu = xuatxu;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }
    
    @Override
    public void xuatHoa(){
         HoaHong ab= new HoaHong(13,"hoa ly","xanh","hà nội");
        System.out.println("");
    }
}

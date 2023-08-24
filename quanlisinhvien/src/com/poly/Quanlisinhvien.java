
package com.poly;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Quanlisinhvien {
    ArrayList<ThongTinSinhVien> Sv= new ArrayList<>();
      public void khoiTao3Sv(){
        ThongTinSinhVien sv1= new ThongTinSinhVien("PH277999","vu hoang", 10);
        ThongTinSinhVien sv2= new ThongTinSinhVien("PH277998","nguyen hoai", 7);
        ThongTinSinhVien sv3= new ThongTinSinhVien("PH277900","vu quy", 8);
          Sv.add(sv1);
          Sv.add(sv2);
          Sv.add(sv3);
                  
                  
      }
    public Quanlisinhvien(){
        khoiTao3Sv();
    }
    public  void nhap1(){
        ThongTinSinhVien sv= new ThongTinSinhVien();
        sv.nhap();
        Sv.add(sv);
                
        
    }
    public void xuat1 (){
        System.out.println("------Danh sach sinh vien---------");
        System.out.printf("%-10s  %-30s  %-5s \n","Ma sv", "ho ten", "diem");
        for( ThongTinSinhVien sv : Sv){
            sv.xuat();
        }
    }
        public void timTheoma(String ma){
            boolean found= false;
            for(ThongTinSinhVien sv : Sv){
                if(sv.maSV.equalsIgnoreCase(ma)){
                    found=true;
                    System.err.println("------Danh sach sinh vien---------");
        System.out.printf("%-10s  %-30s  %-5s \n","Ma sv", "ho ten", "diem");
                    sv.xuat();
                    break;
                }
            }
            if(found==false)System.out.println("khong tim thay sinh vien do");
        }
            
            
            // chỉ ra tiêu chí sắp xếp
            Comparator<ThongTinSinhVien> comdiem = new Comparator<ThongTinSinhVien>() {
                @Override
                public int compare(ThongTinSinhVien sv1, ThongTinSinhVien sv2) {
                   if(sv1.diem > sv2.diem)return 1;
                   else return -1;
                }
            };
                   //phuong thuwsc sap xep danh sach theo diem
                   public void sapxeptheodiem(){
                       Collections.sort(Sv, comdiem);
                   }
                    
        
}
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            


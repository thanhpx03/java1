
package com.poly;





public class Sinhvien {
    public Boolean isEmail (String st){
        String a="\\w+@\\w+\\.\\w+";
        return st.matches(a);
    }
    public Boolean isSDT (String st){
        String a="0\\d{9}";
        return st.matches(a);
    }
    public Boolean isCNMD (String st){
        String a="\\d{9}";
        return st.matches(a);
    }
}

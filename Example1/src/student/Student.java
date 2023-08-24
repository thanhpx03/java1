package student;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String id;
    private String fullName;
    private String email;
    private String address;
    private String phoneNum;
    private float fee;

    public Student() {
    }

    public Student(String id, String fullName, String email, String address, 
            String phoneNum, float fee) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", email=" + 
                email + ", address=" + address + ", phoneNum=" + phoneNum + 
                ", fee=" + fee + '}';
    }
    
    void study(String subject) {
        System.out.println(this.fullName + " is studying " + subject);
    }
    
    void doExam(String subject) {
        System.out.println(this.fullName + " doing " + subject + " exam");
    }
    
    void payFee() {
        System.out.println("Fee of " + this.fullName + " is " + this.fee);
    }
    
    void doHomework(String subject) {
        System.out.println( this.fullName + " is doing " + subject + " homework.");
    }
}

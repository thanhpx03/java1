package student;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = getStudentInfo();
        
        System.out.println(students[0]);
        students[0].doHomework("C Programming language");
        students[0].payFee();
        students[0].study("Math");
//        students[1] = getStudentInfo();
    }
    
    public static Student getStudentInfo() {
        Student s = null;
        String id, fullName, address, email, phone;
        float fee;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Full name: ");
        fullName = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Phone number: ");
        phone = sc.nextLine();
        System.out.println("Fee: ");
        fee = sc.nextFloat();
        
        s =new Student(id, fullName, email, address, phone, fee);
        return s;
    }
}

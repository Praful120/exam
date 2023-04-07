package exam;

import BookStore.Book;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAdmissionsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        ArrayList<Student> students = new ArrayList<>();


        System.out.println("Enter details of Student ");

        System.out.print("Enter student name : ");
        student1.setStudentName(sc.nextLine());
        System.out.print("Enter past Grade (CGPA) in credit hours : ");
        student1.setPastGrade(sc.nextInt());
        sc.nextLine();      //garbage collecter
        System.out.print("Enter admissionFee : ");
        student1.setAdmissionFee(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter department name : ");
        student1.setDeptName(sc.next());
        System.out.print("Enter course name : ");
        student1.setCourseName(sc.next());
        students.add(student1);

        sc.nextLine();
        System.out.println("Enter details of next student ");

        System.out.print("Enter student name : ");
        student2.setStudentName(sc.nextLine());
        System.out.print("Enter past Grade (CGPA) in credit hours : ");
        student2.setPastGrade(sc.nextInt());
        sc.nextLine();      //garbage collecter
        System.out.print("Enter admissionFee : ");
        student2.setAdmissionFee(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter department name : ");
        student2.setDeptName(sc.next());
        System.out.print("Enter course name : ");
        student2.setCourseName(sc.next());
        students.add(student2);

        //displaying all details (without discount)
        System.out.println("Details : ");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        //generating receipts...
        System.out.println("Generating receipts.....");
        for (Student student : students){
            int admissionFee = student.getAdmissionFee();
            int pastGrade = student.getPastGrade();
            int discount = 0;

            if (pastGrade > 350 ){
                discount = 1500;
            }

            int totalFee = admissionFee - discount;

            student.setAdmissionFee(totalFee);

            System.out.println(student.toString());

        }


    }

}

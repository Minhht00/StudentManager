import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students[] listStudents = new Students[100];
        System.out.println("Nhap vao ma sinh vien: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten truong theo hoc: ");
        String schoolName = sc.nextLine();
        System.out.println("Nhap vao nam bat dau hoc: ");
        int timeStart = sc.nextInt();
        System.out.println("Nhap vao CGPA: ");
        double CGPA = sc.nextDouble();

        Students students = new Students(studentId,schoolName,timeStart,CGPA);
        listStudents[0] = students;

        System.out.println(listStudents[0].toString());

    }
}
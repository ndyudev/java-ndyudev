import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void display() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Điểm TB: " + gpa);
    }
}

public class QuanLySinhVien {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            System.out.print("Điểm trung bình: ");
            double gpa = sc.nextDouble();
            sc.nextLine(); // Clear buffer

            students.add(new Student(name, age, gpa));
        }

        System.out.println("\nDanh sách sinh viên:");
        for (Student student : students) {
            student.display();
        }
    }
}

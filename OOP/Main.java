// Bài 1: Giới thiệu về OOP

// Lớp (Class) đại diện cho một thực thể trong lập trình hướng đối tượng
class Student {
    // Thuộc tính (Attributes)
    String name;
    int age;
    double grade;

    // Constructor để khởi tạo đối tượng
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Phương thức (Method) để hiển thị thông tin sinh viên
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

// Lớp chính để chạy chương trình
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng (Object) của lớp Student
        Student student1 = new Student("Alice", 20, 8.5);
        Student student2 = new Student("Bob", 22, 9.0);

        // Gọi phương thức để hiển thị thông tin
        student1.displayInfo();
        System.out.println("---");
        student2.displayInfo();
    }
}

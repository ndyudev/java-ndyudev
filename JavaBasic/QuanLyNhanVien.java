import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Lương: " + salary);
    }
}

public class QuanLyNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            System.out.print("Lương: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Clear buffer

            employees.add(new Employee(name, age, salary));
        }

        System.out.println("\nDanh sách nhân viên:");
        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.display();
            totalSalary += employee.getSalary();
        }

        System.out.println("\nTổng lương của tất cả nhân viên: " + totalSalary);
        sc.close();
    }
}

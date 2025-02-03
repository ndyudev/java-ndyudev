package Java1.Lab41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    // Hàm tạo
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Ghi đè phương thức compareTo() để sắp xếp theo lương tăng dần
    @Override
    public int compareTo(Employee other) {
        // Sử dụng Double.compare để so sánh hai giá trị double
        return Double.compare(this.salary, other.salary);
    }

    // Phương thức xuất thông tin nhân viên
    public void display() {
        System.out.println("Tên: " + name + " | Lương: " + salary);
    }
}

public class EmployeeSortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Xóa bộ đệm newline

        // Nhập thông tin nhân viên
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Lương: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Xóa bộ đệm newline

            employeeList.add(new Employee(name, salary));
        }

        // Sắp xếp danh sách nhân viên theo lương tăng dần
        Collections.sort(employeeList);

        // Xuất danh sách nhân viên sau khi sắp xếp
        System.out.println("\nDanh sách nhân viên sau khi sắp xếp theo lương (tăng dần):");
        for (Employee emp : employeeList) {
            emp.display();
        }

        sc.close();
    }
}

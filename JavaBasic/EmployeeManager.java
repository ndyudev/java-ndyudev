// Lớp cha Employee
class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("👨‍💼 Nhân viên: " + name + ", Tuổi: " + age);
    }
}

// Lớp con FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("💰 Lương tháng: " + salary);
    }
}

// Lớp con PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int age, int hoursWorked, double hourlyRate) {
        super(name, age);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("🕒 Giờ làm: " + hoursWorked + ", Lương: " + (hoursWorked * hourlyRate));
    }
}

// Chạy chương trình
public class EmployeeManager {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Nguyễn Văn A", 30, 1500);
        PartTimeEmployee emp2 = new PartTimeEmployee("Trần Thị B", 22, 40, 10);

        emp1.displayInfo();
        System.out.println("-----------");
        emp2.displayInfo();
    }
}

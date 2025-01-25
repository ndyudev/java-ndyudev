class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Hình tròn có bán kính: " + radius);
        System.out.println("Diện tích: " + calculateArea());
        System.out.println("Chu vi: " + calculateCircumference());
    }
}

public class QuanLyHinhTron {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        circle.display();

        System.out.println("\nCập nhật bán kính...");
        circle.setRadius(10.0);
        circle.display();
    }
}

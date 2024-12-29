// Đề bài: Nhập nhiệt độ bằng độ C và chuyển sang độ F. Công thức: F = C * 1.8 + 32.
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ (°C): ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        scanner.close();
    }
}

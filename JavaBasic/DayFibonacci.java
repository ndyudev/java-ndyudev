import java.util.Scanner;

public class DayFibonacci {
    public static void main(String[] args) {
        // Đề: Nhập số n và in ra n số đầu tiên trong dãy Fibonacci.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Dãy Fibonacci: " + a);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
        scanner.close();
    }
}

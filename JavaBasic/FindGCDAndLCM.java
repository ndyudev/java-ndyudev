// Đề bài: Nhập hai số nguyên và tìm UCLN, BCNN của chúng.
import java.util.Scanner;

public class FindGCDAndLCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("UCLN của " + a + " và " + b + " là: " + gcd);
        System.out.println("BCNN của " + a + " và " + b + " là: " + lcm);
        scanner.close();
    }
}

import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        // Đề: Nhập một số nguyên dương và tính giai thừa của số đó.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Giai thừa của " + n + " là: " + factorial);
        scanner.close();
    }
}

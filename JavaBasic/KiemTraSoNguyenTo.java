import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        // Đề: Viết chương trình kiểm tra xem một số nguyên có phải là số nguyên tố hay không.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
        scanner.close();
    }
}

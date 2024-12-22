import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        // Đề: Nhập một số nguyên từ bàn phím và kiểm tra xem nó là số chẵn hay lẻ.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }
        scanner.close();
    }
}

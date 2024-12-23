import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        // Đề: Nhập một số từ bàn phím và in bảng cửu chương của số đó.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        System.out.println("Bảng cửu chương của " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}

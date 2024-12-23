import java.util.Scanner;

public class TimSoLonNhat {
    public static void main(String[] args) {
        // Đề: Nhập ba số nguyên và in ra số lớn nhất.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Số lớn nhất là: " + max);
        scanner.close();
    }
}

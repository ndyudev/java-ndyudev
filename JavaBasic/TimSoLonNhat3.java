import java.util.Scanner;

public class TimSoLonNhat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Số lớn nhất trong ba số là: " + max);
        sc.close();
    }
}

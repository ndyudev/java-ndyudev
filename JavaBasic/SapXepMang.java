import java.util.Arrays;
import java.util.Scanner;

public class SapXepMang {
    public static void main(String[] args) {
        // Đề: Nhập một mảng số nguyên và sắp xếp nó theo thứ tự tăng dần.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(arr));
        scanner.close();
    }
}

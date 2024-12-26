import java.util.Scanner;

public class KiemTraPalindrome {
    public static void main(String[] args) {
        // Đề: Nhập một chuỗi và kiểm tra xem nó có phải là palindrome không.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " là chuỗi palindrome.");
        } else {
            System.out.println(str + " không phải là chuỗi palindrome.");
        }
        scanner.close();
    }
}

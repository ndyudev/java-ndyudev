import java.util.Scanner;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        // Đề: Nhập một chuỗi và in ra chuỗi đó sau khi đảo ngược.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
        scanner.close();
    }
}

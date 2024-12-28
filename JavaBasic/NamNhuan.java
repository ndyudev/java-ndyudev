// Đề bài: Nhập một năm bất kỳ và kiểm tra xem đó có phải là năm nhuận hay không.
import java.util.Scanner;

public class  NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một năm: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
        scanner.close();
    }
}

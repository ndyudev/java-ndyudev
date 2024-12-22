import java.util.Scanner;

public class Tong2So {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        
        System.out.println("Nhap so thu hai: ");
        int b = scanner.nextInt();
        
        System.out.println("Tong cua 2 so la: " + (a + b));
        
        // Đóng scanner
        scanner.close();
    }
}

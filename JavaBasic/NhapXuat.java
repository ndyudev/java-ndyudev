import java.util.Scanner;

public class NhapXuat {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String age = scanner.nextLine();
        System.out.println("Tên của bạn là: " + age);

        
    }   

}
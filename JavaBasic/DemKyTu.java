import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String str = sc.nextLine();

        int kyTu = 0, so = 0, khoangTrang = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                kyTu++;
            } else if (Character.isDigit(c)) {
                so++;
            } else if (Character.isWhitespace(c)) {
                khoangTrang++;
            }
        }

        System.out.println("Số ký tự: " + kyTu);
        System.out.println("Số chữ số: " + so);
        System.out.println("Số khoảng trắng: " + khoangTrang);
    }
}

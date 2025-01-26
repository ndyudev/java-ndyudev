import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("Tên sách: " + title + ", Tác giả: " + author + ", Giá: " + price);
    }
}

public class QuanLySach {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\nQuản lý sách:");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm sách theo tên");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.print("Nhập tên sách: ");
                String title = sc.nextLine();
                System.out.print("Nhập tác giả: ");
                String author = sc.nextLine();
                System.out.print("Nhập giá: ");
                double price = sc.nextDouble();
                sc.nextLine(); // Clear buffer

                books.add(new Book(title, author, price));
            } else if (choice == 2) {
                System.out.print("Nhập tên sách cần tìm: ");
                String searchTitle = sc.nextLine();

                boolean found = false;
                for (Book book : books) {
                    if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                        book.display();
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Không tìm thấy sách!");
                }
            } else if (choice == 3) {
                System.out.println("\nDanh sách sách:");
                for (Book book : books) {
                    book.display();
                }
            } else if (choice == 4) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

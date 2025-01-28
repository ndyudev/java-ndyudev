import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Tên sản phẩm: " + productName + ", Giá: " + price + ", Số lượng: " + quantity + ", Tổng giá trị: " + getTotalValue());
    }
}

public class QuanLySanPham {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("\nQuản lý sản phẩm:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm sản phẩm theo tên");
            System.out.println("4. Tính tổng giá trị sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.print("Nhập tên sản phẩm: ");
                String name = sc.nextLine();
                System.out.print("Nhập giá sản phẩm: ");
                double price = sc.nextDouble();
                System.out.print("Nhập số lượng: ");
                int quantity = sc.nextInt();
                sc.nextLine(); // Clear buffer

                products.add(new Product(name, price, quantity));
            } else if (choice == 2) {
                System.out.println("\nDanh sách sản phẩm:");
                for (Product product : products) {
                    product.display();
                }
            } else if (choice == 3) {
                System.out.print("Nhập tên sản phẩm cần tìm: ");
                String searchName = sc.nextLine();
                boolean found = false;

                for (Product product : products) {
                    if (product.getProductName().equalsIgnoreCase(searchName)) {
                        product.display();
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Không tìm thấy sản phẩm!");
                }
            } else if (choice == 4) {
                double totalValue = 0;
                for (Product product : products) {
                    totalValue += product.getTotalValue();
                }
                System.out.println("Tổng giá trị của tất cả sản phẩm: " + totalValue);
            } else if (choice == 5) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

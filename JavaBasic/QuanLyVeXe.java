import java.util.ArrayList;
import java.util.Scanner;

class BusTicket {
    private String ticketID;
    private String customerName;
    private double ticketPrice;

    public BusTicket(String ticketID, String customerName, double ticketPrice) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void display() {
        System.out.println("Mã vé: " + ticketID + ", Tên khách hàng: " + customerName + ", Giá vé: " + ticketPrice);
    }
}

public class QuanLyVeXe {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<BusTicket> tickets = new ArrayList<>();

            while (true) {
                System.out.println("\nQuản lý vé xe bus:");
                System.out.println("1. Thêm vé");
                System.out.println("2. Hiển thị danh sách vé");
                System.out.println("3. Tính tổng doanh thu");
                System.out.println("4. Thoát");
                System.out.print("Chọn: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Clear buffer

                if (choice == 1) {
                    System.out.print("Nhập mã vé: ");
                    String ticketID = sc.nextLine();
                    System.out.print("Nhập tên khách hàng: ");
                    String customerName = sc.nextLine();
                    System.out.print("Nhập giá vé: ");
                    double ticketPrice = sc.nextDouble();
                    sc.nextLine(); // Clear buffer

                    tickets.add(new BusTicket(ticketID, customerName, ticketPrice));
                } else if (choice == 2) {
                    System.out.println("\nDanh sách vé:");
                    for (BusTicket ticket : tickets) {
                        ticket.display();
                    }
                } else if (choice == 3) {
                    double totalRevenue = 0;
                    for (BusTicket ticket : tickets) {
                        totalRevenue += ticket.getTicketPrice();
                    }
                    System.out.println("Tổng doanh thu: " + totalRevenue);
                } else if (choice == 4) {
                    System.out.println("Thoát chương trình.");
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

class BankAccount {
    private String accountID;
    private String ownerName;
    private double balance;

    public BankAccount(String accountID, String ownerName, double balance) {
        this.accountID = accountID;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Nạp tiền thành công! Số dư mới: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Không đủ tiền!");
        } else {
            balance -= amount;
            System.out.println("Rút tiền thành công! Số dư còn lại: " + balance);
        }
    }

    public void display() {
        System.out.println("Tài khoản: " + accountID + " | Chủ: " + ownerName + " | Số dư: " + balance);
    }
}

public class QuanLyNganHang {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            HashMap<String, BankAccount> accounts = new HashMap<>();

            while (true) {
                System.out.println("\n--- HỆ THỐNG NGÂN HÀNG ---");
                System.out.println("1. Tạo tài khoản");
                System.out.println("2. Nạp tiền");
                System.out.println("3. Rút tiền");
                System.out.println("4. Xem tài khoản");
                System.out.println("5. Thoát");
                System.out.print("Chọn: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Clear buffer

                if (choice == 1) {
                    System.out.print("Nhập số tài khoản: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên chủ tài khoản: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập số dư ban đầu: ");
                    double balance = sc.nextDouble();
                    accounts.put(id, new BankAccount(id, name, balance));
                    System.out.println("Tạo tài khoản thành công!");
                } else if (choice == 2) {
                    System.out.print("Nhập số tài khoản: ");
                    String id = sc.nextLine();
                    if (accounts.containsKey(id)) {
                        System.out.print("Nhập số tiền nạp: ");
                        double amount = sc.nextDouble();
                        accounts.get(id).deposit(amount);
                    } else {
                        System.out.println("Không tìm thấy tài khoản!");
                    }
                } else if (choice == 3) {
                    System.out.print("Nhập số tài khoản: ");
                    String id = sc.nextLine();
                    if (accounts.containsKey(id)) {
                        System.out.print("Nhập số tiền rút: ");
                        double amount = sc.nextDouble();
                        accounts.get(id).withdraw(amount);
                    } else {
                        System.out.println("Không tìm thấy tài khoản!");
                    }
                } else if (choice == 4) {
                    System.out.println("\n--- DANH SÁCH TÀI KHOẢN ---");
                    for (BankAccount acc : accounts.values()) {
                        acc.display();
                    }
                } else if (choice == 5) {
                    System.out.println("Thoát chương trình.");
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        }
    }
}

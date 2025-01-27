class BankAccount {
    @SuppressWarnings("unused")
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Đã gửi " + amount + ". Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Đã rút " + amount + ". Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền rút không hợp lệ!");
        }
    }

    public void checkBalance() {
        System.out.println("Số dư tài khoản: " + balance);
    }
}

public class QuanLyTaiKhoan {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        account.checkBalance();
        account.deposit(500.0);
        account.withdraw(300.0);
        account.withdraw(1500.0); // Invalid withdraw
        account.checkBalance();
    }
}

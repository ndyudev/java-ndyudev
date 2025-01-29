import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void display() {
        System.out.println("Tên: " + name + " | SĐT: " + phoneNumber);
    }

    public String toFileString() {
        return name + "," + phoneNumber;
    }
}

public class QuanLyDanhBa {
    private static final String FILE_NAME = "contacts.txt";
    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        loadContactsFromFile(); // Load danh bạ khi chạy

        while (true) {
            System.out.println("\n--- QUẢN LÝ DANH BẠ ---");
            System.out.println("1. Thêm liên hệ");
            System.out.println("2. Hiển thị danh bạ");
            System.out.println("3. Tìm kiếm liên hệ");
            System.out.println("4. Lưu danh bạ vào file");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.print("Nhập tên: ");
                String name = sc.nextLine();
                System.out.print("Nhập số điện thoại: ");
                String phone = sc.nextLine();
                contacts.add(new Contact(name, phone));
                System.out.println("Đã thêm liên hệ!");
            } else if (choice == 2) {
                System.out.println("\n--- DANH BẠ ---");
                for (Contact c : contacts) {
                    c.display();
                }
            } else if (choice == 3) {
                System.out.print("Nhập tên cần tìm: ");
                String searchName = sc.nextLine();
                boolean found = false;

                for (Contact c : contacts) {
                    if (c.getName().equalsIgnoreCase(searchName)) {
                        c.display();
                        found = true;
                    }
                }

                if (!found) System.out.println("Không tìm thấy liên hệ.");
            } else if (choice == 4) {
                saveContactsToFile();
                System.out.println("Đã lưu danh bạ vào file!");
            } else if (choice == 5) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void saveContactsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Contact c : contacts) {
                bw.write(c.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu file!");
        }
    }

    private static void loadContactsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    contacts.add(new Contact(data[0], data[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Không tìm thấy file danh bạ, sẽ tạo mới.");
        }
    }
}

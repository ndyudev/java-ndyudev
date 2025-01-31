package OOP;

// Interface Readable
interface Readable {
    void read();
}

// Lớp Book
class Book implements Readable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void read() {
        System.out.println("📖 Đọc sách: " + title + " - Tác giả: " + author);
    }
}

// Lớp Magazine
class Magazine implements Readable {
    private String name;
    private int issueNumber;

    public Magazine(String name, int issueNumber) {
        this.name = name;
        this.issueNumber = issueNumber;
    }

    @Override
    public void read() {
        System.out.println("📚 Đọc tạp chí: " + name + " - Số: " + issueNumber);
    }
}

// Lớp Newspaper
class Newspaper implements Readable {
    private String date;

    public Newspaper(String date) {
        this.date = date;
    }

    @Override
    public void read() {
        System.out.println("📰 Đọc báo ngày: " + date);
    }
}

// Chạy chương trình
public class Library {
    public static void main(String[] args) {
        Readable book = new Book("Nhà Giả Kim", "Paulo Coelho");
        Readable magazine = new Magazine("Forbes", 2024);
        Readable newspaper = new Newspaper("29-01-2025");

        book.read();
        magazine.read();
        newspaper.read();
    }
}

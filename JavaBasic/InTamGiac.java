public class InTamGiac {
    public static void main(String[] args) {
        int n = 5; // Số dòng của tam giác Pascal
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
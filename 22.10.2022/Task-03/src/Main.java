import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= number;
        }

        System.out.format("%d ^ 3 = %d", number, result);
    }
}
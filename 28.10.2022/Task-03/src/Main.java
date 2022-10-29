import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(getFactorial(number));
    }

    public static int getFactorial(int number) {
        int result = 1;
        while (number > 1) {
            result *= number;
            number--;
        }

        return result;
    }
}
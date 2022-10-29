import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        boolean isValid = false;

        if (year % 4 == 0) {
            isValid = true;
        }
        if (year % 100 == 0) {
            isValid = false;
        }
        if (year % 400 == 0) {
            isValid = true;
        }

        System.out.println(isValid);
    }
}
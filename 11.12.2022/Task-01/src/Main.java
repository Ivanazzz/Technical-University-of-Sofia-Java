import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            division(a, b);
        }
        catch (ZeroDenominatorException zde) {
            System.out.println(zde.getMessage());
        }
    }

    public static void division(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException ae) {
            throw new ZeroDenominatorException("Cannot divide by zero!");
        }
    }

    public static void method() {
        try {
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            scanner.close();
            int number = Integer.parseInt(num);
        }
        catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
    }

    public static void method2() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            scanner.close();
        }
        catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        }
    }
}
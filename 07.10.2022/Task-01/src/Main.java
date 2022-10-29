import java.util.Scanner;

public class Main {
    // В main() метода да се прочетат име, години и рожденна дата на даден човек, въведени от
    // клавиатурата, чрез използване на класа Scanner. Данните да се отпечатат на стандартния изход.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();
        String birthDate = scanner.next();

        scanner.close();

        System.out.printf("Your name is %s, you are %d years old and your birth date is %s", name, age, birthDate);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Напишете програма която получава от стандартния вход 5 низа, разделени
        // с интервал и записва низовете в масив. Отпечатва низовете на екрана.

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        scanner.close();

        for (String currentString : input) {
            System.out.println(currentString);
        }
    }
}
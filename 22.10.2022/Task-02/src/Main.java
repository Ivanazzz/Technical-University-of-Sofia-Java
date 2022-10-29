import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = scanner.nextInt();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        scanner.close();

        float totalHours = hours + (minutes / 60) + ((seconds / 60) / 60);
        float kilometers = meters / 1000;
        float speed = kilometers / totalHours;

        System.out.format("Speed in km: %.2f", speed);

    }
}
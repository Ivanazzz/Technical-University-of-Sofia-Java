import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();

        scanner.close();

        System.out.format("The area is: %.2f", area(firstSide, secondSide, thirdSide));
    }

    public static double area(int firstSide, int secondSide, int thirdSide) {
        double halfPerimeter = (double)(firstSide + secondSide + thirdSide) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) *
                (halfPerimeter - thirdSide));

        return area;
    }
}
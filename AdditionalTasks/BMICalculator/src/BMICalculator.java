import java.util.Scanner;

public class BMICalculator {

    public BMICalculator() {
        printIntroduction();
    }

    public void printIntroduction() {
        System.out.println("This is program which calculates your body mass index.");
    }

    public void getBMI() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        System.out.println("Enter your weight in kg: ");
        double weightInKg = scanner.nextDouble();

        double heightInInches = heightInCm * 0.3937;
        double weightInPounds =  weightInKg * 2.2046;

        double bmi = bmiFor(heightInInches, weightInPounds);
        reportResults(bmi, getStatus(bmi));
    }

    private double bmiFor(double heightInInches, double weightInPounds) {
        double bmi = weightInPounds / (heightInInches * heightInInches) * 703;
        return bmi;
    }

    private String getStatus(double bmi) {
        if (bmi <= 18.5) {
            return "underweight";
        }
        else if (bmi <= 25) {
            return "normal";
        }
        else if (bmi <= 30) {
            return "overweight";
        }
        else
        {
            return "obese";
        }
    }

    private void reportResults(double bmi, String status) {
        System.out.format("Your BMI is %.1f with status %s", bmi, status);
    }
}

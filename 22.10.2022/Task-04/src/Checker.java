public class Checker {
    public static boolean check(int[] numbers) {
        boolean isValid = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1] - 1) {
                isValid = false;
            }
        }

        return isValid;
    }
}

public class Print {
    public void print(int[] numbers) {
        for (int i = 1; i <= 10; i++) {
            boolean isValid = true;

            for (int j = 0; j < numbers.length; j++) {
                if (i % numbers[j] != 0) {
                    isValid = false;
                }
            }

            if (isValid) {
                System.out.format("%d is divisible by all numbers\n", i);
            }
            else {
                System.out.format("%d is divisible by: ", i);
                for (int j = 0; j < numbers.length; j++) {
                    if (i % numbers[j] == 0) {
                        System.out.format("%d ", numbers[j]);
                    }
                }
                System.out.print("\n");
            }
        }
    }
}

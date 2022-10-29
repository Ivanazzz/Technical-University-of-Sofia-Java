public class Print {
    public void print(int firstNum, int secondNum) {
        for (int i = 1; i <= 100; i++) {
            if (i % firstNum == 0 && i % secondNum == 0) {
                System.out.format("%d is divisible by %d and %d\n", i, firstNum, secondNum);
            }
            else if (i % firstNum == 0) {
                System.out.format("%d is divisible only by %d\n", i, firstNum);
            }
            else if (i % secondNum == 0) {
                System.out.format("%d is divisible only by %d\n", i, secondNum);
            }
        }
    }
}

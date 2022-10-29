public class Main {
    public static void main(String[] args) {

        for (int number = 1; number < 30; number++) {
            int sum = 0;
            for (int delimeter = 1; delimeter < number; delimeter++) {
                if (number % delimeter == 0){
                    sum += delimeter;
                }
            }

            if (sum == number){
                System.out.println(number);
            }
        }
    }
}
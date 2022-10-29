public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] anotherNumbers = {2, 8, 5, 90, 11};

        Checker checker = new Checker();
        System.out.println(checker.check(numbers));
        System.out.println(checker.check(anotherNumbers));
    }
}
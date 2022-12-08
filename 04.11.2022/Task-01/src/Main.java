import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Да се реализира метод static int[] sortAndFilter(int[] array, int key). Методът да сортира масива
        // и да премахне всички стойности по-големи от подадения параметър key. Подаденият масив да не
        // се променя във викащата функция. Тъй като масивите са референтен тип, необходимо е той първо
        // да се копира. Отпечатайте резултата в main.

        int[] array = {4, 6, 1, 3, 9, 3, 1, 2, 2, 12, 5};
        int key = 6;

        int[] result = sortAndFilter(array, key);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortAndFilter(int[] array, int key) {
        int[] copyArray = Arrays.copyOfRange(array, 0, array.length);
        Arrays.sort(copyArray);
        int end = Arrays.binarySearch(copyArray, key);

        if (end >= 0) {
            return Arrays.copyOfRange(copyArray, 0, end);
        }

        return copyArray;
    }
}
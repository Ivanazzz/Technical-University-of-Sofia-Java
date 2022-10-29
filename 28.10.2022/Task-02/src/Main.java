import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int array[] = {3, 6, 2, 55, 8, 9, 11, 23, 4};

        System.out.println(Arrays.toString(orderBy(array)));
        System.out.println(Arrays.toString(orderByDescending(array)));
    }

    public static int[] orderBy(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] orderByDescending(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
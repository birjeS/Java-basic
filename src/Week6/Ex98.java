package Week6;
import java.util.Arrays;

public class Ex98 {
    public static void main(String[] args) {
        // Exercise 98.1: Copy
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // Change the copied
        copied[0] = 99;

        // Print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        // Exercise 98.2: Reverse copy
        int[] reverse = reverseCopy(original);

        // Print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    // Exercise 98.1: Copy method
    public static int[] copy(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        return copiedArray;
    }

    // Exercise 98.2: Reverse copy method
    public static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversedArray[i] = array[j];
        }

        return reversedArray;
    }
}

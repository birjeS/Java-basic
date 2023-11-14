package Week6;

import java.util.Arrays;

public class Ex104 {

    public static void main(String[] args) {
        // Example usage of implemented methods
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(values));
        sort(values);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int minIndex = index;
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}

package Week6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex106 {
    public static class BinarySearch {
        public static boolean search(int[] array, int searchedValue) {
            int startIndex = 0;
            int endIndex = array.length - 1;

            while (startIndex <= endIndex) {
                int middleIndex = (startIndex + endIndex) / 2;
                int middleValue = array[middleIndex];

                if (middleValue == searchedValue) {
                    return true;
                } else if (middleValue < searchedValue) {
                    startIndex = middleIndex + 1;
                } else {
                    endIndex = middleIndex - 1;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        int searchedValue = Integer.parseInt(reader.nextLine());
        System.out.println();

        boolean result = BinarySearch.search(array, searchedValue);

        if (result) {
            System.out.println("Value " + searchedValue + " is in the array");
        } else {
            System.out.println("Value " + searchedValue + " is not in the array");
        }
    }
}

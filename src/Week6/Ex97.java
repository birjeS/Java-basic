package Week6;

public class Ex97 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            // Check if it's the last element to avoid trailing comma
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(); // Move to the next line after printing the array
    }
}

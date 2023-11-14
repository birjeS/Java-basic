package Week2;

public class Ex40 {
    public static void main(String[] args) {
        // Example usage
        printStars(5);
        printTriangle(4);
        xmasTree(4);
        xmasTree(10);
    }

    private static void printStars(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println(); // Add a line break after printing stars
    }

    private static void printWhitespaces(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    private static void xmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printWhitespaces(height - i);
            printStars(2 * i - 1);
        }

        // Print the stand
        for (int i = 0; i < 2; i++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }
}

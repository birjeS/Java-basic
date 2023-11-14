package Week2;

public class Ex39 {
    private static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println(); // Line break after printing stars
    }

    private static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
    }

    private static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println(); // Adding a separator for better readability

        printSquare(4);

        System.out.println(); // Adding a separator for better readability

        printRectangle(17, 3);

        System.out.println(); // Adding a separator for better readability

        printTriangle(4);
    }
}

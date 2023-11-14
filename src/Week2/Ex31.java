package Week2;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First: ");
        int first = scanner.nextInt();

        System.out.print("Last: ");
        int last = scanner.nextInt();

        // Check if the first number is greater than the last number
        if (first > last) {
            System.out.println("No numbers to print.");
        } else {
            int current = first;
            while (current <= last) {
                System.out.println(current);
                current++;
            }
        }

        scanner.close();
    }
}

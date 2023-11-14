package Week2;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter a number (enter 0 to stop): ");
            int read = Integer.parseInt(reader.nextLine());

            if (read == 0) {
                break;
            }

            sum += read;
            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);

        // Close the scanner to avoid resource leak
        reader.close();
    }
}

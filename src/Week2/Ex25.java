package Week2;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        // Prompt the user to type three numbers
        System.out.print("Type the first number: ");
        read = reader.nextInt();
        sum += read;

        System.out.print("Type the second number: ");
        read = reader.nextInt();
        sum += read;

        System.out.print("Type the third number: ");
        read = reader.nextInt();
        sum += read;

        // Display the sum
        System.out.println("Sum: " + sum);

        // Close the scanner to avoid resource leak
        reader.close();
    }
}

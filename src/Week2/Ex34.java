package Week2;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = scanner.nextInt();

        int factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial is " + factorial);

        scanner.close();
    }
}

package Week2;
import java.util.Scanner;


public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(2, i);
        }

        System.out.println("The result is " + sum);

        scanner.close();
    }
}

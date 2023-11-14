package Week2;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First: ");
        int first = scanner.nextInt();

        System.out.print("Last: ");
        int last = scanner.nextInt();

        int sum = 0;
        int i = first;

        while (i <= last) {
            sum += i;
            i++;
        }

        System.out.println("The sum is " + sum);

        scanner.close();
    }
}

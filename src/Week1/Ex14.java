package Week1;
import java.util.Scanner;

public class Ex14 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Type a number: ");
    int number = scanner.nextInt();

    if (number > 0) {
        System.out.println("The number is positive.");
    } else if (number == 0) {
        System.out.println("The number is zero.");
    } else {
        System.out.println("The number is not positive.");
    }
}
}

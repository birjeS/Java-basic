package Week1;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Type another number: ");
        int number2 = scanner.nextInt();

        int largerNumber = Math.max(number1, number2);

        System.out.println("The bigger number of the two numbers given was: " + largerNumber);
    }
}
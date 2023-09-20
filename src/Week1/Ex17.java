package Week1;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Type the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Type the second number: ");
        double num2 = scanner.nextDouble();

        // Compare the two numbers
        if (num1 > num2) {
            System.out.println("Greater number: " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number: " + num2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}

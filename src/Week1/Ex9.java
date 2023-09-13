package Week1;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number ");
        double number = Integer.parseInt(reader.nextLine());
        System.out.println(number);

        System.out.print("Type another number ");
        double newNumber = Integer.parseInt(reader.nextLine());
        System.out.println(newNumber);

        double division = number / newNumber;
        System.out.println("Sum of the numbers: " + division);
    }
}

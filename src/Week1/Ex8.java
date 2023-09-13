package Week1;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println(number);

        System.out.print("Type another number ");
        int newNumber = Integer.parseInt(reader.nextLine());
        System.out.println(newNumber);

        int sum = number + newNumber;
        System.out.println("Sum of the numbers: " + sum);
    }
}

package Week1;
import java.util.Scanner;

public class Ex15 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How old are you? ");
    int age = scanner.nextInt();

    if (age >= 18) {
        System.out.println("You have reached the age of majority!");
    } else {
        System.out.println("You have not reached the age of majority yet!");
    }
}
}


package Week3;
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        char firstChar = firstCharacter(name);

        System.out.println("First character: " + firstChar);
    }

    public static char firstCharacter(String text) {
        if (text.length() > 0) {
            return text.charAt(0);
        } else {
            System.out.println("Error: Empty string! Cannot find the first character.");
            return '*';
        }
    }
}

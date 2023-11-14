package Week3;
import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        char lastChar = lastCharacter(name);

        System.out.println("Last character: " + lastChar);
    }

    public static char lastCharacter(String text) {
        if (text != null && !text.isEmpty()) {
            return text.charAt(text.length() - 1);
        } else {
            System.out.println("Error: Empty string! Cannot find the last character.");
            return 'X'; // Error indicator for an empty string.
        }
    }
}

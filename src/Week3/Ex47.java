package Week3;
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        int numberOfCharacters = calculateCharacters(name);

        System.out.println("Number of characters: " + numberOfCharacters);
    }

    public static int calculateCharacters(String text) {
        return text.length();
    }
}

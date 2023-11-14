package Week3;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();

        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(scanner.nextLine());

        if (length <= word.length()) {
            int startIndex = word.length() - length;
            String result = word.substring(startIndex);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid length. The word is shorter than the specified length.");
        }
    }
}

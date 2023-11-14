package Week3;
import java.util.Scanner;

public class Ex69 {
    public static boolean palindrome(String text) {
        // Reversing the text using the reverse method
        String reversedText = reverse(text);

        // Comparing the original text with its reversed version
        return text.equals(reversedText);
    }

    public static String reverse(String text) {
        // Reversing the text
        String reversed = "";
        int index = text.length() - 1;

        while (index >= 0) {
            reversed += text.charAt(index);
            index--;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();

        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}

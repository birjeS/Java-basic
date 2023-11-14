package Week3;
import java.util.Scanner;

public class Ex56 {
    public static String reverse(String text) {
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }

        return reversedText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}

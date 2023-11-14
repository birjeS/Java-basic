package Week3;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        for (;;) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                break; // Exit the loop if an empty string is entered
            }

            words.add(word);
        }

        System.out.println("\nYou typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

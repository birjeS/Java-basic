package Week3;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break; // Exit the loop if the word is entered twice
            }

            words.add(word);
        }
    }
}

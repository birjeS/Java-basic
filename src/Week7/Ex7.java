package Week7;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        new Ex7().run();
    }

    private void run() {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }

    static class Dictionary {
        private HashMap<String, String> translations;

        public Dictionary() {
            this.translations = new HashMap<String, String>();
        }

        public String translate(String word) {
            return this.translations.get(word);
        }

        public void add(String word, String translation) {
            this.translations.put(word, translation);
        }

        public int amountOfWords() {
            return this.translations.size();
        }

        public ArrayList<String> translationList() {
            ArrayList<String> translationsList = new ArrayList<String>();
            for (String key : this.translations.keySet()) {
                String translation = key + " = " + this.translations.get(key);
                translationsList.add(translation);
            }
            return translationsList;
        }
    }

    static class TextUserInterface {
        private Scanner reader;
        private Dictionary dictionary;

        public TextUserInterface(Scanner reader, Dictionary dictionary) {
            this.reader = reader;
            this.dictionary = dictionary;
        }

        public void start() {
            System.out.println("Statements:\n  add - adds a word pair to the dictionary\n  translate - asks a word and prints its translation\n  quit - quits the text user interface");

            while (true) {
                System.out.print("\nStatement: ");
                String command = this.reader.nextLine();

                if (command.equals("quit")) {
                    System.out.println("Cheers!");
                    break;
                } else if (command.equals("add")) {
                    System.out.print("In Finnish: ");
                    String finnishWord = this.reader.nextLine();
                    System.out.print("Translation: ");
                    String translation = this.reader.nextLine();
                    this.dictionary.add(finnishWord, translation);
                } else if (command.equals("translate")) {
                    System.out.print("Give a word: ");
                    String wordToTranslate = this.reader.nextLine();
                    String translation = this.dictionary.translate(wordToTranslate);
                    System.out.println("Translation: " + (translation != null ? translation : "Unknown word"));
                } else {
                    System.out.println("Unknown statement");
                }
            }
        }
    }
}

package Week7;

public class Ex1 {
    public static void main(String[] args) {
        printWithSmileys("\\:D/");
        System.out.println();
        printWithSmileys("87.");
    }

    private static void printWithSmileys(String characterString) {
        printSmileysRow(characterString.length());
        printSmileyLine(characterString);
        printSmileysRow(characterString.length());
    }

    private static void printSmileysRow(int length) {
        for (int i = 0; i < length + 2; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

    private static void printSmileyLine(String characterString) {
        if (characterString.length() % 2 == 1) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
    }
}

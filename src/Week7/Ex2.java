package Week7;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        // Example for Change class
        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);
        System.out.println(word);

        Change change2 = new Change('r', 'x');
        word = change2.change(word);
        System.out.println(word);

        // Example for Changer class
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}

class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        StringBuilder changedString = new StringBuilder();

        for (int i = 0; i < characterString.length(); i++) {
            char character = characterString.charAt(i);
            if (character == fromCharacter) {
                changedString.append(toCharacter);
            } else {
                changedString.append(character);
            }
        }

        return changedString.toString();
    }
}

class Changer {
    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<>();
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String characterString) {
        for (Change change : changes) {
            characterString = change.change(characterString);
        }
        return characterString;
    }
}

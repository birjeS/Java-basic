package Week3;
import java.util.ArrayList;

public class Ex65 {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String str : list) {
            lengths.add(str.length());
        }

        return lengths;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hallo");
        words.add("Moi");
        words.add("Benvenuto!");
        words.add("badger badger badger badger");

        ArrayList<Integer> lengths = lengths(words);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}

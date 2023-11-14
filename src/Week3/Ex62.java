package Week3;
import java.util.ArrayList;

public class Ex62 {
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

        // sorting brothers
        brothers.sort(String.CASE_INSENSITIVE_ORDER);

        // removing the last item
        removeLast(brothers);

        System.out.println(brothers);
    }

    public static void removeLast(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}

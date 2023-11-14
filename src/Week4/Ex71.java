package Week4;
import java.util.ArrayList;

public class Ex71 {
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int number : second) {
            if (!first.contains(number)) {
                first.add(number);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        smartCombine(list1, list2);

        System.out.println(list1); // prints [4, 3, 5, 10, 7]
        System.out.println(list2); // prints [5, 10, 7]
    }
}

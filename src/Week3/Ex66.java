package Week3;
import java.util.ArrayList;

public class Ex66 {
    public static int greatest(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            // Handle the case when the list is empty
            throw new IllegalArgumentException("List is empty");
        }

        int greatestNumber = list.get(0);

        for (int number : list) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }

        return greatestNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);

        System.out.println("The greatest number is: " + greatest(numbers));
    }
}

package Week3;
import java.util.ArrayList;

public class Ex64 {
    public static double average(ArrayList<Integer> list) {
        // Use the sum method to calculate the sum of the list
        int sum = sum(list);

        // Calculate the average
        double average = (double) sum / list.size();

        return average;
    }

    // Method to calculate the sum of an ArrayList of integers
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        // Loop through the ArrayList and add each element to the sum
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}

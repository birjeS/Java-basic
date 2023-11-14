package Week3;
import java.util.ArrayList;

public class Ex67 {
    public static double variance(ArrayList<Integer> list) {
        if (list.size() < 2) {
            // Handle the case when the list has less than two elements
            throw new IllegalArgumentException("List must have at least two elements");
        }

        // Calculate the average using the average method from exercise 64
        double average = average(list);

        double sumSquaredDifferences = 0;

        for (int number : list) {
            double difference = number - average;
            sumSquaredDifferences += difference * difference;
        }

        // Calculate the sample variance
        double variance = sumSquaredDifferences / (list.size() - 1);

        return variance;
    }

    // Method from exercise 64 to calculate the average of a list
    public static double average(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);

        System.out.println("The variance is: " + variance(numbers));
    }
}

package Week1;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int points = scanner.nextInt();

// Determine the grade based on the points
        String grade;
        if (points >= 0 && points <= 29) {
            grade = "failed";
        } else if (points >= 30 && points <= 34) {
            grade = "1";
        } else if (points >= 35 && points <= 39) {
            grade = "2";
        } else if (points >= 40 && points <= 44) {
            grade = "3";
        } else if (points >= 45 && points <= 49) {
            grade = "4";
        } else if (points >= 50 && points <= 60) {
            grade = "5";
        } else {
            grade = "Invalid input";
        }

        // Print the grade
        System.out.println("Grade: " + grade);
    }
}

package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex102 {
    private final ArrayList<Integer> scores;
    private final Scanner scanner;

    public Ex102(Scanner scanner) {
        this.scores = new ArrayList<>();
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex102 gradeDistribution = new Ex102(scanner);
        gradeDistribution.readScores();
        gradeDistribution.printGradeDistribution();
        gradeDistribution.printAcceptancePercentage();
    }

    private void readScores() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }
            if (score >= 0 && score <= 60) {
                scores.add(score);
            }
        }
    }

    private int grade(int score) {
        if (score >= 50) {
            return 5;
        } else if (score >= 45) {
            return 4;
        } else if (score >= 40) {
            return 3;
        } else if (score >= 35) {
            return 2;
        } else if (score >= 30) {
            return 1;
        } else {
            return 0;
        }
    }

    private void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            final int gradeValue = i;  // Make it effectively final
            long count = scores.stream().filter(score -> grade(score) == gradeValue).count();
            String stars = "*".repeat((int) count);
            System.out.println(gradeValue + ": " + stars);
        }
    }

    private void printAcceptancePercentage() {
        long accepted = scores.stream().filter(score -> grade(score) > 0).count();
        double acceptancePercentage = (double) accepted / scores.size() * 100;
        System.out.println("Acceptance percentage: " + acceptancePercentage);
    }
}

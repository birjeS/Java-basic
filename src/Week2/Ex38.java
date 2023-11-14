package Week2;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many?");
        int times = scanner.nextInt();

        while (times > 0) {
            printText();
            times--;
        }

        scanner.close();
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}

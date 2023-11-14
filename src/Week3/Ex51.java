package Week3;
import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        int index = 0;
        while (index < name.length()) {
            System.out.println((index + 1) + ". character: " + name.charAt(index));
            index++;
        }
    }
}

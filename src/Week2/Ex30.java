package Week2;
import java.util.Scanner;
public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int limit = scanner.nextInt();

        int i = 1;
        while (i <= limit) {
            System.out.println(i);
            i++;
        }

        scanner.close();
    }
}

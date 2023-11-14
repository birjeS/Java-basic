package Week6;
import java.util.Random;

public class Ex100 {
    public static void main(String[] args) {
        NightSky nightSky1 = new NightSky(0.1, 40, 10);
        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInLastPrint());
        System.out.println();

        NightSky nightSky2 = new NightSky(0.2, 15, 6);
        nightSky2.print();
        System.out.println("Number of stars: " + nightSky2.starsInLastPrint());
    }
}

class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public void print() {
        starsInLastPrint = 0;

        for (int i = 0; i < height; i++) {
            printLine();
            System.out.println(); // Move to the next line after printing a line
        }
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < width; i++) {
            if (random.nextDouble() <= density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}

package Week4;

public class Ex74 {
    private int number;

    public Ex74(int number) {
        this.number = number;
    }

    public int multiply(int otherNumber) {
        return this.number * otherNumber;
    }

    public static void main(String[] args) {
        // Example of usage
        Ex74 threeMultiplier = new Ex74(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Ex74 fourMultiplier = new Ex74(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
}

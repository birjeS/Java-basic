package Week4;

public class Ex73 {
    private String name;
    private double price;
    private int amount;

    public Ex73(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }

    public static void main(String[] args) {
        // Example of usage
        Ex73 banana = new Ex73("Banana", 1.1, 13);
        banana.printProduct();
    }
}




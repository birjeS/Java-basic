package Week4;

public class Ex75 {
    private int value;   // object variable that remembers the value of the counter
    private int initialValue;  // object variable that remembers the initial value

    public Ex75(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    // Exercise 75.1: Implementing method decrease()
    // Decrease the value of the counter by one
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    // Exercise 75.2: Value remains positive
    // Change implementation so that the value does not drop below zero
    // If value is zero, do nothing
    public void decreaseWithLimit() {
        if (this.value > 0) {
            this.value--;
        }
    }

    // Exercise 75.3: Counter reset
    // Reset the value of the counter to zero
    public void reset() {
        this.value = 0;
    }

    // Exercise 75.4: Back to initial value
    // Return the counter to its initial value
    public void setInitial() {
        this.value = this.initialValue;
    }

    public static void main(String[] args) {
        // Example of usage
        Ex75 counter = new Ex75(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        // Exercise 75.2: Value remains positive
        // Output should be:
        // value: 10
        // value: 9
        // value: 8
        System.out.println();

        // Exercise 75.3: Counter reset
        // Output should be:
        // value: 2
        // value: 0
        // value: 0
        Ex75 counter2 = new Ex75(2);
        counter2.printValue();
        counter2.reset();
        counter2.printValue();
        counter2.decreaseWithLimit();
        counter2.printValue();
        System.out.println();

        // Exercise 75.4: Back to initial value
        // Output should be:
        // value: 100
        // value: 99
        // value: 98
        // value: 0
        // value: 100
        Ex75 counter3 = new Ex75(100);
        counter3.printValue();
        counter3.decrease();
        counter3.printValue();
        counter3.decrease();
        counter3.printValue();
        counter3.reset();
        counter3.printValue();
        counter3.setInitial();
        counter3.printValue();
    }
}

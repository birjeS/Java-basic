package Week5;

public class Ex84 {
    public static class Counter {
        private int value;
        private boolean check;

        public Counter(int startingValue, boolean check) {
            this.value = startingValue;
            this.check = check;
        }

        public Counter(int startingValue) {
            this(startingValue, false);
        }

        public Counter(boolean check) {
            this(0, check);
        }

        public Counter() {
            this(0, false);
        }

        public int value() {
            return this.value;
        }

        public void increase() {
            increase(1);
        }

        public void decrease() {
            decrease(1);
        }

        public void increase(int increaseAmount) {
            if (increaseAmount > 0) {
                this.value += increaseAmount;
            }
        }

        public void decrease(int decreaseAmount) {
            if (decreaseAmount > 0) {
                if (this.check && this.value - decreaseAmount < 0) {
                    this.value = 0;
                } else {
                    this.value -= decreaseAmount;
                }
            }
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter(5, true);
        Counter counter2 = new Counter(10);
        Counter counter3 = new Counter(true);
        Counter counter4 = new Counter();

        System.out.println(counter1.value());  // 5
        System.out.println(counter2.value());  // 10
        System.out.println(counter3.value());  // 0
        System.out.println(counter4.value());  // 0

        counter1.increase();
        counter2.decrease();
        counter3.increase(8);
        counter4.decrease(3);

        System.out.println(counter1.value());  // 6
        System.out.println(counter2.value());  // 9
        System.out.println(counter3.value());  // 8
        System.out.println(counter4.value());  // 0
    }
}

package Week5;

public class Ex89 {
    public static class BoundedCounter {
        private int value;
        private int upperLimit;

        public BoundedCounter(int upperLimit) {
            this.upperLimit = upperLimit;
            this.value = 0;
        }

        public void next() {
            if (value < upperLimit) {
                value++;
            } else {
                value = 0;
            }
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            if (value >= 0 && value <= upperLimit) {
                this.value = value;
            }
        }

        @Override
        public String toString() {
            return String.format("%02d", value);
        }
    }

    public static class Clock {
        private BoundedCounter hours;
        private BoundedCounter minutes;
        private BoundedCounter seconds;

        public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
            this.hours = new BoundedCounter(23);
            this.minutes = new BoundedCounter(59);
            this.seconds = new BoundedCounter(59);

            this.hours.setValue(hoursAtBeginning);
            this.minutes.setValue(minutesAtBeginning);
            this.seconds.setValue(secondsAtBeginning);
        }

        public void tick() {
            seconds.next();

            if (seconds.getValue() == 0) {
                minutes.next();

                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }

        @Override
        public String toString() {
            return hours + ":" + minutes + ":" + seconds;
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}

package Week7;

import java.util.ArrayList;

public class Ex4 {
    public static class Thing {
        private String name;
        private int weight;

        public Thing(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public String toString() {
            return name + " (" + weight + " kg)";
        }
    }

    public static class Suitcase {
        private int maxWeight;
        private ArrayList<Thing> things;

        public Suitcase(int maxWeight) {
            this.maxWeight = maxWeight;
            this.things = new ArrayList<>();
        }

        public void addThing(Thing thing) {
            if (totalWeight() + thing.getWeight() <= maxWeight) {
                things.add(thing);
            }
        }

        public String toString() {
            if (things.isEmpty()) {
                return "empty (0 kg)";
            } else if (things.size() == 1) {
                return "1 thing (" + totalWeight() + " kg)";
            } else {
                return things.size() + " things (" + totalWeight() + " kg)";
            }
        }

        public void printThings() {
            for (Thing thing : things) {
                System.out.println(thing);
            }
        }

        public int totalWeight() {
            int sum = 0;
            for (Thing thing : things) {
                sum += thing.getWeight();
            }
            return sum;
        }

        public Thing heaviestThing() {
            if (things.isEmpty()) {
                return null;
            }

            Thing heaviest = things.get(0);
            for (Thing thing : things) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }
    }

    public static class Container {
        private int maxWeight;
        private ArrayList<Suitcase> suitcases;

        public Container(int maxWeight) {
            this.maxWeight = maxWeight;
            this.suitcases = new ArrayList<>();
        }

        public void addSuitcase(Suitcase suitcase) {
            if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
                suitcases.add(suitcase);
            }
        }

        public String toString() {
            if (suitcases.isEmpty()) {
                return "empty (0 kg)";
            } else if (suitcases.size() == 1) {
                return "1 suitcase (" + totalWeight() + " kg)";
            } else {
                return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
            }
        }

        public void printThings() {
            for (Suitcase suitcase : suitcases) {
                suitcase.printThings();
            }
        }

        public int totalWeight() {
            int sum = 0;
            for (Suitcase suitcase : suitcases) {
                sum += suitcase.totalWeight();
            }
            return sum;
        }
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(i * 10);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
}

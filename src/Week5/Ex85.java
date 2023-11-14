package Week5;

public class Ex85 {
    public static class Person {
        private String name;
        private int age;
        private int height;
        private int weight;

        public Person(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public int getWeight() {
            return this.weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    public static class Reformatory {
        private int totalWeightsMeasured;

        public int weight(Person person) {
            // returns the weight of the parameter
            totalWeightsMeasured++;
            return person.getWeight();
        }

        public void feed(Person person) {
            // increases the weight of its parameter by one
            person.setWeight(person.getWeight() + 1);
        }

        public int totalWeightsMeasured() {
            return totalWeightsMeasured;
        }
    }

    public static void main(String[] args) {
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);

        System.out.println("");

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

        System.out.println("total weights measured " + eastHelsinkiReformatory.totalWeightsMeasured());
    }
}

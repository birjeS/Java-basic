package Week5;

public class Ex87 {
    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        // Exercise 87.1: Larger
        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));       // false
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));   // true

        // Exercise 87.2: Price difference
        System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));        // 71600
        System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));    // 35400

        // Exercise 87.3: more expensive than
        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));       // false
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));   // true
    }
}

class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // Exercise 87.1: Larger
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    // Exercise 87.2: Price difference
    public int priceDifference(Apartment otherApartment) {
        int thisApartmentPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherApartmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(thisApartmentPrice - otherApartmentPrice);
    }

    // Exercise 87.3: more expensive than
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int thisApartmentPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherApartmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return thisApartmentPrice > otherApartmentPrice;
    }
}

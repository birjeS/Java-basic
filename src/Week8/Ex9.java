package Week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));

        // Exercise 9.2
        VehicleRegister vehicleRegister = new VehicleRegister();
        System.out.println(vehicleRegister.add(reg1, "Alice")); // true
        System.out.println(vehicleRegister.add(reg1, "Bob"));   // false
        System.out.println(vehicleRegister.get(reg1));          // Alice
        System.out.println(vehicleRegister.delete(reg1));       // true
        System.out.println(vehicleRegister.get(reg1));          // null

        // Exercise 9.3
        vehicleRegister.add(reg1, "Alice");
        vehicleRegister.add(reg2, "Bob");
        vehicleRegister.add(reg3, "Charlie");

        vehicleRegister.printRegistrationPlates();
        vehicleRegister.printOwners();
    }
}

class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        return this.country.equals(compared.country) && this.regCode.equals(compared.regCode);
    }

    @Override
    public int hashCode() {
        return this.country.hashCode() + this.regCode.hashCode();
    }
}

class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> uniqueOwners = new ArrayList<>();

        for (String owner : owners.values()) {
            if (!uniqueOwners.contains(owner)) {
                uniqueOwners.add(owner);
                System.out.println(owner);
            }
        }
    }
}

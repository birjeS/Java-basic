package Week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();

        TextUserInterface ui = new TextUserInterface(scanner, airport);
        ui.start();
    }
}

class Plane {
    private String id;
    private int capacity;

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return id + " (" + capacity + " ppl)";
    }
}

class Flight {
    private Plane plane;
    private String departureAirportCode;
    private String destinationAirportCode;

    public Flight(Plane plane, String departureAirportCode, String destinationAirportCode) {
        this.plane = plane;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    @Override
    public String toString() {
        return plane.getId() + " (" + plane.getCapacity() + " ppl) (" +
                departureAirportCode + "-" + destinationAirportCode + ")";
    }
}

class Airport {
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public Airport() {
        this.planes = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public void addPlane(String id, int capacity) {
        Plane plane = new Plane(id, capacity);
        planes.add(plane);
    }

    public void addFlight(String planeId, String departureAirportCode, String destinationAirportCode) {
        Plane plane = getPlaneById(planeId);
        if (plane != null) {
            Flight flight = new Flight(plane, departureAirportCode, destinationAirportCode);
            flights.add(flight);
        }
    }

    public Plane getPlaneById(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
}

class TextUserInterface {
    private Scanner scanner;
    private Airport airport;

    public TextUserInterface(Scanner scanner, Airport airport) {
        this.scanner = scanner;
        this.airport = airport;
    }

    public void start() {
        while (true) {
            System.out.println("Choose operation:\n[1] Add airplane\n[2] Add flight\n[x] Exit");
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            }
        }

        flightService();
    }

    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        airport.addPlane(id, capacity);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeId = scanner.nextLine();
        System.out.print("Give departure airport code: ");
        String departureAirportCode = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationAirportCode = scanner.nextLine();

        airport.addFlight(planeId, departureAirportCode, destinationAirportCode);
    }

    private void flightService() {
        while (true) {
            System.out.println("\nChoose operation:\n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit");
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equals("x")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlaneInfo();
            }
        }
    }

    private void printPlanes() {
        for (Plane plane : airport.getPlanes()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : airport.getFlights()) {
            System.out.println(flight);
        }
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeId = scanner.nextLine();
        Plane plane = airport.getPlaneById(planeId);

        if (plane != null) {
            System.out.println(plane);
        }
    }
}

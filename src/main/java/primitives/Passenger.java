package primitives;

import component.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Primitive
 */
public class Passenger implements Component {

    private Baggage baggage;
    private static List<Passenger> passengers = new ArrayList<>();
    private String name;
    private static int passengerCount;

    public Passenger(int baggageWeight) {
        baggage = new Baggage(baggageWeight);
        passengers.add(this);
        passengerCount++;
        name = String.valueOf( passengerCount);
    }

    @Override
    public int getBaggageWeight() {
        return baggage.getBaggageWeight();
    }

    @Override
    public void remove() {
        System.out.println("Please input passenger's name for removing:");
        String name = new Scanner(System.in).nextLine();
        passengers.removeIf(passenger -> passenger.getName().equals(name));
        baggage.remove();
        System.out.println(name + " has been removed");
    }

    public String getName() {
        return name;
    }
}

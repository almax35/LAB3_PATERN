package composites;

import component.Component;
import primitives.Passenger;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Composite
 */
public class EconomyClass implements Component {
    // each passenger has baggage (load limit: from 0 to 20 kg)
    public static final int PASSENGER_LIMIT = 150;
    List<Passenger> passengers = new ArrayList<>(PASSENGER_LIMIT);

    @Override
    public void add() {
            passengers.add(new Passenger(20));
        }


    @Override
    public int getBaggageWeight() {
        int totalWeight = 0;
        for (var passenger : passengers) {
            totalWeight += passenger.getBaggageWeight();
        }
        return totalWeight;
    }

    @Override
    public void remove() {
        System.out.println("Please input passenger's name for removing:");
        String name = new Scanner(System.in).nextLine();
        passengers.removeIf(passenger -> passenger.getName().equals(name));
        System.out.println(name + " has been removed");
    }
}

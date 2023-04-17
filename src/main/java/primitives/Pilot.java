package primitives;

import component.Component;

import java.util.ArrayList;
import java.util.List;

/*
Primitive
 */
public class Pilot implements Component {
    private static final List<Pilot> pilots = new ArrayList<>();
    // has no baggage

    @Override
    public void add() {
        pilots.add(new Pilot());
        System.out.println("Pilot has been successfully added");
    }

    @Override
    public void remove() {
        if (pilots.size() >= 1) {
            pilots.remove(pilots.size() - 1);
            System.out.println("Pilot has been removed");
        } else {
            System.out.println("All pilots are removed");
        }
    }
}

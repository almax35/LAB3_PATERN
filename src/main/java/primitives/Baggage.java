package primitives;

import component.Component;

/*
Primitive
 */
public class Baggage implements Component {
    private final int weight;

    public Baggage(int weight) {
        this.weight = weight;
    }

    @Override
    public int getBaggageWeight() {
        return weight;
    }
}

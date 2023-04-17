package primitives;

import component.Component;

import java.util.ArrayList;
import java.util.List;

/*
Primitive
 */
public class Stewardess implements Component {

    private static final List<Stewardess> stewardesses = new ArrayList<>();


    public void add() {
        stewardesses.add(new Stewardess());
        System.out.println("Stewardess has been successfully added");
    }


    public void remove() {
        if (stewardesses.size() >= 1) {
            stewardesses.remove(stewardesses.size() - 1);
            System.out.println("Stewardess has been removed");
        } else {
            System.out.println("All stewardesses are removed");
        }
    }
}

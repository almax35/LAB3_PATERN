package component;

public interface Component {
    default void add() {
    }

    default void remove() {
    }

    default int getBaggageWeight() {
        return 0;
    }
}

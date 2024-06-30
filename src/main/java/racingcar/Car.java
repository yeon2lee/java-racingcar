package racingcar;

import java.util.Random;

public class Car implements Comparable<Car> {
    private final String name;
    private int position = 1;

    public Car(final String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int run(final int number) {
        if (number >= 4) {
            this.position++;
        }
        return this.position;
    }

    @Override
    public int compareTo(final Car c) {
        return c.getPosition() - position;
    }
}

package racingcar.domain;

import racingcar.view.ResultView;

import java.util.*;

public class Racing {
    private final List<Car> cars;
    private final int tryCount;

    public Racing(final List<Car> cars, final int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public List<Car> getWinners() {
        Collections.sort(cars);
        final int max = cars.get(0).getPosition();

        final List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == max) {
                winners.add(car);
            }
        }
        return winners;
    }

    private int getRandomNo() {
        final Random random = new Random();
        return random.nextInt(10);
    }

    public void race() {
        ResultView.printResult(cars, 0);
        for (int i = 1; i <= tryCount; i++) {
            for (Car car : cars) {
                car.run(getRandomNo());
            }
            ResultView.printResult(cars, i);
        }
    }

}

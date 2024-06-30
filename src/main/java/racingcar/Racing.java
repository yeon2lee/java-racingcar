package racingcar;

import java.util.*;

public class Racing {
    private List<Car> cars;
    private int tryCount;

    public Racing(List<Car> cars, int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public List<Car> getWinners() {
        Collections.sort(cars);
        int max = cars.get(0).getPosition();

        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == max) {
                winners.add(car);
            }
        }
        return winners;
    }

    public int getRandomNo() {
        Random random = new Random();
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

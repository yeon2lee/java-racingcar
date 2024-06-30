package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        List<Car> cars = InputView.getCarNames();
        int tryCount = InputView.getTryCount();
        System.out.println(tryCount);

        Racing racing = new Racing(cars, tryCount);
        racing.race();

        ResultView.printWinners(racing.getWinners());
    }

}

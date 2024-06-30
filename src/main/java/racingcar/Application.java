package racingcar;

import racingcar.domain.Car;
import racingcar.domain.Racing;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        final List<Car> cars = InputView.getCarNames();
        final int tryCount = InputView.getTryCount();
        System.out.println(tryCount);

        final Racing racing = new Racing(cars, tryCount);
        racing.race();

        ResultView.printWinners(racing.getWinners());
    }

}

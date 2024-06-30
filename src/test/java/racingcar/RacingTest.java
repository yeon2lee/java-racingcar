package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {

    @Test
    public void 자동차_전진() throws Exception {
        Car car1 = new Car("pobi", 3);
        Car car2 = new Car("crong", 3);
        Car car3 = new Car("honux", 1);
        List<Car> cars = Arrays.asList(
                car1, car2, car3
        );
        Racing racing = new Racing(cars, 0);
        racing.race();

        assertThat(racing.getWinners()).contains(car1, car2);
    }
}
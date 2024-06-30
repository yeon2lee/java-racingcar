package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void 랜덤숫자가_4이상일때만_움직인다() {
        Car car = new Car("nayeon");
        assertThat(car.run(0)).isEqualTo(1);
        assertThat(car.run(1)).isEqualTo(1);
        assertThat(car.run(2)).isEqualTo(1);
        assertThat(car.run(3)).isEqualTo(1);

        assertThat(car.run(4)).isEqualTo(2);
        assertThat(car.run(5)).isEqualTo(3);
        assertThat(car.run(6)).isEqualTo(4);
        assertThat(car.run(7)).isEqualTo(5);
        assertThat(car.run(8)).isEqualTo(6);
        assertThat(car.run(9)).isEqualTo(7);
    }
}
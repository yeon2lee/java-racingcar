import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.Car;
import racingcar.Racing;
import racingcar.ResultView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ApplicationTest {

    private ByteArrayOutputStream outputStreamCaptor;

    protected void systemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @BeforeEach
    void setUp() {
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    protected String getOutput() {
        // ByteArrayOutputStream의 toString은 기본 문자집합을 사용하여 버퍼의 내용을 문자열 디코딩 바이트로 변환해줍니다.
        return outputStreamCaptor.toString();
    }

    @Test
    public void 우승자_발표() throws Exception {
        List<Car> cars = Arrays.asList(
                new Car("pobi", 6),
                new Car("crong", 3),
                new Car("honux", 1)
        );
        Racing racing = new Racing(cars, 0);
        racing.race();
        ResultView.printWinners(racing.getWinners());

        assertThat(getOutput()).contains("pobi : ------", "pobi가 최종 우승했습니다.");
    }

    @Test
    public void 공동_우승자_발표() throws Exception {
        List<Car> cars = Arrays.asList(
                new Car("pobi", 6),
                new Car("crong", 6),
                new Car("honux", 1)
        );
        Racing racing = new Racing(cars, 0);
        racing.race();
        ResultView.printWinners(racing.getWinners());

        assertThat(getOutput()).contains("pobi : ------", "crong : ------", "pobi, crong가 최종 우승했습니다.");
    }

}
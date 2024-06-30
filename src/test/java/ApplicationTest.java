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
    
}
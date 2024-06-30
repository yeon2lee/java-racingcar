package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scan = new Scanner(System.in);

    public static List<Car> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] splited = scan.next().split(",");

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < splited.length; i++) {
            cars.add(new Car(splited[i]));
        }
        return cars;
    }

    public static int getTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scan.nextInt();
    }
}

package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class ResultView {

    public static void printWinners(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        sb.append(winners.get(0).getName());
        for (int i = 1; i < winners.size(); i++) {
            Car winner = winners.get(i);
            sb.append(", " + winner.getName());
        }
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb.toString());
    }

    public static void printResult(List<Car> cars, int order) {
        StringBuilder sb = new StringBuilder();
        if (order == 0) {
            System.out.println("\n실행 결과");
        }
        for (Car car : cars) {
            sb.append(car.getName() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                sb.append("-");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

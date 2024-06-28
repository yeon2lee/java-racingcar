import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        List<Racing> racings = inputRacing();
        int count = inputCount();

        carRacing(racings, count);

        printResult(racings);
    }

    private static List<Racing> inputRacing() {
        Scanner scan = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] splited = scan.next().split(",");

        List<Racing> racings = new ArrayList();
        for (int i = 0; i < splited.length; i++) {
            racings.add(new Racing(splited[i]));
        }
        return racings;
    }

    private static int inputCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        return scan.nextInt();
    }

    private static void carRacing(List<Racing> racings, int count) {
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                System.out.println("\n실행 결과");
            } else {
                System.out.println();
            }
            for (Racing racing : racings) {
                racing.moveCar();
                racing.printResult();
            }
        }
    }

    private static void printResult(List<Racing> racings) {
        String result = "\n최종 우승자 : ";
        Collections.sort(racings);

        result += racings.get(0).getName();
        int max = racings.get(0).getDistance();
        for (int i = 1; i < racings.size(); i++) {
            Racing r = racings.get(i);
            if (r.getDistance() >= max) {
                result += ", " + r.getName();
            }
        }
        System.out.println(result);
    }

}

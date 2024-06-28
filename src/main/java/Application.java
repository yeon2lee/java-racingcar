import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        List<Racing> racings = inputRacing();
        int count = inputCount();
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

}

package PFMidExamRetake12August2020;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingTourist = Integer.parseInt(scanner.nextLine());
        int[] wagonState = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int countOfWagon = wagonState.length;
        int freeSits = 0;

        for (int i = 0; i < countOfWagon; i++) {
            freeSits = 4 - wagonState[i];
            while (freeSits != 0 && waitingTourist > 0) {
                freeSits--;
                waitingTourist--;
            }
            wagonState[i] = 4 - freeSits;
            if (waitingTourist == 0 && wagonState[countOfWagon-1] == 4) {
                printStatusOfWagon(wagonState);
                break;
            }else if (waitingTourist == 0) {
                System.out.printf("The lift has empty spots!%n");
                printStatusOfWagon(wagonState);
                break;
            }
        }
        if (waitingTourist != 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingTourist);
            printStatusOfWagon(wagonState);
        }
    }

    private static void printStatusOfWagon(int[] wagonState) {
        for (int j = 0; j < wagonState.length; j++) {
            System.out.printf(wagonState[j] + " ");
        }
          }
}

package PFMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequenceOfElements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");
        int numbersOfMove = 0;
        while (!input[0].equals("end")) {
            int firstIndex = Integer.parseInt(input[0]);
            int secondIndex = Integer.parseInt(input[1]);
            numbersOfMove++;
            if (firstIndex == secondIndex ||
                    firstIndex < 0 || firstIndex >= sequenceOfElements.size()
                    || secondIndex < 0 || secondIndex >= sequenceOfElements.size()) {
                // add numbers "-{number of moves until now}a"
                String toAdd = "-"+numbersOfMove + "a";
                sequenceOfElements.add((sequenceOfElements.size() / 2), toAdd);
                sequenceOfElements.add(((sequenceOfElements.size() / 2) + 1), toAdd);

                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (sequenceOfElements.get(firstIndex).equals(sequenceOfElements.get(secondIndex))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", sequenceOfElements.get(firstIndex));

                    if (firstIndex > secondIndex) {
                        sequenceOfElements.remove(firstIndex);
                        sequenceOfElements.remove(secondIndex);
                    } else {
                        sequenceOfElements.remove(secondIndex);
                        sequenceOfElements.remove(firstIndex);

                    }
                } else {
                    System.out.printf("Try again!%n");
                }

            }

            if (sequenceOfElements.size() == 0) {
                System.out.printf("You have won in %d turns!", numbersOfMove);
                break;
            }
            input = scanner.nextLine().split(" ");
        }
        if (input[0].equals("end")) {
            System.out.printf("Sorry you lose :(%n");
            for (int i = 0; i < sequenceOfElements.size(); i++) {
                System.out.print(sequenceOfElements.get(i) + " ");
            }
        }
    }
}

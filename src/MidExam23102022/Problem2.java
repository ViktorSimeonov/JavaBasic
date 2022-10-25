package MidExam23102022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("Finish")) {
            switch (command[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    int numberToBeRemoved = Integer.parseInt(command[1]);
                    //boolean yesWeFindTheNumberToBeRemoved = false;
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == numberToBeRemoved) {
                            numbers.remove(i);
                            // yesWeFindTheNumberToBeRemoved = true;
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int numberToBeReplaced = Integer.parseInt(command[1]);
                    int valueToBeReplaced = Integer.parseInt(command[2]);
                    //boolean yesWeFindTheNumberToBeReplaced = false;
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == numberToBeReplaced) {
                            numbers.set(i, valueToBeReplaced);
                            //yesWeFindTheNumberToBeReplaced = true;
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int valueLessThenThisNumber = Integer.parseInt(command[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if(numbers.get(i)<valueLessThenThisNumber){
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }

    }
}

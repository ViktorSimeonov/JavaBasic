package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_ManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<String> command = Arrays.asList(scanner.nextLine().split(" "));
        int sum = 0;
        while (!command.get(0).equals("end")) {
            switch (command.get(0)) {
                case "Contains":
                    if (numberList.contains(Integer.parseInt(command.get(1)))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command.get(1).equals("even")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) % 2 == 0) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                    } else if (command.get(1).equals("odd")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) % 2 != 0) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    for (int i = 0; i < numberList.size(); i++) {
                        sum = sum + numberList.get(i);
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    if (command.get(1).equals(">=")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) >= Integer.parseInt(command.get(2))) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                    } else if (command.get(1).equals(">")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) > Integer.parseInt(command.get(2))) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                    } else if (command.get(1).equals("<")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) < Integer.parseInt(command.get(2))) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                    } else if (command.get(1).equals("<=")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) <= Integer.parseInt(command.get(2))) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("error");
                    break;
            }
            command = Arrays.asList(scanner.nextLine().split(" "));
        }
    }
}

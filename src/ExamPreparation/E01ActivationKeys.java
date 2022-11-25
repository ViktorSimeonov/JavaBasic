package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        List<String> command = Arrays.stream(scanner.nextLine().split(">>>"))
                .collect(Collectors.toList());
        while (!command.get(0).equals("Generate")) {

            switch (command.get(0)) {
                case "Contains":
                    if(activationKey.contains(command.get(1))){
                        System.out.printf("%s contains %s%n",activationKey,command.get(1));
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(command.get(2));
                    int endIndex = Integer.parseInt(command.get(3));
                    if(command.get(1).equals("Upper")){
                        String toUpper = activationKey.substring(startIndex,endIndex);
                        String upperLetter = activationKey.substring(startIndex,endIndex).toUpperCase();
                        activationKey=activationKey.replace(toUpper, upperLetter);
                        System.out.println(activationKey);
                    } else if (command.get(1).equals("Lower")) {
                        String toLower = activationKey.substring(startIndex,endIndex);
                        String lowerLetter = activationKey.substring(startIndex,endIndex).toLowerCase();
                        activationKey=activationKey.replace(toLower, lowerLetter);
                        System.out.println(activationKey);
                    }

                    break;
                case "Slice":
                    int startIndexSlice = Integer.parseInt(command.get(1));
                    int endIndexSlice = Integer.parseInt(command.get(2));
                    String subStringStart = activationKey.substring(0, startIndexSlice);
                    String subStringEnd = activationKey.substring(endIndexSlice, activationKey.length());
                    activationKey = subStringStart+subStringEnd;
                    System.out.println(activationKey);
                    break;

            }


            command = Arrays.stream(scanner.nextLine().split(">>>")).
                    collect(Collectors.toList());
        }
        System.out.printf("Your activation key is: %s%n",activationKey);
    }
}

package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).
                collect(Collectors.toList());
        while (!command.get(0).equals("end")) {
            switch (command.get(0)) {
                case "Delete":
                    boolean isElement=true;
                    while(isElement){
                     isElement= numbers.remove(Integer.valueOf(Integer.parseInt(command.get(1))));

                    }
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(command.get(2)),Integer.parseInt(command.get(1)));
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).
                    collect(Collectors.toList());
        }
         for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
    }
}

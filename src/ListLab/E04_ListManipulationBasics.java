package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInteger = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<String> commandAndIndex = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (!commandAndIndex.get(0).equals("end")) {
            switch (commandAndIndex.get(0)) {
                case "Add":
                    listInteger.add(Integer.parseInt(commandAndIndex.get(1)));
                    break;
                case "Remove":
                    listInteger.remove(Integer.valueOf(Integer.parseInt(commandAndIndex.get(1))));
                    break;
                case "RemoveAt":
                    listInteger.remove(Integer.parseInt(commandAndIndex.get(1)));

                    break;
                case "Insert":
                    listInteger.add(Integer.parseInt(commandAndIndex.get(2)),Integer.parseInt(commandAndIndex.get(1)));
                    break;

            }
            commandAndIndex = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i)+ " ");
        }
    }
}


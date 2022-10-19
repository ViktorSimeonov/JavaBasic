package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> items = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();
        List<Double> input = Arrays.stream(scanner.nextLine().split(" ")).
                map(Double::parseDouble).collect(Collectors.toList());
    }
}

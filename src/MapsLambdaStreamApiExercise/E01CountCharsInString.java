package MapsLambdaStreamApiExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //String input = scanner.nextLine().replaceAll("\\s+");
        LinkedHashMap<Character, Integer> symbolsCount = new LinkedHashMap<>();
        for (Character symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            } else {
                symbolsCount.put(symbol, symbolsCount.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

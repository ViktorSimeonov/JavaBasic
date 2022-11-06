package MapsLambdaStreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class L03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().
                split(" ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> oddOccurrences = new LinkedHashMap<>();
        for (int i = 0; i < input.size(); i++) {
            String currentInput = input.get(i).toLowerCase();
            if (!oddOccurrences.containsKey(currentInput)) {
                oddOccurrences.put(currentInput, 1);
            } else {
                oddOccurrences.put(currentInput, oddOccurrences.get(currentInput) + 1);
            }

        }

        List<String> occurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : oddOccurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                occurrences.add(entry.getKey());
            }
        }
        /*for (int i = 0; i < occurrences.size(); i++) {
            System.out.printf("%s", occurrences.get(i));
            if(i<occurrences.size()-1){
                System.out.printf(", ");
            }
        }*/
        //ПРИНТИРАНЕТО СТАВА С String.join
        System.out.println(String.join(", ", occurrences));
    }
}

package MapsLambdaStreamApi;

import java.util.*;

public class L02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
                //  wo rds.get(word).add(synonym);

            }
            words.get(word).add(synonym);

        }
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));

        }
    }
}

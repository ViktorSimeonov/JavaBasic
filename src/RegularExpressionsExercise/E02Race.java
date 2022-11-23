package RegularExpressionsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class E02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameParticipant = scanner.nextLine();
        List<String> names = Arrays.stream(nameParticipant.split(", ")).collect(Collectors.toList());
        HashMap<String, Integer> data = new HashMap<>();
        for (String name : names) {
            data.put(name, 0);
        }
        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            String currentNumber = "";

            String nameOfParticipant = "";
            int currentNumberDigit = 0;
            int sum = 0;
            char[] symbolsOfInput = input.toCharArray();
            for (int i = 0; i < input.length(); i++) {
                int current = symbolsOfInput[i];
                if (current >= 47 && current <= 57) {
                    char letter = (char) current;
                    currentNumber += letter;
                } else if (current >= 65 && current <= 90 || current >= 97 && current <= 122) {
                    char letter = (char) current;
                    nameOfParticipant += letter;
                }


            }
            //System.out.println(currentNumber);
            //System.out.println(nameOfParticipant);
            //събирам всички цифри на числото
            int bigNumber = Integer.parseInt(currentNumber);
            for (int j = 0; j < currentNumber.length() - 1; j++) {
                while (bigNumber > 0) {
                    sum += bigNumber % 10;
                    bigNumber = bigNumber / 10;
                }
            }
            if (data.containsKey(nameOfParticipant)) {
                int newResult = data.get(nameOfParticipant) + sum;
                data.put(nameOfParticipant, newResult);
            }
            input = scanner.nextLine();
        }
        /*for (Map.Entry<String, Integer> stringIntegerEntry : data.entrySet()) {
            System.out.printf("%s %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());

        }*/

        //сортираме по дистанция в descending order
        //comparingByValue -> ascending order
        List<String>top3Names =data.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))// сортирали сме по value (дистанция) в намаляващ ред
                .limit(3)//оставяме само първите 3 записа
                .map(entry ->entry.getKey())//на всеки от трите записа взимаме ключа (име на играча)
                .collect(Collectors.toList());// {"George", "Peter", "Tom"}

        System.out.println("1st place: "+top3Names.get(0));
        System.out.println("2nd place: "+top3Names.get(1));
        System.out.println("3rd place: "+top3Names.get(2));



    }
}

package MapsLambdaStreamApiExercise;

import java.util.*;

public class E10SoftUniExamResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("-+");
        //LinkedHashMap<String,Integer> languageResult = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> names = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageCount = new LinkedHashMap<>();
        while (!input[0].equals("exam finished")) {
            // check if someone is banned ???
            if (input.length == 2) {
                names.remove(input[0]);
                input = scanner.nextLine().split("-+");
                continue;
            }
            String name = input[0];
            String language = input[1];
            int result = Integer.parseInt(input[2]);
            //count the language
            languageCount = countOfLanguage(language, languageCount);
            // check if the name exist
            if (!names.containsKey(name)) {
                names.put(name, new LinkedHashMap<>());
                names.get(name).put(language, result);
            } else {
                //compare old and new result, and take the bigger!!!
                String currentLanguage = language;
                int maxResult = result;
                for (Map.Entry<String, LinkedHashMap<String, Integer>> stringLinkedHashMapEntry : names.entrySet()) {
                    if (stringLinkedHashMapEntry.getKey().equals(name)) {
                        LinkedHashMap<String, Integer> languageInAMap = stringLinkedHashMapEntry.getValue();
                        for (Map.Entry<String, Integer> stringIntegerEntry : languageInAMap.entrySet()) {

                                if (maxResult < stringIntegerEntry.getValue()) {
                                    maxResult = stringIntegerEntry.getValue();

                              /*  if (currentLanguage.equals(stringIntegerEntry.getKey())) {
                                if (maxResult < stringIntegerEntry.getValue()) {
                                    maxResult = stringIntegerEntry.getValue();
                                }*/
                            }
                        }
                    }
                }
                names.get(name).put(currentLanguage, maxResult);
               /* int previousResult = names.get(name).get(language);
                if (previousResult < result) {
                    names.get(name).put(language, result);

                }*/

            }
            input = scanner.nextLine().split("-+");
        }
        System.out.println("Results:");
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : names.entrySet()) {
            //System.out.printf("%s | %s",entry.getKey(),entry.getValue().get(entry.getKey()));
            System.out.printf("%s | ", entry.getKey());
            //System.out.printf("%s | %s",entry.getKey(),entry.getValue());
            HashMap<String, Integer> resultAfter = entry.getValue();
            int maxValueNoMatterTheLanguage = 0;
            for (Map.Entry<String, Integer> stringIntegerEntry : resultAfter.entrySet()) {
                if(maxValueNoMatterTheLanguage<stringIntegerEntry.getValue()){
                   maxValueNoMatterTheLanguage= stringIntegerEntry.getValue();
                }
            }
            System.out.printf("%d%n", maxValueNoMatterTheLanguage);
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> stringIntegerEntry : languageCount.entrySet()) {
            System.out.printf("%s - %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }

    }

    private static LinkedHashMap<String, Integer> countOfLanguage(String language, LinkedHashMap<String, Integer> languageCount) {
        if (!languageCount.containsKey(language)) {
            languageCount.put(language, 1);
        } else {
            languageCount.put(language, languageCount.get(language) + 1);
        }
        return languageCount;
    }
}

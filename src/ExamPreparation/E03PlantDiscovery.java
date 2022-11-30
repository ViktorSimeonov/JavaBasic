package ExamPreparation;


import java.util.*;
import java.util.stream.Stream;

public class E03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] plantCount = scanner.nextLine().split("<->");
            String plantName = plantCount[0];
            int plantRarity = Integer.parseInt(plantCount[1]);
            plantsRarity.put(plantName, plantRarity);
            plantsRating.put(plantName, new ArrayList<>());


        }
        //чета си командите, като прочитам целия стринг и после го разделям
        //два пъти

        String[] input = scanner.nextLine().split(": ");
        String command = input[0];
        String[] plantAction = input[1].split(" - ");
        if (!plantsRarity.containsKey(plantAction[0])) {
            System.out.println("error");
        } else {
            while (!command.equals("Exhibition")) {
                switch (command) {
                    //•	"Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
                    case "Rate":
                        String plant = plantAction[0];
                        //rating or rarity
                        Double plantRatingToAdd = Double.parseDouble(plantAction[1]);
                        //plantsRating.get(plant).(plantRatingToAdd);
                        plantsRating.get(plant).add(plantRatingToAdd);


                        break;
                    //•	"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
                    case "Update":
                        plant = plantAction[0];
                        //rating or rarity
                        int plantRarityNew = Integer.parseInt(plantAction[1]);
                        plantsRarity.put(plant, plantRarityNew);
                        break;
                    //•	"Reset: {plant}" – remove all the ratings of the given plant
                    case "Reset":
                        //remove all the rating of plant
                        plant = plantAction[0];
                        plantsRating.get(plant).clear();
                        //след изтриване на всички стойности запазвам една стойност да е 0

                        plantsRating.get(plant).add(0.0);


                        break;

                }
                input = scanner.nextLine().split(":\s+");
                command = input[0];
            }
        }
        //String[] plantAction = input[1].split("-\s+");
        System.out.println("Plants for the exhibition:");
/*
        Stream<Map.Entry<K,V>> sorted =
                map.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));*/

        Stream<Map.Entry<String, Integer>> sorted = plantsRarity.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).
        forEach(entry-> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),plantsRating.get(entry.getKey())));

        for (Map.Entry<String, Integer> entry : plantsRarity.entrySet()) {
            System.out.printf("- %s; Rarity: %d; ", entry.getKey(), entry.getValue());
            List<Double> currentRatingPlant = plantsRating.get(entry.getKey());
            double sum = 0;
            for (int i = 0; i < currentRatingPlant.size(); i++) {
                sum += currentRatingPlant.get(i);
            }
            double currentAAverage = sum / currentRatingPlant.size();
            System.out.printf("Rating: %.2f%n", currentAAverage);

        }
    }
}

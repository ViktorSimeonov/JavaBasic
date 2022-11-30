package MapsLambdaStreamApiExercise;

import java.util.*;

public class E03LegendaryFarming {
    public static class ResultOfGreaterThen250 {
        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public boolean isObtained() {
            return obtained;
        }

        public void setObtained(boolean obtained) {
            this.obtained = obtained;
        }

        private int result;
        private boolean obtained;
        private String material;

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public ResultOfGreaterThen250(int result, boolean obtained, String material) {
            this.result = result;
            this.obtained = obtained;
            this.material = material;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Map<String, List<Integer>> items = new LinkedHashMap<>();

        while (input.length != 1) {
            for (int i = 0; i < input.length; i += 2) {
                //the quantity of the material
                Integer quantity = Integer.parseInt(input[i]);
                //the material :)
                String material = input[i + 1].toLowerCase();
                //if the Key doesn't exist
                if (!items.containsKey(material)) {
                    items.put(material, new ArrayList<>());
                   // System.out.println(items.get(material));
                    items.get(material).add(quantity);
                    ResultOfGreaterThen250 result = isGraterThen250(items.get(material), material);
                    if (result.isObtained()) {
                        //print the obtained Material
                        System.out.printf("%s obtained!%n", result.getMaterial());
                        // int sumOf = sumOfMaterial(items.get(material), material);
                        items.put(material, new ArrayList<>());
                        items.get(material).add(result.getResult());
                        // now we have to print the rest of key materials

                        printAllTheShards(items);


                        printAllTheFragments(items);


                        printAllTheMotes(items);


                        printAllTheRest(items);
                        return;

                    }
                } else {
                    items.get(material).add(quantity);
                    //we have to calculate the quantity in the List
                    ResultOfGreaterThen250 result = isGraterThen250(items.get(material), material);
                    if (result.isObtained()) {
                        //print the obtained Material
                        System.out.printf("%s obtained!%n", result.getMaterial());
                        // int sumOf = sumOfMaterial(items.get(material), material);
                        items.put(material, new ArrayList<>());
                        items.get(material).add(result.getResult());
                        // now we have to print the rest of key materials

                        printAllTheShards(items);


                        printAllTheFragments(items);


                        printAllTheMotes(items);


                        printAllTheRest(items);
                        return;

                    }
                }

            }
            input = scanner.nextLine().split(" ");

        }
        printAllTheShards(items);


        printAllTheFragments(items);


        printAllTheMotes(items);


        printAllTheRest(items);
    }

    private static void printAllTheRest(Map<String, List<Integer>> items) {
        Map<String, Integer> restMaterials = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : items.entrySet()) {
            List<Integer> listWithValueOfMaterial = entry.getValue();
            int sumOfRestMaterial = getSumOfMaterial(listWithValueOfMaterial);
            System.out.printf("%s: %d%n", entry.getKey(), sumOfRestMaterial);
        }

    }

    private static int getSumOfMaterial(List<Integer> listWithValueOfMaterial) {
        int sum = 0;
        for (int i = 0; i < listWithValueOfMaterial.size(); i++) {
            sum += listWithValueOfMaterial.get(i);

        }
        return sum;
    }


    private static void printAllTheMotes(Map<String, List<Integer>> items) {
        int sum = 0;
        if (items.get("motes") == null) {
            System.out.println("motes: 0");
        } else {
            for (int i = 0; i < items.get("motes").size(); i++) {
                sum += items.get("motes").get(i);
            }
            System.out.printf("motes: %d%n", sum);
            items.remove("motes");
        }
    }

    private static void printAllTheFragments(Map<String, List<Integer>> items) {
        int sum = 0;
        if (items.get("fragments") == null) {
            System.out.println("fragments: 0");
        } else {

            for (int i = 0; i < items.get("fragments").size(); i++) {
                sum += items.get("fragments").get(i);
            }
            System.out.printf("fragments: %d%n", sum);
            items.remove("fragments");
        }


    }

    private static void printAllTheShards(Map<String, List<Integer>> items) {
        int sum = 0;
        items.get("shards");
        if (items.get("shards") == null) {
            System.out.println("shards: 0");
        } else {
            for (int i = 0; i < items.get("shards").size(); i++) {
                sum += items.get("shards").get(i);
            }
            System.out.printf("shards: %d%n", sum);
            items.remove("shards");
        }
    }

    private static int sumOfMaterial(List<Integer> items, String material) {
        int sumOfMaterial = 0;
        for (int i = 0; i < items.size(); i++) {
            sumOfMaterial += items.get(i);
        }
        return sumOfMaterial;
    }

    public static ResultOfGreaterThen250 isGraterThen250(List<Integer> integers, String material) {
        int sum = 0;
        int rest = 0;
        boolean obtained = false;
        String whatWeBuy = "";
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }

        if (sum >= 250) {
            rest = sum - 250;
            obtained = true;
        }
        switch (material) {
            case "shards":
                whatWeBuy = "Shadowmourne";
                break;
            case "fragments":
                whatWeBuy = "Valanyr";
                break;
            case "motes":
                whatWeBuy = "Dragonwrath";
                break;
        }

        ResultOfGreaterThen250 result = new ResultOfGreaterThen250(rest, obtained, whatWeBuy);
        return result;

    }
}

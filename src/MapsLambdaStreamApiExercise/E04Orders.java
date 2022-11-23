package MapsLambdaStreamApiExercise;

import java.util.*;

public class E04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String productName = input[0];
        LinkedHashMap<String, List<Double>> productsList = new LinkedHashMap<>();
        while (!productName.equals("buy")) {
            double priceProduct = Double.parseDouble(input[1]);
            double countProducts = Double.parseDouble(input[2]);
            if (productsList.containsKey(productName)) {
                productsList.get(productName).set(0,priceProduct);
                double currentCountOfProducts = productsList.get(productName).get(1);
                productsList.get(productName).set(1,countProducts+currentCountOfProducts);

            } else {
                productsList.put(productName, new ArrayList<>());
                productsList.get(productName).add(priceProduct);
                productsList.get(productName).add(countProducts);
            }

            input = scanner.nextLine().split(" ");
            productName = input[0];
        }
        for (String product : productsList.keySet()) {
            double price = productsList.get(product).get(0);
            double count = productsList.get(product).get(1);
            System.out.printf("%s -> %.2f%n",product,(price*count));

        }
    }
}

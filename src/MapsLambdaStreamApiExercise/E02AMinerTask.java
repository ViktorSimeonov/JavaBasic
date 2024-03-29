package MapsLambdaStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();

        LinkedHashMap<String,Integer> resourceQuantity= new LinkedHashMap<>();
        while (!resource.equals("stop")){
            Integer quantity = Integer.parseInt(scanner.nextLine());
            if(!resourceQuantity.containsKey(resource)){
                resourceQuantity.put(resource, quantity);
            }else {
                Integer currentQuantity = resourceQuantity.get(resource);
                resourceQuantity.put(resource, currentQuantity+quantity);
            }

            resource =scanner.nextLine();

        }
        for (Map.Entry<String, Integer> entry : resourceQuantity.entrySet()) {

            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

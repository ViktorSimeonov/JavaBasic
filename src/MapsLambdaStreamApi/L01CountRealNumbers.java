package MapsLambdaStreamApi;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L01CountRealNumbers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
               .mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,Integer> counts = new TreeMap<>();
        for (double number : numbers) {
            if(!counts.containsKey(number)){
                counts.put(number, 1);
            }else {
                counts.put(number,counts.get(number)+1);
            }

        }
        //System.out.println(counts.size());
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat decimalFormat = new DecimalFormat("#.########");
            System.out.printf("%s -> %d%n",decimalFormat.format(entry.getKey()), entry.getValue());
        }

    }
}

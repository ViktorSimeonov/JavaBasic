package MapsLambdaStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read an array of strings, and take only words whose length is even. Print each word on a new line.
        String[] input = scanner.nextLine().split(" ");
             List<String> resultList =  Arrays.stream(input).
                     filter(e -> e.length()%2==0).collect(Collectors.toList());
  // String[] input = Arrrays.stream(scanner.nextLine().split(" ")).
        // filter(w-> w.lenght() % 2 ==0).
        // toArray(String[] :: new);
        for (String s : resultList) {
            System.out.printf("%s%n",s);
        }
    }
}

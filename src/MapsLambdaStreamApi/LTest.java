package MapsLambdaStreamApi;

import java.util.*;

public class LTest {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "bye","the",
                "quick", "brown", "lazy", "fox","jumps","dog" );
        Map<Integer,String> sizeOfWords = new TreeMap<>();
        for (int i = 0; i < words.size(); i++) {
            int size = words.get(i).length();
           if(sizeOfWords.containsKey(size)){
              sizeOfWords.put(size, sizeOfWords.get(size)+", "+words.get(i));
           }
           else {
               sizeOfWords.put(size, words.get(i));
           }
        }
        for (Map.Entry<Integer, String> entry : sizeOfWords.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),entry.getValue());
        }
    }
}

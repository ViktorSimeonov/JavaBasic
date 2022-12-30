package ITTalentsTests;

import java.util.Scanner;

public class Task2LongestStringTestOne {
    public static void main(String[] args) {
        // input Today is a good day for test.Weekend is coming.The room is white.The axe is sharp.
        Scanner sc = new Scanner(System.in);
        String[] sentences = sc.nextLine().trim().split("\\.");
        theLongestWordSentence(sentences);
        
    }
    static void theLongestWordSentence(String[] arr){
        int theLongestWord=0;
        int indexOfLongestWord=0;
        int theLongestSentence=0;
        int indexOfTheLongestSentence=0;
        for (int i = 0; i < arr.length; i++) {
            String[] current = arr[i].split(" ");
            if(current.length>theLongestSentence){
                theLongestSentence=current.length;
                indexOfTheLongestSentence=i;
            }
            for (int j = 0; j < current.length; j++) {
                if(current[j].length()>theLongestWord){
                    theLongestWord=current[j].length();
                    indexOfLongestWord=i;
                }
            }
        }
        System.out.printf("Total sentences: %d%n",arr.length);
        System.out.printf("Longest sentence:%s.%n",arr[indexOfTheLongestSentence]);
        System.out.printf("The longest word:%s.%n",arr[indexOfLongestWord]);
    }
}

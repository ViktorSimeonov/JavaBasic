package ITTalentsHomework5String;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
       /* Задача 7:
        Да се състави програма, която чете набор от думи разделени с
        интервал.
                Като резултат да се извеждат броя на въведените думи, както и броя
        знаци в най-дългата дума.
                Пример: asd fg hjkl
        Изход: 3 думи, най-дългата е с 4 символа.*/
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        System.out.print(input.length+" words, ");
        theLonger(input);
    }
    static void theLonger(String[] input){
        int theLongest=input[0].length();
        for (int i = 1; i < input.length; i++) {
            if(input[i].length()>theLongest){
                theLongest=input[i].length();
            }
        }
        System.out.printf(" the longest is with %d symbols",theLongest);
    }
}

package ITTalentsLesson5Arrays;

import java.util.Scanner;

public class FindTheMostOccurrenceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Моля въведете брой редове");
        System.out.printf("row;");
        int row = sc.nextInt();
        System.out.println("Моля въведете брой колони");
        System.out.printf("col;");
        int col = sc.nextInt();*/

       /* int size;
        do {
            System.out.println("Моля задайете размера на матрицата");
            size=sc.nextInt();
        }while (size<=0);
        int row=size;
        int col=size;
        int[][] table = new int[row][col];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println("Моля въведете:"+"["+i+"]"+"["+j+"]");
                table[i][j] = sc.nextInt();
            }
            System.out.println();
        }*/
        int[][] table = {
                {1,2,3},
                {2,2,3},
                {3,2,2}
        };
        int currentNumber=0;
        int maxNumber=0;
        int occurrence=0;
        int maxOccurrences=0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                currentNumber=table[i][j];
                occurrence=0;
                for (int k = 0; k < table.length; k++) {
                    for (int l = 0; l < table[k].length; l++) {
                        if(currentNumber==table[k][l]){
                            occurrence++;

                        }


                    }
                    if(k==table.length-1){
                        if(occurrence>maxOccurrences){
                            maxOccurrences=occurrence;
                            maxNumber=currentNumber;
                        }
                    }

                }
            }

        }
        System.out.println("Най много повторения има числото : "+maxNumber+" : "+maxOccurrences+" срещания");
    }
}

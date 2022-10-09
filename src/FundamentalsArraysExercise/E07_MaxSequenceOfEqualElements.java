package FundamentalsArraysExercise;


import java.util.Arrays;
import java.util.Scanner;

public class E07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int equalNumber = 0;
        int biggerEqual = 0;
        boolean equalStatus = true;
        int firstEqual = numbers[0];


        for (int index = 0; index < numbers.length; index++) {
            //взимам първото число от масива
            int currentNumber = numbers[index];
            int equal = 0;
            for (int i = index + 1; i < numbers.length; i++) {
                //проверявам текущото число с всички други който са му от дясно
                //ако са равни увеличавам equal с 1
                if (currentNumber == numbers[i]) {
                    equal++;
                    equalStatus = false;
                    //ако всички числа са еднакви в масива 4 4 4 4
                    if (equal == numbers.length - 1) {
                        biggerEqual = equal;
                        equalNumber = currentNumber;
                        break;
                    }
                    //
                } else {
                    //махам равното за да го изтествам
                    if (equal > biggerEqual) {
                        biggerEqual = equal;
                        equalNumber = currentNumber;
                    } else {
                        break;
                    }
                }
            }
        }
        //ако няма никаква поредица от еднакви принтирам първото число от масива

        if (equalStatus) {
            System.out.println(firstEqual);
        } else {
            for (int i = 0; i <= biggerEqual; i++) {
                System.out.printf("%d ", equalNumber);
            }
        }
    }
}

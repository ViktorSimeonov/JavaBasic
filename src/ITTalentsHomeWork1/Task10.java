package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
      /*  Задача 10: Трябва да се напълни цистерна с вода. Имате 2 кофи с
        вместимост 2 и 3 литра и ги ползвате едновременно. Да се
        състави програма, която по даден обем извежда как ще прелеете
        течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
        кофите. Кофите не могат да се ползват с частично количество
        вода, но могат инцидентно да се ползват по една.
        – Входни данни: естествено число от интервала [10..9999].
        Пример: 107
        – Изход: 21 пъти по 2 литра, 21 пъти по 3 литра, допълнително
        кофа от 2 литра
        %d пъти по %d литра, %d пъти по %d литра, допълнително кофа от %d литра
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете едно естествено число в интервала [10..99] a=");
        int a = Integer.parseInt(scanner.nextLine());
        int evenBucket = 2;
        int oddBucket = 3;
        int resultEven = (a / (evenBucket + oddBucket));
        int resultOdd = (a / (evenBucket + oddBucket));
        int modularResult = a % (evenBucket + oddBucket);
        int additionalBuckedEven = 0;
        int additionalBuckedOdd = 0;
        switch (modularResult) {
            case 0:
                System.out.printf("%d пъти по %d литра, %d пъти по %d литра",
                        resultEven, evenBucket, resultOdd, oddBucket);

                break;
            case 1:
                additionalBuckedEven = -1;
                additionalBuckedOdd = 1;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d пъти по %d литра, %d пъти по %d литра, допълнително %d кофa от %d литра",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedOdd, oddBucket);
                break;
            case 2:
                additionalBuckedEven = 1;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d пъти по %d литра, %d пъти по %d литра, допълнително %d кофa от %d литра",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedEven, evenBucket);
                break;
            case 3:
                additionalBuckedOdd = 1;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d пъти по %d литра, %d пъти по %d литра, допълнително %d кофa от %d литра",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedOdd, oddBucket);
                break;
            case 4:
                additionalBuckedEven = -1;
                additionalBuckedOdd = 2;
                resultEven += additionalBuckedEven;
                resultOdd += additionalBuckedOdd;
                System.out.printf("%d пъти по %d литра, %d пъти по %d литра, допълнително %d кофa от %d литра",
                        resultEven, evenBucket, resultOdd, oddBucket, additionalBuckedOdd, oddBucket);
                break;

        }

    }
}


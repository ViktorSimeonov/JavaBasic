package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Задача 21:
        Дадено е наредено тесте карти.
                Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
                Поп, Асо.
                Наредбата по цвят на картите е: спатия, каро, купа, пика.
                Да се създаде програма, чрез която се въвежда N - число от
        интервала [1..51] и се извеждат въведения номер карта и
        останалите по-големи карти от тестето.
                Пример: 47.
        Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
        пика*/
        System.out.println("Моля въведете едно естествено число в интервала [1..51] ");
        System.out.print("n=");
        int n = scanner.nextInt();
        while (n < 1 || n >= 53) {
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            System.out.print("n=");
            n = scanner.nextInt();
        }

        ///count of the deck with card
       /* int deck = 4;
        int cartInDeckFromSameColour = 13;*/

        int allCard = 52;
        int restCard = 52 - (n - 1);
        //start rest card

        int startColour ;
        if(restCard%4==0){
            startColour = 1;
        }else {
            startColour =5-(restCard % 4);
        }
        int startKart = 0;
        if (restCard % 4 != 0) {
            startKart = 2 + (13 - ((restCard / 4) + 1));
        } else {
            startKart = 2 + (13 - (restCard / 4));

        }

        // принтира картите
        for (int i = startKart; i <= 14; i++) {
            //притнира боята
            //if(restDeck)
            if(startColour!=0){
                for (int j = startColour; j <= 4; j++) {
                    if (i == 11) {
                        System.out.printf("Вале");
                    } else if (i == 12) {
                        System.out.printf("Дама");
                    } else if (i == 13) {
                        System.out.printf("Поп");
                    } else if (i == 14) {
                        System.out.printf("Асо");
                    } else {
                        System.out.print(i);
                    }
                    if (j == 1) {
                        System.out.printf(" спатия,");
                    } else if (j == 2) {
                        System.out.printf(" каро,");

                    } else if (j == 3) {
                        System.out.printf(" купа,");

                    } else {
                        if(i==14){

                            System.out.printf(" пика");
                        }else {

                            System.out.printf(" пика,");
                        }

                    }
                }
            }else {
                for (int j = 1; j <= 4; j++) {
                    if (i == 11) {
                        System.out.printf("Вале");
                    } else if (i == 12) {
                        System.out.printf("Дама");
                    } else if (i == 13) {
                        System.out.printf("Поп");
                    } else if (i == 14) {
                        System.out.printf("Асо");
                    } else {
                        System.out.print(i);
                    }
                    if (j == 1) {
                        System.out.printf(" спатия,");
                    } else if(j == 2) {
                        System.out.printf(" каро,");

                    } else if (j == 3) {
                        System.out.printf(" купа,");

                    } else {
                        System.out.printf(" пика,");

                    }
                }
            }

            startColour=0;

        }

    }
}

package ITTalentsTests;

import java.util.Scanner;

public class Task1CardPairsTestOne {
    public static void main(String[] args) {
        /*
        3 A T 4 Q
        J Q Q A A
        1 T Q K A
        * */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int tries = 0;
        while (count <5) {
            boolean invalidCard = true;
            tries++;
            System.out.println("Please gave a hand ( 5 card ) ");
            char[] hands = new char[5];

            String[] cards = sc.nextLine().trim().split(" ");
            int currentCard = 0;
            for (int i = 0; i < cards.length; i++) {
                currentCard = cards[i].charAt(0);
                if (currentCard <= 57 && currentCard >= 50 || currentCard == 65
                        || currentCard == 74 || currentCard == 75 || currentCard == 81|| currentCard == 84) {
                    hands[i] = cards[i].charAt(0);

                } else {
                    System.out.println("Invalid cards given");
                    invalidCard = false;
                    break;
                }
            }
            boolean weFindOnePair=false;
            if (invalidCard) {
                for (int j = 0; j < hands.length; j++) {
                    currentCard = hands[j];
                    for (int k = j + 1; k < hands.length; k++) {
                        if (currentCard == hands[k]) {
                            count++;
                            weFindOnePair=true;
                            break;
                        }

                    }
                    if(weFindOnePair){
                        break;
                    }

                }

            }
        }

        System.out.println(tries);
    }
}


package PFMidExamOur;

import java.util.Arrays;
import java.util.Scanner;

public class GuineaPig01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();*/
        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double guineaWeight = Double.parseDouble(scanner.nextLine()) * 1000;
        int day = 0;
        boolean enoughFood = false;
        while (food > 0 && cover > 0 && hay > 0) {
           if(enoughFood){
               break;
           }
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < 3; i++) {
                    day++;
                    food -= 300;

                    if (i == 1) {
                        hay = hay - (food * 0.05);
                    } else if (i == 2) {
                        cover = cover - (guineaWeight / 3);
                    }
                }
            }
            if (day == 30) {
                enoughFood = true;
                break;
            }

        }
        if (enoughFood) {

            System.out.printf("food:%.2f , hay:%.2f cover:%.2f", food, hay, cover);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
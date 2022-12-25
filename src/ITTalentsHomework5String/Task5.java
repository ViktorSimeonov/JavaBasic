package ITTalentsHomework5String;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /*   Задача 5:
        Да се състави програма, чрез която се въвеждат 2 редици от знаци
                (думи).
                Ако в двете редици участва един и същи знак, да се изведе на екрана
        първата редица хоризонтално, а втората вертикално, така че да се
        пресичат в общия си знак.
                Ако редиците нямат общ знак да се изведе само уведомително
        съобщение.
                Пример :
                helicopter catapult
        Пример :
        helicopter catapult
      h
      e
catapult
      i
      c
      o
      p
      t
      e
      r

      */
        System.out.println("Please insert the two strings with symbols");
        String[] str = sc.nextLine().split(" ");
        String str1 = str[0];
        String str2 = str[1];
        int rowToCross = -1;
        int colToCross = -1;
        boolean equal = false;
        for (int i = 0; i < str1.length(); i++) {
            if (equal) {
                break;
            }
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    rowToCross = i;
                    colToCross = j;
                    equal = true;
                    break;
                }
            }
        }
        for (int i = 0; i <str1.length(); i++) {
            if(i==rowToCross){
                for (int j = 0; j < str2.length(); j++) {
                    System.out.print((char)str2.charAt(j));

                }
                System.out.println();
            }else {
                for (int j = 0; j<colToCross; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++) {
                    System.out.println((char)str1.charAt(i));
                }
            }
        }
    }
}

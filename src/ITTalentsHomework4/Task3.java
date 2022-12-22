package ITTalentsHomework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Задача 3:
        Да се състави програма, чрез която се въвеждат последователно две
        редици от символи без интервали.
                Програмата да извежда съобщение за резултата от сравнението им по
        позиции.
                Пример: хипопотам, хипопотук
        Изход:
        Двата низа са с равна дължина.
        Разлика по позиции:
        8 а-у
        9 м-к*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the firs string with symbols");
        String str1 =sc.nextLine();
        System.out.println("Please insert second string with symbols");
        String str2 =sc.nextLine();
        int compareLong=0;
        if(str1.length()==str2.length()){
            System.out.println("The two string are with equal length");
            compareLong=str1.length();
        } else if (str1.length()>str2.length()) {
            System.out.println("First String is longer the second");
            compareLong=str2.length();
        }else {
            System.out.println("Second string is longer");
            compareLong=str1.length();
        }
        for (int i = 0; i < compareLong; i++) {
            if(str1.charAt(i)!=str2.charAt(i)){
                System.out.print(i+" "+(char)str1.charAt(i)+"-"+(char)str2.charAt(i));
                System.out.println();
            }

        }
    }
}

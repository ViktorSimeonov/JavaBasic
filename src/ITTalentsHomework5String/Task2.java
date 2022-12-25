package ITTalentsHomework5String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* Задача 2:
        Да се състави програма, чрез която от клавиатурата се въвеждат
        последователно две думи с дължина 10-20 знака.
                Програмата да размени първите им 5 знака и да изведе дължината на
        по-дългата, както и новото им съдържание.
        Пример: uchilishe uchenik
        Изход: 9 uchenishe*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write two strings containing between 10-20 sym.");
       /* String str = "";
        boolean isJustLetters = true;
        boolean notTwoStrings = true;
        boolean notEnoughLong = true;
        do {
            str = sc.nextLine();
            isJustLetters = true;
            String[] splitStr = str.split(" ");
            if (splitStr.length != 2) {
                System.out.println("You didn't insert two String. Please try again!!");
                notTwoStrings = false;
                continue;
            } else {
                if ((splitStr[0].length() < 10 || splitStr[0].length() > 21) || (splitStr[1].length() < 10 || splitStr[1].length() > 21)){
                    System.out.println("Please try again the strings are not enough long ");
                    notEnoughLong=false;
                }
            }


        } while (!((str.length() < 41) && notTwoStrings&&notEnoughLong));*/
        String[] splitString = sc.nextLine().split(" ");
        String firstString = splitString[0];
        String secondString = splitString[1];
        String firstPartFirstString = firstString.substring(0, 5);
        String secondPartFirstString = firstString.substring(5);
        String firstPartSecondString = secondString.substring(0, 5);
        String secondPartSecondSting = secondString.substring(5);
        firstString = firstPartSecondString + secondPartFirstString;
        secondString = firstPartFirstString + secondPartSecondSting;
        if(firstString.length()>secondString.length()){
            System.out.println(firstString.length()+" "+ firstString);
        }else {
            System.out.print(secondString.length()+" "+secondString);
        }
    }
}

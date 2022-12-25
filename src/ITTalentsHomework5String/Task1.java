package ITTalentsHomework5String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Задача 1:
        Да се състави програма, чрез която се въвеждат два низа съдържащи
        до 40 главни и малки букви.
        Като резултат на екрана да се извеждат низовете само с главни и само
        с малки букви.
                Пример: Abcd Efgh
        Изход: ABCD abcd EFGH efgh*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write two strings containing up to 40 upper and lower case letters.");
        String str="";
        String space =" ";

        boolean isJustLetters=true;
        boolean notTwoStrings=true;
        do {str=sc.nextLine();
            isJustLetters=true;
            String[] splitStr = str.split(" ");
            if(splitStr.length!=2){
                System.out.println("You didn't insert two String. Please try again!!");
                notTwoStrings=false;
                continue;
            }
            if(str.length()>81){
                System.out.println("Try again! The Strings are too long");
            }
            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i);
                if(!((str.charAt(i)>=97&&str.charAt(i)<=122)||(str.charAt(i)>=65&&str.charAt(i)<=90)||(str.charAt(i)==32))){
                    System.out.println("Please write two strings containing just upper and lower letter");
                    isJustLetters=false;
                    break;
                }
            }

        }while (!((str.length()<80)&&isJustLetters&&notTwoStrings));
        String[] splitStr=str.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            System.out.print(splitStr[i].toUpperCase()+" ");
            System.out.print(splitStr[i].toLowerCase()+" ");

        }
    }
}

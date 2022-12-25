package ITTalentsHomework5String;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Задача 8:
        Да се състави програма, чрез която се въвежда ред от символи
        (стринг, низ).
        Програмата да изведе на екрана дали въведения стринг е палиндром,
        т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
        Вход: капак
        Изход: да.
                Вход: тенджера
        Изход: не.
        input: kayak
        */
        String input = sc.nextLine();
        boolean isPalindrome=true;
        for (int i = 0; i < input.length()/2; i++) {
            if(!(input.charAt(i)==input.charAt(input.length()-1-i))){
                 isPalindrome=false;
            }
        }
        System.out.println(isPalindrome? "is Palindrome" : "is Not Palindrome");
    }
}

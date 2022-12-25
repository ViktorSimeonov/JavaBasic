package ITTalentsHomework5String;

import java.util.Scanner;

public class Task9_1 {
    public static void main(String[] args) {
        /*Задача 9:
        Да се състави програма, чрез която по въведен низ съдържащ букви,
        цифри, знак минус '-' се извежда сборът на въведените числа като се
        отчита знакът '-' пред съответното число.
                Вход: asd-12sdf45-56asdf100
        Изход:
        -12
        45
                -56
        100
        Сума = 77*/
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;
        int numberFromString=0;
        String number = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 45) {
                while ((input.charAt(i) == 45) || (input.charAt(i) >= 48 && input.charAt(i) <= 57)) {
                    number += (char) input.charAt(i);
                    i++;
                }
                System.out.println(number);
                numberFromString=StringToInt(number);
                sum =sum -numberFromString;
                number = "";
                numberFromString=0;
            } else if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                boolean stopWhile =true;
                while (input.charAt(i) >= 48 && input.charAt(i) <= 57 && stopWhile ) {
                    number += (char) input.charAt(i);
                    i++;
                    if (i == input.length()) {
                       stopWhile=false;
                        i--;
                    }
                }
                System.out.println(number);
                numberFromString=StringToInt(number);
                sum += numberFromString;
                number = "";
                numberFromString=0;
               if(stopWhile){
                   i--;

               }

            }

        }
        System.out.println(sum);
    }
    static int StringToInt(String number){
                int ourNumber=0;
        int currentNumber =0;
        for (int i = 0; i<number.length(); i++) {
            switch (number.charAt(i)){
                case 48:
                    currentNumber=0;
                    break;
                case 49:
                    currentNumber=1;
                    break;
                case 50:
                    currentNumber=2;
                    break;
                case 51:
                    currentNumber=3;
                    break;
                case 52:
                    currentNumber=4;
                    break;
                case 53:
                    currentNumber=5;
                    break;
                case 54:
                    currentNumber=6;
                    break;
                case 55:
                    currentNumber=7;
                    break;
                case 56:
                    currentNumber=8;
                    break;
                case 57:
                    currentNumber=9;
                    break;

            }
            ourNumber+=currentNumber*Math.pow(10,number.length()-1-i);
        }
        //System.out.println(ourNumber);
        return ourNumber;
    }
}

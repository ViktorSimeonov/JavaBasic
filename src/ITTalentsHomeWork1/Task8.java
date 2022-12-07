package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
//    ? Задача 8: Да се състави програма, която чете от конзолата 4-
//                цифренo естествено число от интервала [1000.. 9999]. От това
//        число се формират 2 нови 2-цифрени числа. Първото число се
//        формира от 1-та и 4-та цифра на въведеното число. Второто число
//        се формира от 2-рa - 3-та цифра на въведеното число. Като
//        резултат да се изведе дали 1-то ново число e по-малко, равно или
//        по-голямо от 2-то число.
//        – Пример: 3332 Изход: по-малко (32<33)
//        – Пример: 1144 Изход: равни (14=14)
//        – Пример: 9875 Изход: по-голямо (95>87)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете естествено число от интервала [1000.. 9999]");
        int number = scanner.nextInt();
        //4-та цифра
        int fourthDigit = number%10;
        number=number/10;
        int thirdDigit = number%10;
        number=number/10;
        int secondDigit = number%10;
        number=number/10;
        int firstDigit = number%10;
        int firstNum = (firstDigit*10)+fourthDigit;
        int secondNum = (secondDigit*10)+thirdDigit;
        System.out.print("Изход:");
        if(firstNum>secondNum){
            System.out.printf("по-голямо (%d>%d)",firstNum,secondNum);
        } else if (firstNum==secondNum) {
            System.out.printf(" равни (%d=%d)",firstNum,secondNum);

        }else {
            System.out.printf("по-малко (%d<%d)",firstNum,secondNum);

        }

    }
}

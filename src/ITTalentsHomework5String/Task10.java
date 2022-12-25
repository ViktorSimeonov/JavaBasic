package ITTalentsHomework5String;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Задача 10:
        Да се състави програма, която по даден низ връща друг,
                символите, на който са получени като към всеки код на символ
        от ASCII таблицата е добавеното числото 5 и е записан
        новополучения символ.
        Пример :
        Вход: Hello
        Изход: Mjqqt*/
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String text = "";
        char[] arrChar = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arrChar[i] = (char) (input.charAt(i) + 5);
            //System.out.print(arrChar[i]);
        }
        for (int i = 0; i < arrChar.length; i++) {
            text+=arrChar[i];
        }
        System.out.println(text);

    }
}

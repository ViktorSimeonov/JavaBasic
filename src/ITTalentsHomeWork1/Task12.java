package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Задача 12: Високосни години са всички години кратни на 4 с
        изключения столетията, но без столетия кратни на 400, т.е. 1900
        не е високосна, но 1600 и 2000 са високосни.Съставете програма,
        която по дадени ден, месец и година, отпечатва следващата дата.
        – Входни данни: три числа за ден, месец, година.
        – Пример: 28, 2, 2021
        – Изход: 1,3,2021*/
        System.out.println("Моля въведете три числа за ден, месец, година");
        String[] data = scanner.nextLine().split(", ");
        int day = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);

        //1,3,5,7,8,10,12 - 31 дни
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                day = 1;
                if (month == 12)
                    month = 1;
                year++;
            } else {
                day++;

            }
            //4,6,9,11 - 30 дни
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else {
            if (((year % 400 == 0) || (year % 100 != 0)) && (year % 4 == 0)) {
                if (day == 28) {
                    day++;
                } else if (day == 29) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            }else {
                if(day==28){
                    day=1;
                    month++;
                }else {
                    day++;
                }

            }

        }
        System.out.printf("%d,%d,%d", day, month, year);
        //2-28 дни, ако годината е кратна на 4 но без кратните на 400 ( столетията)
        /*int year400 = 1600 % 400;//високосна
        int year100 = 1600 % 100;//невисокосна
        int year4 = 1600 % 4;//високосна
        if (year400 == 0 && year4 == 0 && (year100!=0)){*/

    }

}


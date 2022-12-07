package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){
        /*Задача 2: Въведете 2 различни цели числа от конзолата. Запишете
        тяхната сума, разлика, произведение, остатък от деление и
        целочислено деление в отделни променливи и разпечатайте тези
        резултати в конзолата. Опитайте същото с числа с плаваща запетая.*/
        Scanner scanner = new Scanner(System.in);
        String percent = "%";
        System.out.println("Въведете едно цяло число а:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете второ цяло число b:" );
        int b = Integer.parseInt(scanner.nextLine());
        int sum = a+b;
        System.out.printf("Сумата на а и b e: %d+%d=%d%n",a,b,sum);
        int diff = a-b;
        System.out.printf("Разликата на а и b e: %d-%d=%d%n",a,b,diff);
        int multiplication = a*b;
        System.out.printf("Произведението на а и b e: %d*%d=%d%n",a,b,multiplication);
        int modularDivision = (a%b);
        System.out.printf("Остатък от деление на а и b e: %d%s%d=%d%n",a,percent,b,modularDivision);
        int division = a/b;
        System.out.printf("Остатък от целочислено деление на а и b e: %d/%d=%d%n",a,b,division);
        // double
        System.out.println("Въведете едно число с плаваща запетая x:");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете второ число с плаваща запетая y:" );
        double y = Double.parseDouble(scanner.nextLine());
        double sumDouble = x+y;
        System.out.printf("Сумата на а и b e: %.2f+%.2f=%.2f%n",x,y,sumDouble);
        double diffDouble = x-y;
        System.out.printf("Разликата на а и b e: %.2f-%.2f=%.2f%n",x,y,diffDouble);
        double multiplicationDouble = x*y;
        System.out.printf("Произведението на а и b e: %.2f*%.2f=%.2f%n",x,y,multiplicationDouble);
        double modularDivisionDouble = (x%y);
        System.out.printf("Остатък от деление на а и b e: %.2f%s%.2f=%.2f%n",x,percent,y,modularDivisionDouble);
        double divisionDouble = x/y;
        System.out.printf("Остатък от целочислено деление на а и b e: %.2f/%.2f=%.2f%n",x,y,divisionDouble);

    }
}

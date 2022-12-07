package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
  /*      Задача 7:Въведете 3 променливи от клавиатурата –час(целочислен тип), сума пари
                (число с плаваща запетая), дали съм здрав –булев тип.Съставете програма, която
        взема решения на базата на тези данни по следния начин:
        –ако съм болен, няма да излизам
        –ако съм здрав, ще отида на кино с приятели
        –ако имам пари, ще си купя лекарства
        –ако нямам –ще стоя вкъщи и ще пия чай
        –ако имам по - малко от 10 лв, ще отида на кафе.
                Полученото решение покажете като съобщение в конзолата.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете едно цяло число int a1=");
        System.out.println("Въведете второ различно цяло число int a2=");
        System.out.println("Въведете трето различно цяло число int a3=");
        System.out.println("Въведете трето едно реално число double a4=");
        System.out.println("Въведете въдете твърдение (True или False) boolean=");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        boolean amIHealth = scanner.nextBoolean();
        if (amIHealth) {
            System.out.println("Отивам на кино с приаятели");
        } else {
            System.out.println("Оставам вкъщи, няма да излизам");
        }
        if (money > 0) {
            System.out.println("Ще си купя лекарства");
        } else {
            System.out.println("Ще стоя въщи и ще пия чай");
        }
        if (money < 10) {
            System.out.println("Отивам на кафе");
        }

    }
}

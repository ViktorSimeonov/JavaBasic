package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
     /*   Задача 15: Да се състави програма, която да изчисли сумата на
        всички числа от 1 до въведено число N.
        Пример: 5
        Изход: 15
        Използвайте цикъл do-while.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло число по-голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        int sum =0;
        int i=1;
        do {
            sum+=i;
            i++;
            n--;
        }while (n>0);
        System.out.println(sum);
    }
}

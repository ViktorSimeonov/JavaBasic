package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

      /*  Задача 8: По зададено число n, да се изведе на екрана таблица по
        следния начин:*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно цяло число по голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        int result=n-1;
        for (int i = result; i <= (2*n+(n-2)); i = i + 2) {

            for (int j = 0; j < n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}

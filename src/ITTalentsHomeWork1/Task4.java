package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете едно цяло число a=");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете едно цяло число b=");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
        /*if(a>b){
            System.out.println(b);
            System.out.println(a);
        }else {
            System.out.println(a);
            System.out.println(b);
        }*/

    }
}

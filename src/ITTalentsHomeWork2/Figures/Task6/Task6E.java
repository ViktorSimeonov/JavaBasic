package ITTalentsHomeWork2.Figures.Task6;

import java.util.Scanner;

public class Task6E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно цяло число по голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (n+1)-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

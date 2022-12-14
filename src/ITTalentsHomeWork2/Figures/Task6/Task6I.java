package ITTalentsHomeWork2.Figures.Task6;

import java.util.Scanner;

public class Task6I {
   /* Моля въведете едно цяло число по голямо от 0
            8
                          1
                        1 2 1
                      1 2 3 2 1
                    1 2 3 4 3 2 1
                  1 2 3 4 5 4 3 2 1
                1 2 3 4 5 6 5 4 3 2 1
              1 2 3 4 5 6 7 6 5 4 3 2 1
            1 2 3 4 5 6 7 8 7 6 5 4 3 2 1

    Process finished with exit code 0*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно цяло число по голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j >0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-(i-1) ; j++) {
                System.out.print(j+" ");
            }
            for (int j = n-i; j >0 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

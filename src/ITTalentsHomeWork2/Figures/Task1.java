package ITTalentsHomeWork2.Figures;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*  # # # # #
            # # # # #
            # # # # #
            # # # # #
            # # # # #  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно цяло число по голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

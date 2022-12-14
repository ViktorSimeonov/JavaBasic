package ITTalentsHomeWork2.Figures.Task4;

import java.util.Scanner;

public class FigureC {

    /*              # # # # # # # #
                      # # # # # # #
                        # # # # # #
                          # # # # #
                            # # # #
                              # # #
                                # #
                                  # */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно цяло число по голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >i; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

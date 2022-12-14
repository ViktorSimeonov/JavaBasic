package ITTalentsHomeWork2.Figures.Task4;

import java.util.Scanner;

public class FigureG {

  /* 7
        # # # # # # #
                  #
                #
              #
            #
          #
        # # # # # # #

V



           */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно цяло число по голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
            if (i==1||i==n){
                System.out.print("# ");
            }
            else {
                if(j==(n-(i-1))){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            }
            System.out.println();
        }
    }
}

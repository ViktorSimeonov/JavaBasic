package ITTalentsHomeWork2.NumberPattern;

public class Pattern5 {
    public static void main(String[] args) {
        /*      11111
                11111
                11011
                11111
                11111*/
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == ((n / 2) + 1) && (j == ((n / 2) + 1))) {
                    System.out.print(0);
                } else {
                    System.out.print(1);

                }
            }
            System.out.println();
        }
    }
}

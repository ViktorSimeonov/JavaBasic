package ITTalentsHomeWork2.NumberPattern;

public class Pattern11 {
    public static void main(String[] args) {
       /*       12345
                12345
                12345
                12345
                12345*/
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

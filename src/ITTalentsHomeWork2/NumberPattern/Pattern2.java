package ITTalentsHomeWork2.NumberPattern;

public class Pattern2 {
    public static void main(String[] args) {
          /*11111
            00000
            11111
            00000
            11111*/
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(1);
                }
            }else {
                for (int j = 0; j < n; j++) {
                    System.out.print(0);
                }

            }
            System.out.println();
        }
    }
}

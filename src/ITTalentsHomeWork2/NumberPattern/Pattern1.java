package ITTalentsHomeWork2.NumberPattern;

public class Pattern1 {
    public static void main(String[] args) {
        /*11111
        11111
        11111
        11111
        11111*/
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}

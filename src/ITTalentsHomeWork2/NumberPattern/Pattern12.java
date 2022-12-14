package ITTalentsHomeWork2.NumberPattern;

public class Pattern12 {
    public static void main(String[] args) {
       /*       123456
                234567
                345678
                456789*/

        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

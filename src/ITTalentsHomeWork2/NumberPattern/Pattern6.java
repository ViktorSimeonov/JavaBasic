package ITTalentsHomeWork2.NumberPattern;

public class Pattern6 {
    public static void main(String[] args) {
        /*      10101
                01010
                10101
                01010
                10101*/
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }else {
                    if (j % 2 != 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }

            }
            System.out.println();
        }
    }
}

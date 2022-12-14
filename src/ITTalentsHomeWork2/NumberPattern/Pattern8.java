package ITTalentsHomeWork2.NumberPattern;

public class Pattern8 {
    public static void main(String[] args) {
        /*      10001
                01010
                00100
                01010
                10001*/

        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==i||j==(n-1-i)){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }



            }
            System.out.println();
        }
    }
}

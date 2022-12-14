package ITTalentsHomeWork2.NumberPattern;

public class Pattern9 {
    public static void main(String[] args) {
        /*      01110
                10001
                10001
                10001
                01110*/

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //принтиране на първия и последния ред
                if (i == 0 || i == n-1) {
                    if(j==0||j==n-1){
                        System.out.print(0);
                    }else {
                        System.out.print(1);
                    }

                    //принтиране на всички останали
                } else {
                    if(j==0||j==n-1){
                        System.out.print(1);
                    }else {
                        System.out.print(0);
                    }
                }

            }
            System.out.println();
        }

    }
}

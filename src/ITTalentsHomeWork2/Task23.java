package ITTalentsHomeWork2;

public class Task23 {
    public static void main(String[] args) {
       /* Пример:
        1-ви ред: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
        2-ри рeд: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9;
        ...
        9-ти ред: 9*9;*/
        int n = 1;
        while (n<10){
            for (int i = 1; i < 10; i++) {
                for (int j = i; j < 10; j++) {
                    System.out.printf("%d*%d; ",i,j);
                }
                System.out.println();
                n++;
            }


        }

    }
}

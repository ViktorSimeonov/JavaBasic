package ITTalentsHomeWork2;

public class Task3Rec {
    public static void main(String[] args) {
     /*   Задача 3: Да се изведат на екрана всички нечетни числа от -10
        до 10*/
        /*for (int i = -10; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }*/
       // printOdd(-10,10);
        printOddRec(-10,10);
    }

    static void printOddRec(int start,int end) {
        if (start == end) {
            return;
        }
        if(start%2!=0){
            System.out.println(start);
        }
        printOddRec(start+1,end);
    }

    static void printOdd(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.printf(i+" ");
            }
        }
    }
}

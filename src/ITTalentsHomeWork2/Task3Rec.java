package ITTalentsHomeWork2;

public class Task3Rec {
    public static void main(String[] args) {
     /*   ������ 3: �� �� ������� �� ������ ������ ������� ����� �� -10
        �� 10*/
        for (int i = -10; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }

    /*static void printOddRec() {
        if (i == end) {
            return;
        }
        System.out.println();
    }*/

    static void printOdd(int star, int end) {
        for (int i = star; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

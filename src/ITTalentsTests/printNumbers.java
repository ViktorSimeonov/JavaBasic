package ITTalentsTests;

public class printNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.printf(i+""+j+" ");
            }
            System.out.println();
        }
    }
}

package ITTalentsLesson9Recursion;

public class RecursionDemoFactorial {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(fact(x));

    }

    private static int  fact(int x) {
        if(x==1){
            return 1;
        }
        return x*fact(x-1);
    }

}

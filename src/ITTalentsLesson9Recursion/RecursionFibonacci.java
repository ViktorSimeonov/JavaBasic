package ITTalentsLesson9Recursion;

public class RecursionFibonacci {
    static long counter = 0;

    public static void main(String[] args) {

        int x = 48;
        System.out.println(fib(x));
        System.out.println("invocation= " + counter);
    }

    static int fib(int n) {
        counter++;
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

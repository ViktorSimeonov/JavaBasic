package ForLoop;

import java.util.Scanner;

public class E02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int bigNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int nextNum= Integer.parseInt(scanner.nextLine());
            if (nextNum>bigNum){
                bigNum=nextNum;
            }
            sum+=nextNum;
        }
        sum=sum-bigNum;
        if (sum==bigNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d",bigNum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(bigNum-sum));
        }
    }
}

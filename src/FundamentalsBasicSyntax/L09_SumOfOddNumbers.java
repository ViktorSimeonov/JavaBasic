package FundamentalsBasicSyntax;

import java.util.Scanner;

public class L09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddNum = 1;
        int result=0;
        for (int i = 1 ; i <=n ; i++) {
            result+=oddNum;
            System.out.println(oddNum);
            oddNum+=2;
        }
        System.out.printf("Sum: %d",result);
    }
}

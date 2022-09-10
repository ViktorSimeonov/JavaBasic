package FundamentalsBasicSyntax;

import java.util.Scanner;

public class L11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int start= Integer.parseInt(scanner.nextLine());
        if (start>10){
            System.out.printf("%d X %d = %d%n",num,start,(num*start));
        }
        for (int i = start; i <= 10; i++) {

            System.out.printf("%d X %d = %d%n",num,i,(num*i));

        }

    }
}

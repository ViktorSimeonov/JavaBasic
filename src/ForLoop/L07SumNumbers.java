package ForLoop;

import java.util.Scanner;

public class L07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < num; i++) {
          //  int nextNum = Integer.parseInt(scanner.nextLine());
           sum+= Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}

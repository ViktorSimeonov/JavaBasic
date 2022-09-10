package ForLoop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i);
                System.out.println(j);

            }
        }


    }
}

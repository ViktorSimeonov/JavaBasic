package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task11Pyramids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("моля, въведете цяло число");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) //outer loop for number of rows(n)
        {
            for (int j = n - i; j > 1; j--) //inner loop for spaces
            {
                System.out.print(" "); //print space
            }
            for (int j = 1; j <= 2*i+1; j++) //inner loop for number of columns
            {
                System.out.print("*"); //print star
            }
            System.out.println(); //ending line after each row
        }
        int m=n-1;
        for (int i = m; i > 0; i--) //outer loop for number of rows(n)
        {
            for (int j = m - i; j >= 0; j--) //inner loop for spaces
            {
                System.out.print(" "); //print space
            }
            for (int j = 0; j < 2*i-1; j++) //inner loop for number of columns
            {
                System.out.print("*"); //print star
            }
            System.out.println(); //ending line after each row
        }
    }


}

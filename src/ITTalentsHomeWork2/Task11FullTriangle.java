package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task11FullTriangle {
    public static void main(String[] args) {

       /* Задача 11: Въведете число N чрез конзолата и изкарайте като
        резултат следния триъгълник с височина N:*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("моля, въведете  цяло число");
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


    }
}

package FundamentalsMethods;

import java.util.Scanner;

public class E02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        grades(grade);


    }

    private static void grades(double grade) {
        if (grade >= 2 && grade < 3) {
            System.out.println("Fail");
        }if (grade >= 3 && grade < 3.5) {
            System.out.println("Poor");
        }if (grade >= 3.5 && grade < 4.5) {
            System.out.println("Good");
        }if (grade >= 4.5 && grade < 5.5) {
            System.out.println("Very good");
        }if (grade >= 5.5 && grade <=6 ) {
            System.out.println("Excellent");
        }
    }

}

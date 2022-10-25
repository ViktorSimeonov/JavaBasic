package PFMidExam05072020;

import java.util.Scanner;

public class SoftUniReception01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int studentsPerHour = employee1 + employee3 + employee2;
        int count = 0;
        boolean studentLessThenZero = true;
        while (studentsCount > 0) {
            count++;
            if (count % 4 == 0) {
            } else {
                studentsCount -= studentsPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", count);
    }
}
package FirstStepInCodingLab;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPages = Integer.parseInt(scanner.nextLine());
        int pagesHours= Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println((allPages/pagesHours)/days);
    }
}

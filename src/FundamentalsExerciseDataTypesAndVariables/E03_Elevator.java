package FundamentalsExerciseDataTypesAndVariables;

import java.util.Scanner;

public class E03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int withoutRest = persons % capacity;
        int courses;
        if (withoutRest == 0) {
            courses = persons / capacity;

        } else {
            courses = (persons / capacity) + 1;

        }
        System.out.println(courses);

    }
}

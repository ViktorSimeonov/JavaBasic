package FundamentalsExerciseDataTypesAndVariables;

import java.util.Scanner;

public class E09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int leaving = 0;
        while (yield >= 100) {
            days++;
            leaving += yield - 26;
            yield = yield - 10;

        }
        System.out.println(days);
        if ( leaving>26){
            System.out.println(leaving - 26);
        }else {

            System.out.println(leaving);
        }
    }
}

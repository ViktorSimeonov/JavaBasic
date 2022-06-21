package ConditionalStatements;

import java.util.Scanner;

public class E06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wordRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secMet = Double.parseDouble(scanner.nextLine());
        double slow = Math.floor(distance / 15) * 12.5;
        double timeIvan = distance*secMet +slow;
        if ( timeIvan < wordRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",timeIvan);
        }else
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(wordRecord-timeIvan));
    }
}

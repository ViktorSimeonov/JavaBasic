package FundamentalsExerciseDataTypesAndVariables;

import java.util.Scanner;

public class E10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nPokePower = Integer.parseInt(scanner.nextLine());
        int mPokeTargets = Integer.parseInt(scanner.nextLine());
        int yExhaustionFactor = Integer.parseInt(scanner.nextLine());
        int hitTarget = 0;
        int nPokePowerResult=nPokePower;
        while (nPokePowerResult>=mPokeTargets){
            nPokePowerResult-=mPokeTargets;
            hitTarget++;
            if (nPokePowerResult==(nPokePower/2)){
                nPokePowerResult=nPokePowerResult/yExhaustionFactor;
            }
        }
        System.out.println(nPokePowerResult);
        System.out.println(hitTarget);
    }
}

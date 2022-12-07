package ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E13HeroesOfCodeLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        //HP hit points
        Map<String, Integer> hitPoints = new HashMap<>();
        //MP mana points
        Map<String, Integer> manaPoints = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String[] hero = scanner.nextLine().split(" ");
            hitPoints.put(hero[0], Integer.parseInt(hero[1]));
            manaPoints.put(hero[0], Integer.parseInt(hero[2]));
        }
        String[] command = scanner.nextLine().split(" - ");
        String heroName = command[1];
        while (!command[0].equals("End")) {
            heroName = command[1];
            switch (command[0]) {
                case "CastSpell":
                    if (manaPoints.get(heroName) >= Integer.parseInt(command[2])) {
                        manaPoints.put(heroName, (manaPoints.get(heroName) - Integer.parseInt(command[2])));
                        //o	"{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, command[3], manaPoints.get(heroName));
                    }
                    //o	"{hero name} does not have enough MP to cast {spell name}!"
                        else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,command[3]);
                    }
                    break;
                case "TakeDamage":
                    //o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
                    hitPoints.put(heroName, (hitPoints.get(heroName) - Integer.parseInt(command[2])));
                    if (hitPoints.get(heroName) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, Integer.parseInt(command[2])
                                , command[3], hitPoints.get(heroName));
                    } else {
                        //o	"{hero name} has been killed by {attacker}!"
                        hitPoints.remove(heroName);
                        manaPoints.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n",heroName,command[3]);
                    }

                    break;
                case "Recharge":
                    int currentManaPoints = manaPoints.get(heroName);
                    if ((currentManaPoints + Integer.parseInt(command[2])) > 200) {
                        manaPoints.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - currentManaPoints);
                    } else {
                        manaPoints.put(heroName, currentManaPoints + Integer.parseInt(command[2]));
                        System.out.printf("%s recharged for %d MP!%n", heroName, Integer.parseInt(command[2]));
                    }
                    //o	"{hero name} recharged for {amount recovered} MP!"

                    break;
                case "Heal":
                    int currentHitPoints = hitPoints.get(heroName);
                    if ((currentHitPoints + Integer.parseInt(command[2])) > 100) {
                        hitPoints.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100- currentHitPoints );

                    } else {
                        hitPoints.put(heroName, currentHitPoints + Integer.parseInt(command[2]));
                        System.out.printf("%s healed for %d HP!%n", heroName, Integer.parseInt(command[2]));
                    }
                    //o	"{hero name} healed for {amount recovered} HP!"

                    break;
            }

            command = scanner.nextLine().split(" - ");
        }
        for (Map.Entry<String, Integer> entry : manaPoints.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            System.out.printf("  HP: %s%n",hitPoints.get(entry.getKey()));
            System.out.printf("  MP: %s%n",entry.getValue());
        }
    }
}

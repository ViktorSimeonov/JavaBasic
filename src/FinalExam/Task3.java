package FinalExam;

import java.util.*;
import java.util.function.DoubleFunction;
//03. Hero Recruitment
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        LinkedHashMap<String, List<String>> hero = new LinkedHashMap<>();
        String commnand = input[0];
        while (!commnand.equals("End")) {
            String heroName = input[1];
            switch (commnand) {
                case "Enroll":
                    if (hero.containsKey(heroName)) {
                        System.out.printf("%s is already enrolled.%n", heroName);


                    } else {
                        hero.put(heroName, new ArrayList<>());

                    }
                    break;
                case "Learn":
                    String spellName = input[2];
                    if (hero.containsKey(heroName)) {
                      //търся дали има SpellName във листа
                        //
                        //hero.get(heroName).contains(spellName);
                        List<String> heroList = hero.get(heroName);

                        if(hero.get(heroName).contains(spellName)){
                            System.out.printf("%s has already learnt %s.%n",heroName,spellName);
                        }else {
                            heroList.add(spellName);
                            hero.put(heroName, heroList );
                        }


                    } else {
                        System.out.printf("%s doesn't exist.%n",heroName);

                    }
                    break;
                case "Unlearn":
                    spellName = input[2];
                    if (hero.containsKey(heroName)){
                        if(hero.get(heroName).contains(spellName)){
                            //remove the spellbook
                            List<String> heroList = hero.get(heroName);
                            heroList.remove(spellName);
                            hero.put(heroName, heroList);
                        }else {
                            System.out.printf("%s doesn't know %s.%n",heroName,spellName);
                        }
                    }else {
                        System.out.printf("%s doesn't exist.%n",heroName);
                    }

                    break;

            }
            input = scanner.nextLine().split(" ");
            commnand = input[0];

        }
        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> entry : hero.entrySet()) {
            System.out.printf("== %s:",entry.getKey());

            if (entry.getValue().isEmpty()){
                System.out.println();
            }else {
                List<String> heroSpellToPrint = entry.getValue();
                for (int i = 0; i < heroSpellToPrint.size(); i++) {
                    System.out.printf(" %s",heroSpellToPrint.get(i));
                    if(i<heroSpellToPrint.size()-1){
                        System.out.printf(",");
                    }
                    //System.out.println(String.join(" ,", heroSpellToPrint.get(i)));
                }
                System.out.println();

            }
        }
    }
}

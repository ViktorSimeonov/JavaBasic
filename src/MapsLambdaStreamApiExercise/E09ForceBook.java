package MapsLambdaStreamApiExercise;

import java.lang.reflect.Array;
import java.util.*;

public class E09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String side = "";
        String user = "";
        int count = 0;
        // Key side Value user
        Map<String,List<String>> map = new HashMap<>();
        while (!input[0].equals("Lumpawaroo")){
            //command = |
            if (input[1].equals("|")) {
                side = input[0];
                user = input[2];
               //1.if there is such a group
                if(!map.containsKey(side)){
                    // create side
                    map.put(side, new ArrayList<>());
                    // 2. ако имаме такава група проверяваме дали
                    // юзера го има в някоя от групите !!!
                    //проверявам дали user exist in the Lis
                }
                boolean isExistUser = false;
                for(List<String> listUsers : map.values()){
                    if(listUsers.contains(user)){
                        isExistUser = true;
                    }
                }
                if(!isExistUser){
                    //юзера го няма в ниео една група
                    map.get(side).add(user);
                }
            } else if (input[1].equals("->")) {


            }
            input=scanner.nextLine().split(" ");
        }

    }
}



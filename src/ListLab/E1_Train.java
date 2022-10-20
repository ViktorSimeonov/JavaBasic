package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).
                collect(Collectors.toList());
        while (!command.get(0).equals("end")){
            //if it is just a number
            if(command.size()==1){
               int passengers = Integer.parseInt(command.get(0));
                for (int i = 0; i < listOfWagons.size(); i++) {
                    if((listOfWagons.get(i)+passengers)<=maxCapacity){
                        listOfWagons.set(i,(listOfWagons.get(i)+passengers));
                        break;
                    }
                } 
            }
            //if we have to add some additional
            else{
              listOfWagons.add(Integer.parseInt(command.get(1)));
            }


            command = Arrays.stream(scanner.nextLine().split(" ")).
                    collect(Collectors.toList());
        }
        for (int i = 0; i < listOfWagons.size(); i++) {
            System.out.print(listOfWagons.get(i)+" ");
        }
    }
}

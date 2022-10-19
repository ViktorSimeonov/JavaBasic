package ListLab;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public record E03_Merging() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).toList();
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).toList();
//        (firstList.size()+secondList.size())
        List<Integer> newList = Arrays.asList(new Integer[(firstList.size()+secondList.size())]);
            if(firstList.size()>secondList.size()){
                int iteration = secondList.size();
                int restIteration = newList.size()-(2*secondList.size());
                for (int i = 0; i < iteration; i++) {

                        newList.set((i*2),firstList.get(i));
                        newList.set(((i*2)+1),secondList.get(i));

                }

                for (int i = (iteration*2); i <newList.size() ; i++) {
                    newList.set(i,firstList.get(iteration));
                    iteration++;
                }
            }else { int iteration = firstList.size();
                int restIteration = newList.size()-(2*firstList.size());
                for (int i = 0; i < iteration; i++) {

                    newList.set((i*2),firstList.get(i));
                    newList.set(((i*2)+1),secondList.get(i));

                }

                for (int i = (iteration*2); i <newList.size() ; i++) {
                    newList.set(i,secondList.get(iteration));
                    iteration++;
                }

            }
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i)+ " ");
        }
    }
}

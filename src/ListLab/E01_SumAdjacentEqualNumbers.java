package ListLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> input = Arrays.stream(scanner.nextLine().split(" ")).
                map(Double::parseDouble).collect(Collectors.toList());
        //boolean equal = false;
       // int currentIndex = 0;
        for (int i = 0; i < input.size(); i++) {
            //докато текущия е равен на следващия!!
            /*if(equal){
                i=currentIndex;
            }*/
            if (i == input.size() - 1) {
                break;
            }
            while (input.get(i).equals(input.get(i + 1))) {
                double current = input.get(i);
                input.set(i, (current += input.get(i + 1)));
                input.remove(i + 1);
                //equal=true;
                // currentIndex=i;
                /*if((input.get(i-1).equals(input.get(i)))){
                    input.set(i-1,(input.get(i-1)+input.get(i)));
                    input.remove(i);
                }*/

                if (i > 0 && (input.get(i - 1).equals(input.get(i)))) {
                    input.set(i - 1, (2 * input.get(i)));
                    input.remove(i);
                }
            }
            //проверява дали текущия не е равен с предходния, преди да при положение че следващия
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double aDouble : input) {
            System.out.printf( decimalFormat.format(aDouble) + " ");

        }

    }


}


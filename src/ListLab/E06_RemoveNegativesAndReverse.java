package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int count = 0;
        int sizeAtTheStart = numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                count++;
                i=-1;
                if(numbers.size()==0){
                    break;
                }
            }
        }
        if (count == sizeAtTheStart) {
            System.out.printf("empty");
        } else {
            for (int i = numbers.size() - 1; i >= 0; i--) {
                System.out.print(numbers.get(i) + " ");
            }
        }

    }
}

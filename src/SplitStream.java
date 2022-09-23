import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class SplitStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String inputLine = scanner.nextLine();
       // String[] items = inputLine.split(" ");
        //int[] arr = Arrays.stream(items)
              //  .mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arr1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i <arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

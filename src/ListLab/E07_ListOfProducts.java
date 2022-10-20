package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class E07_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfProduct = Integer.parseInt(scanner.nextLine());
        String product ="";
        for (int i = 0; i < numOfProduct; i++) {
            product += scanner.nextLine() +" ";
        }
        List<String> listOfProduct = Arrays.stream(product.split(" ")).collect(Collectors.toList());
        //sort of the List
        Collections
        .sort(listOfProduct);
        for (int i = 1; i <=listOfProduct.size() ; i++) {
            System.out.printf("%d.%s",i,listOfProduct.get(i-1));
            System.out.println();
        }

    }
}

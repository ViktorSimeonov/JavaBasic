package ListLab;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        List<String> nameList = new ArrayList<>();
        nameList.add("Viktor");
        nameList.add("Petya");
        nameList.add("Marti");
        nameList.add("Dari");
        System.out.println(nameList);
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }
        if(nameList.contains("Petya")){
            nameList.add("Viktoria");
            System.out.println(nameList+"papa");
            if(nameList.contains("Petya")){
                nameList.add(2,"Ivo");
                System.out.println(nameList);
            }
            if(nameList.size()<9){
                nameList.set(0,"MUcho");
            }
            }
        boolean remove = nameList.remove(String.valueOf("Petya"));

        System.out.println(remove);
            //boolean isEmpty = nameList.isEmpty();
        System.out.println(nameList);

    }
}

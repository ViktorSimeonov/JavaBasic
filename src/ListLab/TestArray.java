package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        System.out.println();
        // Scanner scanner = new Scanner(System.in);
       /* List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Maria");
        names.add("George");
        // Премахва обекта!!1
        //names.remove("Maria");
        //премахва индекс
        names.remove(1);
        for (String name: names) {
            System.out.println(name);*/
        List<Integer> nums = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 60));
        //изтрива числото на мястото с индекс 2
        nums.remove(2);
        //търси дали има рисло в листа със стойност 40 и го изтрива!!!
        nums.remove(Integer.valueOf(40));
        //добавя числото 100 накрая на листа
        nums.add(100);
        //добавя на индекс 0 числото -100 и всикчи други измества назад
        nums.add(0, -100);
        //замества числото на индекс 3 с числото 15
        nums.set(3,15);
        nums.isEmpty();
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println(nums.contains(10));
    }

        /*for (int i = 0; i < names.size(); i++) {
            System.out.println(names);
        }*/
}


package ITTalentsLesson4;

public class Task1 {
    public static void main(String[] args) {
        /** Task1. Write a program that prints all numbers between -100 and 100. Then print them backwards.*/
        for (int i = -100; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 100; i >= -100; i--) {
            System.out.println(i);
        }
    }
}

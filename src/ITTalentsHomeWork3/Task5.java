package ITTalentsHomeWork3;

public class Task5 {
    public static void main(String[] args) {
       /* Задача 5:
        Напишете програма, която създава масив с 10 елемента и
        инициализира всеки от елементите със стойност, равна на индекса на
        елемента, умножен по 3.
        Да се изведат елементите на екрана.*/
        int[] arr = new int[10];
        System.out.print("[ ");
        for (int i = 0; i < 10; i++) {
            arr[i]=i*3;
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

    }
}

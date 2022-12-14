package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task3 {
  /*  Задача 3:
    Да се въведе число, след което да се създаде масив с 10
    елемента по следния начин:
    Първите 2 елемента на масива са въведеното число.
    Всеки следващ елемент на масива е равен на сбора от
    предишните 2 елемента в масива.
    След това изведете масива .*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете едно цяло число по голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        int[] arr = new int[10];
        arr[0]=n;
        arr[1]=n;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

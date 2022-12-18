package ITTalentsHomeWork3;

public class Task18 {
    public static void main(String[] args) {
        /*Задача 18:
        Дадени са два едномерни масива с естествени числа.
        Да се състави програма, която сравнява всички числа с еднакви
        индекси от двата масива и записва в трети масив, по-голямото от
        двете числа.
        Да се изведе съдържанието и на трите масива
        Пример:
        18,19,32,1,3, 4, 5, 6, 7, 8
        1, 2, 3,4,5,16,17,18,27,11
        Изход:
        18,19,32 ,4,5,16,17,18,27,11*/
        int[] firstArr = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] secondArr = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int[] newArray = new int[firstArr.length];
        for (int i = 0; i < newArray.length; i++) {
            if (firstArr[i] > secondArr[i]) {
                newArray[i] = firstArr[i];
            } else {
                newArray[i] = secondArr[i];
            }
        }
        printArrays(firstArr);
        printArrays(secondArr);
        printArrays(newArray);
    }

    private static void printArrays(int[] firstArr) {
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
    }
}

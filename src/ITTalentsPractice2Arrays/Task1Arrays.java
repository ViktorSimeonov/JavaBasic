package ITTalentsPractice2Arrays;

public class Task1Arrays {
    public static void main(String[] args) {
        /*1. Напишете програма, която проверява дали в масив от цели
        числа всички числа са неотрицателни.*/
        int[] array = {1,3,5,-7,9,3,7,9};
        boolean isNegative = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                isNegative=true;
                break;
            }
        }
        /*if(isNegative){
            System.out.println("Има и отрицателни числа");
        }else {
            System.out.println("Всички числа са положителни");
        }*/
        System.out.println(isNegative ? " има и отрицателни числа" : " всички числа са положителни");
    }
}

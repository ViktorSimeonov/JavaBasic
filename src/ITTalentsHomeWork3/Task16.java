package ITTalentsHomeWork3;

public class Task16 {
    public static void main(String[] args) {
   /*     Задача 16:
        Да се състави програма, чрез която предварително въведени 10
        реални числа от интервала се обработват по следния начин:
        1. Извежда съществуващите числа.
        2. Всички елементи със стойност по-малки от -0.231 се заменят със
        сумата от квадрата на поредния им номер + числото 41.25, а всички
        останали елементи се заменят с произведението между самия елемент
        и неговият пореден номер. Поредният номер на първият елемент е 1.
        3. Да се изведат елементите от началния и новообразувания масив.
                Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
        Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25*/
        double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<-0.231){
                newArray[i]=(i+1)*(i+1)+41.25;
            }else {
                newArray[i]=(i+1)*array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%.2f",newArray[i]);
            if(i<newArray.length-1){
                System.out.print(", ");
            }
        }
    }
}

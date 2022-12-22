package ITTalentsHomeWork3;

import java.util.Scanner;

public class Task15 {
    /*Задача 15:
    Да се състави програма, която въвежда в едномерен масив реални
    числа.
    Като изход: програма извежда онези 3 различни числа, чиято
    абсолютна стойност формира максималната обща сума.
    Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
    Изход: 5.1; 6.34; 7.13*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = {-7.13, 0.2, 4.9, 5.1, 6.34, 1.12};

        //first num
        double max1 = Double.MIN_VALUE;
        int max1Index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = Math.abs(array[i]);
                max1Index = i;
            }
        }
        array[max1Index] = 0;
        //second num

        double max2 = Double.MIN_VALUE;
        int max2Index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max2) {
                max2 = Math.abs(array[i]);
                max2Index = i;
            }
        }
        array[max2Index] =0;
        // third num
        int max3Index = 0;
        double max3 = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max3) {
                max3 = Math.abs(array[i]);
                max3Index = i;
            }
        }
        array[max3Index] = 0;
        double[] bigSum = new double[3];
        bigSum[0] = max1;
        bigSum[1] = max2;
        bigSum[2] = max3;

        /*for (int i = 0; i < bigSum.length ; i++) {

        }*/
        if (max1 > max2) {
            if (max1 > max3) {
                bigSum[2] = max1;
                if (max2 > max3) {
                    bigSum[1] = max2;
                    bigSum[0] = max3;
                } else {
                    bigSum[0] = max2;
                    bigSum[1] = max3;
                }
            } else {
                bigSum[2] = max3;
                bigSum[1] = max1;
                bigSum[0] = max2;

            }
        } else {
            if (max1 > max3) {
                bigSum[2] = max2;
                bigSum[1] = max1;
                bigSum[0] = max3;
            } else {
                if (max2 > max3) {
                    bigSum[2] = max2;
                    bigSum[1] = max3;
                    bigSum[0] = max1;
                } else {
                    bigSum[2] = max3;
                    bigSum[1] = max2;
                    bigSum[0] = max1;
                }
            }
        }
        for (int i = 0; i < bigSum.length; i++) {
            System.out.print(bigSum[i]);
            if(i< bigSum.length-1){
                System.out.print("; ");
            }
        }
    }
}

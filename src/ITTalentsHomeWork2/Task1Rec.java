package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task1Rec {
    public static void main(String[] args){
//        Задача 1: Да се изведат на екрана числата от 1 до 100.
        Scanner sc =new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
       /* for (int i = start; i <= end; i++) {
            System.out.print(i+"+");
        }
        print(start,end);*/
        printRec(start,end);

    }
    static void printRec(int n, int m){
        if(n==m+1){
            return;
        }
        System.out.println(n);
        printRec(n+1,m);
    }
    static void print(int n,int m){
        for (int i = n; i <= m; i++) {
            System.out.print(i+"*");
        }
    }
}

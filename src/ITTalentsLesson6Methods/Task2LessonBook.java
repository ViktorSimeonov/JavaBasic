package ITTalentsLesson6Methods;

import java.util.Scanner;

public class Task2LessonBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a= ");
        int a = sc.nextInt();
        System.out.println("Please insert b= ");
        int b = sc.nextInt();
        double result = average(a,b);
        System.out.println(result);
    }
    static double average(int a,int b){
        return ((a+b)*1.0)/2;
    }
}

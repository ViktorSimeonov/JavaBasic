package ITTalentsLesson6Methods;

import java.util.Scanner;

public class Task1LessonBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a= ");
        int a = sc.nextInt();
        System.out.println("Please insert b= ");
        int b = sc.nextInt();
        sum(a,b);
    }
    static void sum(int a, int b ){
        System.out.println("The sum is: "+(a+b));
    }
}

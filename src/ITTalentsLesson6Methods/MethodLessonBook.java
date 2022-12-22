package ITTalentsLesson6Methods;

import java.util.Scanner;

public class MethodLessonBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();

        if(isValid(num)){
            result(num);
        }else {
            error();
        }
    }

    static boolean isValid(int num) {
        boolean valid=false;
        if (num > 0 && num % 3 == 0){
            valid=true;
        }
        return valid;
    }
    static void result(int num){
        System.out.println("The number is: "+num);
        System.out.println("The squared of num is: "+(num*num));
        System.out.println("The cubed of num is: "+(num*num*num));
    }
    static void error(){
        System.out.println("Invalid number");
    }

}

package Function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.ceil(23.05));
        System.out.println(Math.floor(19.78));
        System.out.println(Math.abs(-8));
        // НА СТЕПЕН
        System.out.println(Math.pow(2, 19));
        System.out.println(Math.PI);
        System.out.printf("PI %.04f %n",Math.PI);
        // закръгление математически :)
        System.out.println(Math.round(34.6));
    }


}

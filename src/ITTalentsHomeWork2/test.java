package ITTalentsHomeWork2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0b11100111;
        int b = 0b1100000100;
        int result = a-b;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }

}


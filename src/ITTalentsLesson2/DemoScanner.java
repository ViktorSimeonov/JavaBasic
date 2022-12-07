package ITTalentsLesson2;


import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the side of the square");
        int side = scanner.nextInt();
        int result = side*side;
        System.out.println(result);
    }
}

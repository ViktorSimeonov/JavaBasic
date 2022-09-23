import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*char symbol = 'A';
        int numberOfSymbol = (int)symbol;
        System.out.println(numberOfSymbol);
        symbol = (char) numberOfSymbol;
        System.out.println(symbol);
        */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int stringLength = name.length();
        int sum=0;
        for (int i = stringLength - 1; i >= 0; i--) {
            char letter = name.charAt(i);
            //System.out.print(""+ letter);
            System.out.println((int)letter);
        sum +=(int)letter;

        }
        System.out.println(sum);
    }
}
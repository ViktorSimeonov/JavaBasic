package ITTalentsTests.Strings;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] letters = input.toCharArray();
       // char[] letters = new char[input.length()];
        for (int i = 0; i < letters.length; i++) {

            switch (letters[i]) {
                case 'a':
                    letters[i] = 'A';
                    break;
                case 'b':
                    letters[i] = 'B';
                    break;
                case 'c':
                    letters[i] = 'C';
                    break;
                case 'd':
                    letters[i] = 'D';
                    break;
                case 'e':
                    letters[i] = 'E';
                    break;
                case 'f':
                    letters[i] = 'F';
                    break;
                case 'g':
                    letters[i] = 'G';
                    break;
                case 'h':
                    letters[i] = 'H';
                    break;
                case 'i':
                    letters[i] = 'I';
                    break;
                case 'j':
                    letters[i] = 'J';
                    break;
                case 'k':
                    letters[i] = 'K';
                    break;
                case 'l':
                    letters[i] = 'L';
                    break;
                case 'm':
                    letters[i] = 'M';
                    break;
                case 'n':
                    letters[i] = 'N';
                    break;
                case 'o':
                    letters[i] = 'O';
                    break;
                case 'p':
                    letters[i] = 'P';
                    break;
                case 'q':
                    letters[i] = 'Q';
                    break;
                case 'r':
                    letters[i] = 'R';
                    break;
                case 's':
                    letters[i] = 'S';
                    break;
                case 't':
                    letters[i] = 'T';
                    break;
                case 'u':
                    letters[i] = 'U';
                    break;
                case 'v':
                    letters[i] = 'V';
                    break;
                case 'w':
                    letters[i] = 'W';
                    break;
                case 'x':
                    letters[i] = 'X';
                    break;
                case 'y':
                    letters[i] = 'Y';
                    break;
                case 'z':
                    letters[i] = 'Z';
                    break;


                default:
                    letters[i] = letters[i];
                    break;
            }
        }
       String toPrint = String.valueOf(letters);
        System.out.println(toPrint);
    }
}

package FinalExam;

import java.util.Scanner;
//01. String Manipulator
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")) {
            String command = input[0];
            switch (command) {
                case "Translate":
                    char[] charArr = myString.toCharArray();
                    char toReplace = input[1].charAt(0);
                    char replacemet = input[2].charAt(0);
                    myString = "";
                    for (int i = 0; i < charArr.length; i++) {
                        char currentChar = charArr[i];
                        {
                            if (currentChar == toReplace) {
                                myString = myString + String.valueOf(replacemet);

                            } else {
                                myString = myString + String.valueOf(currentChar);
                            }

                        }
                    }

                    System.out.println(myString);

                    break;
                case "Includes":
                    String subString = input[1];
                    if (myString.contains(subString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    subString = input[1];
                    if (myString.contains(subString)) {
                        int startWithSameSubString = 0;
                        int sizeSubString = subString.length();
                        for (int i = 0; i < sizeSubString; i++) {
                            if (subString.charAt(i) == myString.charAt(i)) {
                                startWithSameSubString++;
                            }
                        }
                        if (startWithSameSubString == sizeSubString) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    } else {
                        System.out.println("False");
                    }


                    break;
                case "Lowercase":
                    myString = myString.toLowerCase();
                    System.out.println(myString);

                    break;
                case "FindIndex":
                    char neededChar = input[1].charAt(0);
                    int lastIndexOfTheChar = 0;
                    for (int i = 0; i < myString.length(); i++) {
                        if (myString.charAt(i) == neededChar) {
                            lastIndexOfTheChar = i;
                        }
                    }
                    System.out.println(lastIndexOfTheChar);
                    break;
                case "Remove":
                    String newString = "";
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);
                    char[] charArrMyString = myString.toCharArray();
                    char currentCharFromMyString;
                    for (int i = 0; i < charArrMyString.length; i++) {
                        //myString = myString + String.valueOf(replacemet);
                        //char[] charArr = myString.toCharArray();
                        //  char toReplace = input[1].charAt(0);
                        currentCharFromMyString = charArrMyString[i];
                        if (i >= startIndex && i < (endIndex+startIndex)) {

                            newString = newString + "";
                        } else {
                            newString = newString + String.valueOf(currentCharFromMyString);

                        }
                    }
                    myString=newString;
                    System.out.println(myString);
                    break;


            }


            input = scanner.nextLine().split(" ");
        }
    }

}

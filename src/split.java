import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "1 2 3 21 25 17";
        String[] userInputArray = userInput.split(" ");
        String input = scanner.nextLine();
        String[] output = input.split("a");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }
}

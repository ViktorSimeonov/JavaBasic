package MidExam23102022;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phoneList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
       while (!command[0].equals("End")) {
           boolean yesExist = false;
           switch (command[0]) {
                case "Add":
                    String phone = command[2];
                    for (int i = 0; i < phoneList.size(); i++) {
                        if (phone.equals(phoneList.get(i))) {
                            yesExist = true;
                        }
                    }
                    if (!yesExist) {
                        phoneList.add(phone);
                    }

                    break;
                case "Remove":
                    phone = command[2];
                    for (int i = 0; i < phoneList.size(); i++) {
                        if (phone.equals(phoneList.get(i))) {
                            phoneList.remove(i);
                        }
                    }

                    break;
                case "Bonus":
                    String[] bonusReplacement = command[3].split(":");
                    String oldPhone = bonusReplacement[0];
                    String newPhone = bonusReplacement[1];
                    for (int i = 0; i < phoneList.size(); i++) {
                        if(phoneList.get(i).equals(oldPhone)){
                            phoneList.add(i+1, newPhone);
                            break;
                        }
                    }

                    break;
                case "Last":
                    phone = command[2];
                    for (int i = 0; i < phoneList.size(); i++) {
                        if (phone.equals(phoneList.get(i))) {
                            phoneList.remove(i);
                            phoneList.add(phone);
                            break;
                        }
                    }
                    break;


            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < phoneList.size(); i++) {
            System.out.print(phoneList.get(i));
            if(i<phoneList.size()-1){
                System.out.print(", ");
            }
        }
    }
}

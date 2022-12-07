package ITTalentsHomeWork1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task13 {
    public static void main (String[] args){
      /*  Задача 13: Да се състави програма, която да отгатне колко е
        студено/топло по въведената температура t в градус Целзий.
                Температурните интервали са:
        – под -20 - ледено студено;
        – между 0 и -20 - студено;
        – между 15 и 0 - хладно;
        – между 25 и 15 - топло;
        – над 25 – горещо.
        – Входни данни: цяло число от интервала [-100..100].
        – Пример: 12
        – Изход: хладно*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете цяло число в интервала [-100..100]");
        int temp = scanner.nextInt();
        if(temp<-20){
            System.out.println("ледено студено");
        } else if (temp<=0) {
            System.out.println("студено");
        } else if (temp<=15) {
            System.out.println("хладно");
        } else if (temp<=25) {
            System.out.println("топло");
        } else  {
            System.out.println("горещо");
        }
    }
}

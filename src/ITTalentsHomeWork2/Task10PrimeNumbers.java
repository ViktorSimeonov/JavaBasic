package ITTalentsHomeWork2;

import java.util.Scanner;

public class Task10PrimeNumbers {
    public static void main(String[] args){
       /* Задача 10: Въведете число от клавиатурата и определете дали е
        просто. Просто число е това което се дели САМО на 1 и на себе
        си.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло число по-голямо от 0");
        int n = scanner.nextInt();
        while ( n<=0){
            System.out.println("Въведено е число извън интервала, моля опитайте пак");
            n=scanner.nextInt();
        }
        int count =0;
        for (int i = 1; i <=n ; i++) {
            if(n % i ==0 ){
              count++;
            }
        }
        if(count==2){
            System.out.println("въведеното число е просто");
        }else {
            System.out.println("въведеното число не е просто");
        }
    }
}

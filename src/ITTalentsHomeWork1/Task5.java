package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        /*������ 5: �������� 3 �������� ����� �� ��������� � �� ������������ �
        �������� ���.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���� ���� ����� a=");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("�������� ����� �������� ���� ����� b=");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("�������� ����� �������� ���� ����� c=");
        int c = Integer.parseInt(scanner.nextLine());
        boolean aIsSmallest = false;
        boolean bIsSmallest = false;

        if(a<b&&a<c){
            System.out.println(a);
            aIsSmallest=true;

        } else if (b<a&&b<c) {
            System.out.println(b);
            bIsSmallest=true;
        } else   {
            System.out.println(c);

        }
        if(aIsSmallest){
            if(b>c){
                System.out.println(c);
                System.out.println(b);
            }else {
                System.out.println(b);
                System.out.println(c);
            }
        } else if (bIsSmallest) {
            if(a>c){
                System.out.println(c);
                System.out.println(a);
            }
            System.out.println(a);
            System.out.println(c);
        }else {
            if(a>b){
                System.out.println(b);
                System.out.println(a);
            }else {
                System.out.println(a);
                System.out.println(b);
            }
        }


    }
}

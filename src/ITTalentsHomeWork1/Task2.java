package ITTalentsHomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){
        /*������ 2: �������� 2 �������� ���� ����� �� ���������. ��������
        ������� ����, �������, ������������, ������� �� ������� �
        ����������� ������� � ������� ���������� � ������������ ����
        ��������� � ���������. �������� ������ � ����� � ������� �������.*/
        Scanner scanner = new Scanner(System.in);
        String percent = "%";
        System.out.println("�������� ���� ���� ����� �:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("�������� ����� ���� ����� b:" );
        int b = Integer.parseInt(scanner.nextLine());
        int sum = a+b;
        System.out.printf("������ �� � � b e: %d+%d=%d%n",a,b,sum);
        int diff = a-b;
        System.out.printf("��������� �� � � b e: %d-%d=%d%n",a,b,diff);
        int multiplication = a*b;
        System.out.printf("�������������� �� � � b e: %d*%d=%d%n",a,b,multiplication);
        int modularDivision = (a%b);
        System.out.printf("������� �� ������� �� � � b e: %d%s%d=%d%n",a,percent,b,modularDivision);
        int division = a/b;
        System.out.printf("������� �� ����������� ������� �� � � b e: %d/%d=%d%n",a,b,division);
        // double
        System.out.println("�������� ���� ����� � ������� ������� x:");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("�������� ����� ����� � ������� ������� y:" );
        double y = Double.parseDouble(scanner.nextLine());
        double sumDouble = x+y;
        System.out.printf("������ �� � � b e: %.2f+%.2f=%.2f%n",x,y,sumDouble);
        double diffDouble = x-y;
        System.out.printf("��������� �� � � b e: %.2f-%.2f=%.2f%n",x,y,diffDouble);
        double multiplicationDouble = x*y;
        System.out.printf("�������������� �� � � b e: %.2f*%.2f=%.2f%n",x,y,multiplicationDouble);
        double modularDivisionDouble = (x%y);
        System.out.printf("������� �� ������� �� � � b e: %.2f%s%.2f=%.2f%n",x,percent,y,modularDivisionDouble);
        double divisionDouble = x/y;
        System.out.printf("������� �� ����������� ������� �� � � b e: %.2f/%.2f=%.2f%n",x,y,divisionDouble);

    }
}

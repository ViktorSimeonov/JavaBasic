package ITTalentsHomeWork2;

public class Task4Rec {
    public static void main(String[] args){
      /*          ������ 4: �� �� ������� �� ������ ������� �� 10 �� 1 � �������
        ���.*/
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        print(10);
    }
    static void print(int num){
        if(num==0){
            return;
        }
        System.out.printf(num+" ");
        print(num-1);
    }
}

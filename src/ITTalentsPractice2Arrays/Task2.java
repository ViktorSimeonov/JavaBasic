package ITTalentsPractice2Arrays;

public class Task2 {
    public static void main(String[] args) {
       /* 2. ��������� ����� �������� �������, ��� ����� ������� �
        ������ � > �� ��������� � < �� ���������. ��������
        ��������, ����� ��������� ���� ����� ����� �� ����� �
        �������.*/
        //int[] array = {8,1,7,2,8,1,6};
        //int[] array = {1,3,2,5,4,8,6};
        //int[] array = {1,3,1,2,3};
        int[] array = {1,3,2,1,3,1,3};
        boolean isToothed =true;
        if(array[0]<array[1]){
        for (int i = 1; i < array.length-1; i+=2) {
                if(array[i-1]<array[i]&&array[i]>array[i+1]){
                }else{
                    isToothed=false;

                }
            }
        }else {
            for (int i = 1; i < array.length-1; i+=2) {
                if(array[i-1]>array[i]&&array[i]<array[i+1]){
                }else{
                    isToothed=false;

                }
            }
        }
        if (isToothed){
            System.out.println("������� �");
        }else {
            System.out.println("�� � �������");
        }
    }
}

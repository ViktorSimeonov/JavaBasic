package ITTalentsHomeWork3;

public class Task17 {
    public static void main(String[] args) {
       /* ������ 17:
        ���� ������ �� ���������� ����� �� �������� �������������� ������,
                ��� �� ���������� � �� ���������� ���������:
        N1 < N2 > N3 < N4 > N5 <..
        ��������� ��������, ����� ��������� ���� �������� � ���������
        ����� ������ �� ����� ���������� ������� ����������.
                ������: 1 3 2 4 3 7
        �����: ��������� ������������ �� �������������� ������ ������*/
        int[] array = {1,3,2,4,3,7};
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
            System.out.println("Toothed");
        }else {
            System.out.println("Not Toothed");
        }
    }
}

package ITTalentsPractice2Arrays;

public class Task3 {
    public static void main(String[] args) {
     /*   3. �������� ��������, ����� �� ����� ����� �� ������� arr �
        ������ ch, ������� �� �����������, ��������� ��� arr �������
        ch. ��� �� �������, ����������� ������� �� ��������. ��� ��,
        ����������� ��������� ������� �� ��� ��������.*/
        char[] array = {'a','b','d','c'};
        char myChar = 'a';
        boolean weFindIt=false;
        int index=0;
        for (int i = 0; i < array.length; i++) {
            //char currentChar = array[i];
            if(myChar==array[i]){
                index=i;
                weFindIt=true;
                break;
            }
        }
        if(weFindIt){
            System.out.println(index);
        }else {
            System.out.println("Null");
        }
    }
}

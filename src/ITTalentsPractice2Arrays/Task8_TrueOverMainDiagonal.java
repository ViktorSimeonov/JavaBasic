package ITTalentsPractice2Arrays;

public class Task8_TrueOverMainDiagonal {
    public static void main(String[] args) {
       /* 8. �������� ��������, ����� �� ������� �� ������ ���������,
        ��������� ���� �� ������� ������� ��� �������� true ���
        ������ ��������.*/
        // i+j = length - 1 ���� � ������ ������ ��������
        boolean[][] table = {
                {true,true,true,false},
                {true,true,true,false},
                {true,true,true,false},
                {true,true,true,false}
        };
        boolean exists = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(i+j <table.length-1){
                    if(table[i][j]){
                        exists=true;
                        break;
                    }
                }
            }
        }
        System.out.println(exists);
    }
}

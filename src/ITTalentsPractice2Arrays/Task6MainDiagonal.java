package ITTalentsPractice2Arrays;

public class Task6MainDiagonal {
    public static void main(String[] args) {
       /* 6. Напишете програма, която за дадена матрица от символи
        отпечатва на екрана елементите, които се намират на главния
        диагонал.*/
        // ГЛАВНИЯ ДИАГОНАЛ Е i=j
        char[][] table = {
                {'y', 'i', 'h', 'o' },
                {'t', 'e', 'h', 'o' },
                {'y', 'i', 't', 'o' },
                {'y', 'u', 'h', 'i' },

        };
        ;
        /*for (int i = 0; i <table.length ; i++) {
            for (int j = 0; j <table[i].length ; j++) {
                if(i==j){
                    System.out.print(table[i][j] +" ");
                }
            }
        }*/
        //or
        for (int i = 0; i < table.length; i++) {

            System.out.print(table[i][i] + " ");

        }
    }
}


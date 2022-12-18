package ITTalentsHomeWork3;

public class Task17 {
    public static void main(String[] args) {
       /* Задача 17:
        Една редица от естествени числа ще наричаме зигзагообразна нагоре,
                ако за елементите и са изпълняват условията:
        N1 < N2 > N3 < N4 > N5 <..
        Съставете програма, която проверява дали въведени в едномерен
        масив редица от числа изпълняват горните изисквания.
                Пример: 1 3 2 4 3 7
        Изход: изпълнява изискванията за зигзагообразна нагоре редица*/
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

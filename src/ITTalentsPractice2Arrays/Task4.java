package ITTalentsPractice2Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*Напишете програма, която сортира (подрежда елементите във
                възходящ ред) масив, съдържащ само 0 и 1.*/
        int[] array = {1,0,0,0,1,1,1};
        int[] newArray = new int[array.length];
        int count0=0;
        int count1=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){
                count0++;
            }else{
                count1++;
            }
        }
        for (int i = 0; i < count0; i++) {
            newArray[i]=0;
        }
        for (int i = count0; i < count0+count1; i++) {
            newArray[i]=1;

        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]+" ");
        }
    }
}

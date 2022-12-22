package ITTalentsLesson6Methods;

public class Task3 {

    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4};
        int[] arr2 ={11,12,13,14,15,16};
        int[] newArray = sumArray(arr1,arr2);
        printArray(newArray);
    }

    private static void printArray(int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }

    static int[] sumArray(int[] arr1,int[] arr2){
        int[] newArray=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i]=arr1[i];
        }
        for (int i = arr1.length; i < arr1.length+arr2.length  ; i++) {
            newArray[i]=arr2[i-arr1.length];
        }
        return newArray;
    }
}

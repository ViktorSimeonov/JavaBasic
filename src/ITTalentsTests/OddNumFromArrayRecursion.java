package ITTalentsTests;

public class OddNumFromArrayRecursion {
    public static void main(String[] args) {
        // return all the odd nums from array bigger then given number X ( use recursion)
        int[] arr = {1, 4, 3, 7, 9, 3, 6, 5, 7, 10, 33, 5};
        int x = 3;
        printOddNumbersBiggerThenX(arr, x, 0,1);
    }

    static void printOddNumbersBiggerThenX(int[] arr, int x, int num,int result) {

        if (num == arr.length - 1) {
            System.out.println();
            System.out.println(result);
            return ;
        }
        if (arr[num] > x && arr[num] % 2 != 0) {
            System.out.print(arr[num]+" ");
           result*=arr[num];
        }
        printOddNumbersBiggerThenX(arr, x, ++num,result);


    }
}

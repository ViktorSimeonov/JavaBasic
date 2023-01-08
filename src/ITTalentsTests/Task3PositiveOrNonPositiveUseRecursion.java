package ITTalentsTests;

public class Task3PositiveOrNonPositiveUseRecursion {
    public static void main(String[] args) {
        int[] input = {3,6,-9,-43,76,-36,76,-77 };
        String posOrNeg = positiveOrNonPositive(input);
        System.out.println(posOrNeg);
    }
    static String positiveOrNonPositive(int[] arr){
       int sumInput =  sumOfAllElements(arr,0,0);
        System.out.println(sumInput);
       if(sumInput/arr.length>0){
           return "Positive";
       }
           return "NonPositive";


    }
    static int sumOfAllElements(int[] arr, int i,int sum ){
        if(i==arr.length){
            return sum;
        }
        sum+=arr[i];
        return  sumOfAllElements(arr,i+1,sum);

    }
    static void sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

    }

}

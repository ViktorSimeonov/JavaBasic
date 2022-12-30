package ITTalentsLesson9Recursion;

public class LifeHackSumArray {
    public static void main(String[] args) {
        int[] arr= {2,7,4,8,9,1};
        System.out.println(sumOrdinary(arr));
        System.out.println(sumHackRec(arr,0,0));
    }
    static int sumHackRec(int[] masiv,int i, int sum){
        if(i==masiv.length){
            return sum;
        }
        sum+=masiv[i];
        return sumHackRec(masiv,i+1,sum);
    }
    static int sumOrdinary(int[] masiv){
        int sum=0;
        for (int i = 0; i < masiv.length; i++) {
            sum+=masiv[i];
        }
        return sum;
    }
}

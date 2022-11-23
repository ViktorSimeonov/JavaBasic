package WhileLoop;

public class HowToSumDigitOfNumber {
    public static void main(String[] args) {
        int bigNumber = 123456;
        int sum=0;
        while (bigNumber>0){
        sum+=bigNumber%10;
        bigNumber=bigNumber/10;
        }
        System.out.println(sum);
    }
}

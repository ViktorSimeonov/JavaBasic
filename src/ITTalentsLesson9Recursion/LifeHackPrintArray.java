package ITTalentsLesson9Recursion;

public class LifeHackPrintArray {
    public static void main(String[] args) {
        int[] arr = {3,5,6,75,45,564};
        print(arr);
    }
    void printRec(int[] masiv,int i){
        if(i==masiv.length){
            return;
        }
        System.out.println(masiv[i]+" ");
        printRec(masiv,i+1);
    }
    static void print(int[] masiv){
        for (int i = 0; i < masiv.length; i++) {
            System.out.print(masiv[i]+" ");
        }
    }
}

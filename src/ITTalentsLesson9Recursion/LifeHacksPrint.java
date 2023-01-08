package ITTalentsLesson9Recursion;

public class LifeHacksPrint {
    public static void main(String[] args) {
        // to print from 5 to 1
        print(9);
    }
    static void print(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        print(x-1);
    }
}

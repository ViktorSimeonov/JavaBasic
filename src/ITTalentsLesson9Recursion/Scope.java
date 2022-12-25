package ITTalentsLesson9Recursion;

public class Scope {
    public static void main(String[] args) {
        String text = "Smile";
        cal(text);
        System.out.println(text);
    }

    private static void cal(String text) {
        text+="yyy";
        //System.out.println(text);
    }
}

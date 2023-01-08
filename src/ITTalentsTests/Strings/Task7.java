package ITTalentsTests.Strings;

public class Task7 {
    public static void main(String[] args) {
        String in = "I love programming.";
        int alf=0;
        int dig = 0;
        int sp = 0;
        for (int i = 0; i < in.length(); i++) {
            char curCh = in.charAt(i);
            if(curCh>='0'&&curCh<='9'){
                dig++;
            } else if ((curCh>='a'&&curCh<='z')||(curCh>='A'&&curCh<='Z')) {
                alf++;
            }else{
                sp++;
            }
        }
        System.out.printf("Alphabets = %d%n",alf);
        System.out.printf("Digit = %d%n",dig);
        System.out.printf("Speciql symbol = %d%n",sp );
        System.out.printf("Total length %d%n",in.length() );
   }
}

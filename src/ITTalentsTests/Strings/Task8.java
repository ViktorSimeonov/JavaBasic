package ITTalentsTests.Strings;

public class Task8 {
    public static void main(String[] args) {
        String in = "I love programming.";
        int vow= 0;
        int con = 0;

        for (int i = 0; i < in.length(); i++) {
            char curr=in.charAt(i);
            if((curr>='a'&&curr<='z')||(curr>='A'&&curr<='Z')){
                if(curr=='a'||curr=='A'||curr=='e'||curr=='E'||curr=='i'||curr=='I'||
                        curr=='o'||curr=='O'||curr=='u'||curr=='U'||curr=='y'||curr=='Y'){
                    vow++;
                }else {
                    con++;
                }
            }
        }
        System.out.printf("Vowel = %d%n",vow);
        System.out.printf("Consonants = %d%n",con);
    }
}

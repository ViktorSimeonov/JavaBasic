package ITTalentsHomework5String;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.SortedMap;

public class MethodsWithString {
    public static void main(String[] args) {
        String text1 = "Hello";
        String text2 = "hello";
        //equals
        System.out.println();
        System.out.println("equals");
        System.out.println(text2.equals(text1));
        // equalsIgnoreCase
        System.out.println("equalsIgnoreCase");
        System.out.println(text1.equalsIgnoreCase(text2));
        System.out.println();
        //compareTo
        System.out.println("compareTo");
        System.out.println(text1.compareTo(text2));

        System.out.println(text2.compareTo(text1));
        System.out.println();
        //split()

        //trim()
        System.out.println(" Split Trim");
        String text = "Hello people and happy new year";
        String[] input = text.trim().split(" ");
        System.out.println(Arrays.toString(input));

        //join()
        System.out.println("Join");
        System.out.println(String.join(" * !!! * ",input));

        // substring
        System.out.println("substring");
        System.out.println(text);
        String newSubString = text.substring(6);
        System.out.println(newSubString);
        String newSubString1 = text.substring(6,18);
        System.out.println(newSubString1);
        String newSubString2 = text.substring(6,28);
        System.out.println(newSubString2);
        System.out.println();

        //replace
        System.out.println("replace");
        String replacedText = text.replace('H','T');
        System.out.println(text);
        System.out.println(replacedText);
        System.out.println();
        String replacedText1 = text.replace("Hello","Marhaba");
        System.out.println(text);
        System.out.println(replacedText1);
        System.out.println();

        //indexOf()
        System.out.println("IndexOf");
        System.out.println("IndexOf");
        System.out.println(text.indexOf("new"));
        System.out.println(text.indexOf("z"));
        System.out.println();
        System.out.println(text.contains("Hello"));

        StringBuilder st = new StringBuilder("Hello Pepe, how are you?");
        System.out.println(st);
        st.insert(5, " und");
        System.out.println(st);
        st.append(" Nice :)");
        System.out.println(st);
        st.delete(5,9);
        System.out.println(st);
        String toCompare = st.toString();
        System.out.println(toCompare);
        String toCompare1 = "Hello Pepe, how are you? Nice :)";
        System.out.println(toCompare1.equals(toCompare));
        System.out.println(toCompare1);
        System.out.println(toCompare);
       /* for (int i = 0; i < toCompare.length(); i++) {
            if(toCompare.charAt(i)==toCompare1.charAt(i)){
                System.out.println("Yes");
            }else {
                System.out.println("NO");
            }
        }*/
      /*  for (int i = 0; i<5; i++) {
            System.out.println("h");
            i--;
        }*/
        System.out.println("split");
        String cat = "cat";
        //"cat".split("(?!^)"
        System.out.println("\"cat\".split(\"(?!^)\"");
        String[] splitCat = cat.split("(?!^)");
        //char[] secondTest = cat.split("(?!^)");
        System.out.println(splitCat.length);
        System.out.println(Arrays.toString(splitCat));
        System.out.println("toCharArray ");
        char[] splitCat1 = cat.toCharArray();
        System.out.println(Arrays.toString(splitCat1));
    }
}

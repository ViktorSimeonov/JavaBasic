package ITTalentsLesson6String;

import java.util.Scanner;

public class StringInfo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "Hello";
        for (int i = 0; i < word.length(); i++) {
            //System.out.print(word.charAt(i)+" ");
            if(word.charAt(i)=='o'){
                System.out.println("we find it 'o' is ");
                System.out.println("At index "+i);
                System.out.println("the third char is : "+word.charAt(2));
            }
        }
        //проверка за броя думи в изречение ще броим празните места
        String text = "Hello I am a text and I come with peace";
        int countWord=1;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==' '){
                countWord++;
            }
        }
        System.out.println("the words are: "+countWord);
        int a = 5;
        int b = 4;
        //the result is:54
        System.out.println("the result is:"+a+b);
        //the result is:9
        System.out.println("the result is:"+(a+b));
        // Stream Pool
        String x = "Sun";
        String y = "Sun";
        // сравнява адресите а това са референции към един и същи стринг в String pool
        if(x==y){
            System.out.println("the addresses are the same");
            System.out.println();
        }
        x=x+"test";
        System.out.println(x);
        System.out.println(y);
        if(x==y){
            System.out.println("the addresses are the same");
            System.out.println();
        }else {
            System.out.println("they are different");
        }
        //when we create a variable with new then the variable is not in String Pool it stays in Heap
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        if(str1==str2){
            System.out.println("Using new String is making magic");
        }else {
            System.out.println("Even the addresses are different");
        }
        if(str1.equals(str2)){
            System.out.println("Use equals for comparing String !!!!!!! Always");
        }
        //compareTo() връща int като сравнява лексикографски низовете
        //ако са равни връща нула
        System.out.println(str1.compareTo(str2));
        str1+="z";
        str2+="a";
        // това ще върне разликата в ASCI стойностите от z ( 122) до a ( 97) a именно 25
        System.out.println(str1.compareTo(str2));
        //ако разменим местата то резултата ще е отрицателно число
        System.out.println(str2.compareTo(str1));
        //Method split
        String song = "  we all leaving in the yellow submarine  ";
        String[] splitSong = song.split(" ");
        System.out.println("print using Method printStringArray");
        printStringArray(splitSong);
        for (String s : splitSong) {
            System.out.print(s+" delimiter ");
        }
        String joinedSong = String.join("; ",splitSong);
        System.out.println();
        //Substring
        String subStringSong = song.substring(6);
        System.out.println(subStringSong);
        String subStringSong1 = song.substring(6,17);
        System.out.println(subStringSong1);
        CharSequence subStringSong2 = song.subSequence(10,20);
        System.out.println(subStringSong2);
        // replace
        String newSong = song.replace("yellow","green");
        System.out.println(newSong);
        // trim премахва празните пространства пред и след текста
        System.out.println(song.trim());
        //indexOf() връща индекаса на подаденото в скобите :)
     }

    static void printStringArray(String[] str1){
         for (int i = 0; i < str1.length; i++) {
             System.out.print(str1[i]);
             if(i< str1.length-1){
                 System.out.print(" :!!!!!!: ");
             }
         }
         System.out.println();
     }
}

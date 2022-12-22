package ITTalentsLesson6Methods;

public class DemoMethod {
    public static void main(String[] args) {

        hiHowAreYou();
        String name ="viki";
        hiHowAreYouName(name);
        greet();
    }
        // declaration of a method
    /* <return type > <name > (<input parameters>){
    <body>
    }
    1. kakwo prawi metoda ? - > ime
    2. kakwo iziskwa za da go naprawi ?-> input parameters
    3. kakwo wrashta, sled kato go naprawi -> return type
    4. kak go prawi ?-> body
    5.vrashta li ? ->

    * */
    static void greet(){
        System.out.println("Hi");
        System.out.println("How are you Krasi");
    }
    private static void hiHowAreYouName(String name) {
        System.out.println("Hi");
        System.out.println("How are you " +name);
    }

    private static void hiHowAreYou() {
        System.out.println("Hi");
        System.out.println("How are you ");
    }
}

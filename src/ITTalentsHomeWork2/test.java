package ITTalentsHomeWork2;

public class test {
    public static void main(String[] args) {
      /*  int i = 123;
        int units= i % 10;
        i = i / 10;
        int tens = i % 10;
        i = i / 10;
        int hundred = i;*/
        int i = 123;
        int currentNum = i;
        int units = currentNum % 10;
        currentNum = currentNum / 10;
        int tens = i % 10;
        currentNum = currentNum / 10;
        int hundred = currentNum;
        if (units != tens || tens != hundred||units!=hundred) {
            System.out.println(i);
        }
        System.out.println(units);
        System.out.println(tens);
        System.out.println(hundred);
    }
}

package ITTalentsHomework5String;

public class Questions {
    //task6 why string method have to be not void
    public static void main(String[] args) {
        String number = "135";
        int ourNumber=0;
        int currentNumber =0;
        for (int i = 0; i<number.length(); i++) {
            switch (number.charAt(i)){
                case 48:
                    currentNumber=0;
                    break;
                case 49:
                    currentNumber=1;
                    break;
                case 50:
                    currentNumber=2;
                    break;
                case 51:
                    currentNumber=3;
                    break;
                case 52:
                    currentNumber=4;
                    break;
                case 53:
                    currentNumber=5;
                    break;
                case 54:
                    currentNumber=6;
                    break;
                case 55:
                    currentNumber=7;
                    break;
                case 56:
                    currentNumber=8;
                    break;
                case 57:
                    currentNumber=9;
                    break;

            }
            ourNumber+=currentNumber*Math.pow(10,number.length()-1-i);
        }
        System.out.println(ourNumber);
    }
}

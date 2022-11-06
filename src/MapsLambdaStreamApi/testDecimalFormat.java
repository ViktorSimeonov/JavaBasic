package MapsLambdaStreamApi;

import java.text.DecimalFormat;

public class testDecimalFormat {

    public static void main(String[] args) {
        double number = 8.054300000001;
        System.out.println(number);
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.printf("%s",df.format(number));
    }

}

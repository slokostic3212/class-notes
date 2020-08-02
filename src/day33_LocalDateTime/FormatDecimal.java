package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimal {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        double a = 22/7.0;

        System.out.println(a);//3.14285

        System.out.println( df.format(a) );//3.14 cuz pattern set to 0.00

       // System.out.println( m.format(a));

        // 6.678453212222
        //System.out.println( m.format(6.6784532));
    }
}

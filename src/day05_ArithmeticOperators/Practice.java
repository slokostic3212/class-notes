package day05_ArithmeticOperators;

public class Practice {

    public static void main(String[] args) {

        int a = 5 + 2 *4; // 13
        System.out.println(a);

        int b = 10 / 2 - 3; // 2
        System.out.println(b);

        int c = 8 + 12 * 2- 4; // 28
        System.out.println(c);

        int d = 4 + 17 % 2 - 1;// remainder:
            // 4 + 1 - 1 = 4
        System.out.println(c);

        System.out.println( 5 + 5 / 5);// 6
        System.out.println( (5+5)  / 5  );
         //                    10 / 5 = 2

        System.out.println(  (5+5) / 5.0 );//2.0

        int y = 5*2 /3 + ( 4 * 3);
        // 5 * 2 / 3 + 12
        // 10 / 3 + 12
        // 3 + 12 = 15
        System.out.println(y);

        int z = 10/3; //change to below from 10/3.0
        double t = 10/3.0;


        System.out.println(t);


    }


}

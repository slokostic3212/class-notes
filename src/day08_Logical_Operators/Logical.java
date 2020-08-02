package day08_Logical_Operators;

public class Logical {

    public static void main(String[] args) {
        //!: returns opposite boolean
        boolean r1 = 9 > 7; //true
        boolean r2 = !r1;//change r1 to !r1

        System.out.println(r1+ " : "+r2);

        System.out.println( !true );
        System.out.println( !true );

        boolean r3 = !false == true;
        //              true == true

        System.out.println(r3);

        boolean r4 = true == !true;

        // and or logic

        boolean r5 = 9 > 5 && 9 > 10;
        //9>5 true and 9>10 false   true && false to return true both must be true



    }
}

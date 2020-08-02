package day07_Unary_Shorthand;

public class Unary {

    public static void main(String[] args) {

        System.out.println( -1 + -10);
                        //  -1 -10 == -11

        System.out.println(-1 -  -10);
        //                  -1 + 10 == 9


     //DECREMENT

     //--a;

        int a = 20;
        a = a-1;
        System.out.println(a);//19

       // --a;

        // ++

            int b = 10;
            b = b +1;// b = 11;
        ++b;

        System.out.println(b);

        int x = 100;

        System.out.println( ++x );//101

        int y = 200;

        System.out.println( --y );//199

        int z = 80;

        System.out.println( ++z );//81

        System.out.println( --z);//80 because of the above step

       // examples tasks

       x = 2;
       y= x++;//2
        System.out.println(y);//2

        System.out.println(x++);//3

        System.out.println(--x);//3

       // System.out.println(y);//8 when x = 8 and y = x-- ==> 8 7 7 8


        // int a = 1;
        // a = -a-- + a++ / -a-- * --a;

        //System.out.println(a);//-1

         //int a =;
        // a = -a-- + a++ / -a-- * --a;
        //System.out.println(a);//

           // int a = 50;
           // a = --a +a++ + a-- + a++;
            //System.out.println(a);//197

        //int x = 4;
        //int y = x *4 - x++;
        //System.out.println(y);

        System.out.println("=================================");




    }
}



package Office_Hours.Practice_06_17_2020;

public class Post_VS_Pre {

    public static void main(String[] args) {

        int a = 300;
        System.out.println( ++a );// a = 301
        System.out.println( ++a );// a = 302 becuz mem has a value as 301

        int b = 50;
        System.out.println( --b);// b = 49
        System.out.println( --b);// b = 48

        System.out.println("==========================================");

        int x = 40;
        System.out.println( x--);// 40 because this current value of 40 then needs to pass
                                 //current value then it will decrease by 1
        System.out.println( x); //39
        System.out.println( x--);// 39 current value is 39 so it prints 39 then it will dec by 1
        System.out.println( x );// 38

        int y = 60;
        System.out.println( y++);// 60
        System.out.println( y );// y = 61

        System.out.println( y++ );// 62
        System.out.println( y );


    }
}

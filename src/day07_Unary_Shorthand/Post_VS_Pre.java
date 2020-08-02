package day07_Unary_Shorthand;

public class Post_VS_Pre {

    public static void main(String[] args) {
        int a = 10;
        System.out.println( ++a);//11
        System.out.println(a);//11


        System.out.println("==================================");

        int b = 10;
        System.out.println( b ++ ); //10
        System.out.println(b);//11

        System.out.println("================================");

        int c = 25;
        int d = c++;// d = 25
        // d = ? c= // c = 26

        System.out.println(c);
        System.out.println(d);


        System.out.println("=============================");

        int e = 25;
        c++;

        System.out.println(e);//26

        System.out.println("==================================");

        int x = 8;
        x--;//8 then decreases value by 1 = 7

        int y = x--; // y = 8
        System.out.println(y);//7
        System.out.println(x);//6

        System.out.println("============================================");

        int A = 1; //A=0 THEN CHANGES TO A=1 THEN DECREASED BY 1 > A =0 THEN DECREASED IMMEDIATELY =  -1
        A = -A-- + A++ / -A-- * --A;

   //A =     -1  + 0   /  -1  *  -1
   //A =     -1  + 0   *  -1
   //A =     -1  + 0 = -1

        System.out.println(A);//-1

        System.out.println("========================================");

        int AA = 1; //A=0 THEN CHANGES TO A=1 THEN DECREASED BY 1 > A =0 THEN DECREASED IMMEDIATELY =  -1
        AA = -AA-- + AA++ / -AA-- * --AA;

        //A =     -1  + 0   /  -1  *  -1
        //A =     -1  + 0   *  -1
        //A =     -1  + 0 = -1

        System.out.println(AA);//-1


        System.out.println("===========================");

        int B = 50;// B = 49 B==PASSES CURRENT VALUE OF 49 THEN INCREASE VALUE BY 1 = B = 50 THEN B-- PASS CURENT VALUE
            B = --B+ B++ + B-- + B++;                    //B = 50 THEN DECREMENT GIVING B VALUE OF 49

    //B =   49 + 49 + 50 + 50 // 197


        System.out.println(B);

        System.out.println("=============================");

        int X = 4;
        int Y = X * 4 - X++;

      // Y = 4 * 4 = 16

        System.out.println(Y);// 12




    }


}

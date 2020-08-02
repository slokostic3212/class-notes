package day08_Logical_Operators;
/* 3. manually calculate the following code fragements:
         1. int a = 200;
         int b = -a++ + - --a * a-- % 2
         b = ?
         2. int x = 300;
         int y = 400;
         int z = x + y - x * y +x / y;
*/


public class Post_Pre {

    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2;// 200 -201 199

        //b= -200 + -200 * 200 % 2
        // b = -200 - 40000 % 2
        // b = -200 - 0
        //b = -200

        // first pass current value = 200
        // next change variable by 1 a = 201=
        // pass current value a =200  then -- 199

        System.out.println(b);// -200
        System.out.println(a);


        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        //z 300 + 400 - 300 * 400 + 300 / 400
        //z 300 + 400 -120000 + 300 /400 (0.75)
        //z -119300

        System.out.println(z);


    }

}

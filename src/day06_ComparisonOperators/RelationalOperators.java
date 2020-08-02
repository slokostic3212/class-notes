package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 > 9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println(r2);

        // >=
        boolean r3 = 87 >= 85; // because one of the conditions are true so will get true

        boolean r4 = 877 >= 878;// get false if neither condition is true
        System.out.println(r4);

        //<=
        boolean r5 = 200 <= 300;
        System.out.println(r5);

        // == stands for equal
        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Muhtar";// if Good Guy noted would be false would get false statement
        System.out.println(r8);

        boolean r9 = "muhtar" == "muhtar";// not same data type
        System.out.println(r9);

        // boolean r10 = "123" == 123;

        //!=
        boolean r11 = "MuHTAR" != "Bad Guy";
        System.out.println(r11);

        boolean r12 = true != false;
        System.out.println(r12);

        boolean result1 = 'A' == 65;// because A = 65 in ASCII 'A' == 65+1+2 get false
        System.out.println(result1);

        boolean result2 = 100 == 100.0;// true but false once decimal increases
        System.out.println(result2);

        boolean result3 = 10 == 10.9999999;// make this true buy casting (int) 10.9999 gives 10 nowit will be true
        System.out.println(result3);

        int number = 101;
        boolean even = number%2 == 0; // opp condition is odd
        boolean odd = number%2 != 0;

        System.out.println(even);
        System.out.println(odd);








    }



}

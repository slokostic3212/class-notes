package day31_Recap;



public class Methods_Practice {
    // ck max number btw x-numbers 2nums needs 2 parameters 3 needs 3

    public static void main(String[] args) {//main method == runs our code

        max(10, 20);// a b are the parameters names noted below
        // only give argument in thesse parenthesis
       // max2(10, 20);

        int b = max2(10, 20);
        System.out.println( max2(10, 20));
    }


    public static void max(int a, int b) {
        int max = a > b ? a : b;// can only use this here cuz of void
        System.out.println(max);


    }

    public static int max2(int a, int b) {

        return ( a > b ? a : b);
    }
}



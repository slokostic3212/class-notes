package day21_Loops;
/*
write a program that can divide two numbers without using / & % operators and returns the division and remainder

            ex:
                input:  10
                        3

                output: 3 with a remainder of 1

                10/3 = 3

                10 - 3 = 7
                7 - 3 = 4
                4 - 3 = 1


 */

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 20;//20
        int b = 0;//0

        if(b == 0){
            System.out.println("Invalid Input"); //
            System.exit(0);// forcefully terminating the proigram
         }

        int count = 0;// inc count by 1 for each time loop is executed

        while( a >= b ){
            a -= b;// need to count how many times while loop executed
            count++;
        }
        //System.out.println(count);// 3 this is the divison
       // System.out.println(a);

        System.out.println(count+" with a remainder of " +a); // the new print statement 5 w remainder of 0 if a = 15

    }
}

package day07_Unary_Shorthand;
/* program that can verify if a number is positive, negative, 0
number = 120;
output:
    120 is a positive number? true
    120 is a negative number? false
    120 is zero? false
 */

public class Positive_Negatove_0 {

    public static void main(String[] args) {
        int  number = 120;
        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        System.out.println(number + " is a positve number? " + positive);
        System.out.println(number + " is a negative number? " + negative);
        System.out.println(number + " is zero? " + zero);


       int num = 100;
       boolean pos = num > 0;
       boolean neg = num < 0;
       boolean neither = num == 0;

        System.out.println(num + " is positive? " + positive);
        System.out.println(num + " is negative?" + negative);
        System.out.println(num + " is zero? " + zero);









        ;




    }
}

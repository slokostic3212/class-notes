package day22_NestedLoop;
/*
 *
 **
 ***
 ****
 *****
 ******
 ******* // horizontal line designed by outer loop

 *******
 ******
 *****
 ****
 ***
 **
 *

 */

public class Nested_Loop4 {
    public static void main(String[] args) {

        for (int j = 1; j <= 7; j++){// this loop respons for printing each line of stars
                                       // 1 2 3 4 5 6 7

            for (int k = 1; k <= j; k++){//respons for print * long ** execution of k is dependent on j
                                        //  1 2 3 4 5 6 7
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==============================================");

        for (int j = 7; j >= 1; j--) {

            for (int k = j; k >= 1; k--) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}

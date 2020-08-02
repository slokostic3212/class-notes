package day21_Loops;

import java.util.Scanner;

/*
1. write a program that asks user to enter 5 numbers and retuns the maximum number
 */
public class MaxNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;// 10 20 30
                             // now the -214 is not longer max number 1st execution
                             // now 20 is greater and will be assigned and if not it will not be assigned 2nd time
                             // now 30 is greated      3rd time
                             // now 20 will not get assigned cuz its not greater than 30

        for (int i = 10; i <= 50; i += 10){ // ; states its ended
                // if statement needs to be repeated 5 x's so it needs to be in loop
            System.out.println("Enter a number");
            int num = scan.nextInt();// needs to repeat 5 xs so placed in body of loop
                                        // user entered 10 20 30 20   20 5 10 30 3
                                        // 20 after 1st user input
                                        // 5 is not greater than 20 not assigned to max
                                        // only the greater number will get assigned

            if( num > max ){// whichever user number is greater will be assigned to the max
                max = num;
            }

        }
        System.out.println("Max number: "+ max);

    }
}

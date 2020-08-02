package day21_Loops;
/*
 2. write a program that asks user to enter 5 numbers and returns the minimum number

 */

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 999999999; //2147483647 or give

        for (int i = 5; i <= 5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();//10 20 30 40 50   50 10 4 3

            if( num < min){
                min = num;
            }

        }
        System.out.println("Minimum number: "+min);

    }
}

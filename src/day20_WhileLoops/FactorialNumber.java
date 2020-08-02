package day20_WhileLoops;
/*
2 Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double result = 1; // find factorial number and put inthis result = need to multiply 0chgs to 1
                        // if multiplied by number get 5 *4 =20 *3 = 60 *2 = 120 * 1 == 120 chg to dbl toget lgr num
        for (int i = n; i >=1; i--){

        //for (int i = 5; i >= 1; i -= 1) { // no iterator keep repeating value will be 5 4 3 2 1 // chang to scannextint
            result *= i;
        }
        System.out.println(result);
    }

}

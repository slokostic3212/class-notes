package day19_ForLoop;
/*
7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
 */

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int sum = 0;

        if(num > 0){
            for (int i = 1; i <= num; i++){
                //sum = sum +1;
                sum += i;
            }
            System.out.println(sum);//prints if user number is > 0

        }else{
            System.out.println("Invalid Entry");
        }

    }


}

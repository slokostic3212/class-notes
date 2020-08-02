package day21_Loops;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -9999999;// any user entered input WILL B GREATER than -999999
        int min = 99999999;// anu user enteerd input WILL B LESS than 999999

        for (int i = 1; i<= 5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }

        }
        System.out.println("Maxinum number is: "+max);
        System.out.println("Minimum number is: "+min);
    }
}

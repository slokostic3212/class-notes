package day34_WrapperClasses;

import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;//variable that contains max value
        System.out.println(a);//2147483647

        byte b = Byte.MAX_VALUE;
        System.out.println(b);// 127

        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);//-2147483648

        System.out.println("=================================================");

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;//10 chgs to 15
        int min = Integer.MAX_VALUE;
        for ( int i =1; i <= 5; i++ ){
            System.out.println("Enter a number");
            int n = scan.nextInt();// 10 15 5 12 0

            if( n > max ){
                max = n;

            }
            if( n < min){
                min = n;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min; "+min);
    }

}

package day12_Switch_Scanner;
/*
write a program that can ask user to enter a number
	if number is odd print: "odd number"
	otherwise print: "even number"

 */

import java.util.Scanner;

public class UserInput_Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");

            double num = scan.nextDouble();

            String result = (num % 2 == 0)    ? num + " Even" : num + " Odd";

        System.out.println(result);
    }
}

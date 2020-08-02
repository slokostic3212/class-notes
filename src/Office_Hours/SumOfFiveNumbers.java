package Office_Hours;
/*
 2. write a program that can ask the user enter a number for five times and the returns the sum of those five numbers
 */

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;// need only variable for sum to repeat = =  add into sum w additon assignment
                    // 10 20 30 40 50

        for (int i = 10; i <= 50; i += 10){// can change 50 to 10000

            System.out.println("Enter a number: ");// need to repeat print statement
            int num = scan.nextInt();// want to find the sum 10 20 30 40 50
            sum += num; // 10 20 30 40 50
        }
            System.out.println(sum);



    }

}

package day23_Arrays;

import java.util.Scanner;

/*1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the answer is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter

            HINT: nested loop task, outer loop need to be an infinite loop
*/
public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){// use while for infi loop // outer loop exits when not true

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 + num2;

            System.out.println(result);// needs to go here to print correctly

            System.out.println("Do you want to continue");// user says yes or no or another user answer
            String a = input.next().toLowerCase();// need to get answer in this variable

            while ( !(a.equals("yes") || a.equals("no"))   ){// chg to while from if
                // while user gives invalid anw repeat till get valid answer
                // need the (  ) grouping
                // while answer is valid it ane it will exit while loop yet outer loop will still be executed
                // with the above statements
                // inner loops leaves if its valid
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }

                if (a.equals("no")){

                    break;// enter 10 20 error - statement goes aboove
                    //  no response is a bug chng to == .toLowercase
                    // what can i do if user gives other than yes no - need if
                    // all you want to do is exit the statement
                }

        }
        System.out.println("Thanks for using Cybertek's Calculator");

        System.exit(0);
       /* System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1 + num2;

        System.out.println("Do you want to continue");// user says yes or no or another user answer
        String a = input.next();// need to get answer in this variable
        */

    }
}

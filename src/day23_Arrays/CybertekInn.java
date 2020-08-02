package day23_Arrays;
/*
2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculates the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter

            HINT: nested loop task, outer loop need to be an infinite loop
 */

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class CybertekInn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Inn");

        int total = 0;

    while (true){
        System.out.println("Please choose from the following: ");
        System.out.println("1. King Bed: $120");
        System.out.println("2. Queen Bed: $100");
        System.out.println("3. Single Bed: $80");
        int option = scan.nextInt();

        switch (option){
            case 1: total += 120;
            break;
            case 2: total += 100;
            break;
            case 3: total += 80;
            default:
                System.out.println("Get Out");
                System.exit(0);



         }
        System.out.println("do you want to reserve another room");
        String a = scan.next().toLowerCase();

        if (  !(a.equals("yes") || a.equals("no") )){// chg to while to repeat while answ is invalid loop continues
            System.out.println("Invalid, Please re-enter");
            System.out.println("do you want to reserve another room");
            a=scan.next().toLowerCase();
        }

        if(a.equals("no")){
            break;
        }
    }

        System.out.println("Your total price is $"+total);
    }


}

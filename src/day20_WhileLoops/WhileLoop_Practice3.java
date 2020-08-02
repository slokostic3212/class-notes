package day20_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "Cybertek123";
        System.out.println("Enter your password");
        String input =       scan.nextLine();

        while (!input.equals(password)){// gets executed only once - needs to be repeated till get correct answer
            // so we need to use while loop change if to while
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }
        System.out.println("Logged in");// if we have 3 chances to log in this statement needs to go somewhere else
    }

}

package day22_NestedLoop;

import java.util.Scanner;

public class Credentials {
    /* user name : cyber
       password: tek123
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        int attempt = 0;

        while( !(u.equals("cyber") && p.equals("tek123")) ){// gets executed infini times*

            if(attempt == 3){
                System.out.println("Your account is locked");
                System.exit(0);
            }

            System.out.println("Invalid user name or passord, Please re-enter");
            System.out.println("Enter your user name");
            u= scan.next();

            System.out.println("Enter your password");
            p = scan.next();

            attempt++;
        }


        System.out.println("Logged in");// will give infi attempts need to limit to 3 need a variable to count
    }
}

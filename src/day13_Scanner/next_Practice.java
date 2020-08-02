package day13_Scanner;

import java.util.Scanner;

public class next_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// slo kostic

        System.out.println("Enter your first name: ");// slo
        String firstName = scan.next();//slo taken from memory above

        scan.next(); // by adding this kostic will go here and then you can add the gender -  for one-time use

        System.out.println("Enter your gender: ");// to gender
        String lastName = scan.next();// kostic this will take what is left from memory ==> gender reported as
                                        // kostic
                                        // automatically takes what is left after first
        //now no longer has anything in memory and can now put ingender

        String fullName = firstName+ " "+lastName;
        System.out.println("Full name is: "+fullName);
    }
}

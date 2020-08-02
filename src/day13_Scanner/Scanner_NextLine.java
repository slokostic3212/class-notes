package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");// to enter full company name
          String fullName =  scan.nextLine();

        System.out.println("Enter your company name: ");

        System.out.println("Full name: "+fullName);


    }
}

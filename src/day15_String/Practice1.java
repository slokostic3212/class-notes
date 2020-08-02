package day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // write a program that asks user to enter first name
        //                                         last name
        //                  print intials of the person

        Scanner input = new Scanner(System.in);
        String name = "Cybertek School";// change to is a great place from cybertek schools
        System.out.println("Enter your first name: ");
        String firstName = input.next(); // Cybertek
        char ch1 = name.charAt(0);

        System.out.println("Enter your last name: ");

        String lastName = input.next();
        char ch2 = name.charAt(5);

        System.out.println("Your initial is: "+ch1+"."+ch2);

        System.out.println("===================================");

        //length ==> int
        int l = name.length();
        System.out.println(l);

        int lastIndexNumber = name.length() - 1;

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        System.out.println("====================================");

        // concat(Str)
        String schoolName = "Cybertek";
            schoolName = schoolName.concat(" School"); // "Cybertek School"

        System.out.println(schoolName);

        String r1 = "Cybertek"+1234+'A'+true;
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");
        System.out.println(r2);






    }
}

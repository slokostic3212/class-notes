package day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");//"Cybertek"

        String firstName =    scan.next();

        System.out.println("Enter your last name: ");//"School"
        String lastName =    scan.next();

        //String fullName = firstName.concat(" ".concat(lastName) ); // "CybertekSchool"
        String fullName = firstName+" "+lastName;

        System.out.println("Your full name is: "+fullName);

        // cahnge toLowerCase():

        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();// "cybertek school";
        System.out.println(name1);

        //toUpperCase():

        String name2 = "slo";
        name2 =name2.toUpperCase();// "SLO"

        System.out.println(name2);// converts text to lower case

        // trim();
        String p = "    Cybertek School   ";
           p=  p.trim();// "Cybertek School"; // need to assign p is now refed to new string

        System.out.println(p);


    }
}
